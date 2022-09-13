package tdd.learn.card.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tdd.learn.card.user.entity.Card;

@Repository
public interface CardsEntityRepository extends JpaRepository<Card, String> {
    Card getCardsById(String id);
}
