package tdd.learn.card.user.repository;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import tdd.learn.card.user.entity.AuditEntity;

import static org.assertj.core.api.Assertions.assertThat;

class AuditEntityRepositoryTest extends AbstractIntegrationTest {
    @Autowired
    private AuditEntityRepository auditEntityRepository;

    @BeforeEach
    void setUp() {
        AuditEntity audit = new AuditEntity("152110", 1);
        auditEntityRepository.save(audit);
    }

    @AfterEach
    void cleanUp() {
        auditEntityRepository.deleteAll();
    }

    @Test
    void should_retrieve_audit_by_id() {
        AuditEntity audit = auditEntityRepository.getAuditById("152110");
        assertThat(audit.getErrorTime()).isEqualTo(1);
    }
}