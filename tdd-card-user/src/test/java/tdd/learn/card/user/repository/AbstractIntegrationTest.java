package tdd.learn.card.user.repository;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.utility.DockerImageName;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)
public abstract class AbstractIntegrationTest {
    private static final PostgreSQLContainer POSTGRES_SQL_CONTAINER;

    static {
        POSTGRES_SQL_CONTAINER = new PostgreSQLContainer<>(DockerImageName.parse("postgres:13.1-alpine"));
        POSTGRES_SQL_CONTAINER.start();
    }

    /**
     * # POSTGRESQL Connection Properties for Testcontainers overrided by DynamicPropertyRegistry
     * spring.datasource.url=
     * spring.datasource.username=
     * spring.datasource.password=
     * @param dynamicPropertyRegistry
     */
    @DynamicPropertySource
    static void overrideTestProperties(DynamicPropertyRegistry dynamicPropertyRegistry) {
        dynamicPropertyRegistry.add("spring.datasource.url", POSTGRES_SQL_CONTAINER::getJdbcUrl);
        dynamicPropertyRegistry.add("spring.datasource.username", POSTGRES_SQL_CONTAINER::getUsername);
        dynamicPropertyRegistry.add("spring.datasource.password", POSTGRES_SQL_CONTAINER::getPassword);
    }
}
