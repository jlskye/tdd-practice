package tdd.learn.card.user.repository;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import tdd.learn.card.user.entity.Card;

class CardsEntityRepositoryTest extends AbstractIntegrationTest{
    @Autowired
    private CardsEntityRepository cardsEntityRepository;

    @BeforeEach
    void setUp() {
        Card card = new Card("152110", "111111", "00");
        this.cardsEntityRepository.save(card);
    }

    @AfterEach
    void cleanUp() {
        this.cardsEntityRepository.deleteAll();
    }

    @Test
    void should_retrieve_card_by_id() {
        String id = "152110";
        Card card = cardsEntityRepository.getCardsById(id);
        Assertions.assertThat(card.getCardStatus()).isEqualTo("00");
    }
}