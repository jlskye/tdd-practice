package tdd.learn.card.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tdd.learn.card.user.entity.CardEntity;

@Repository
public interface CardsEntityRepository extends JpaRepository<CardEntity, String> {
    CardEntity getCardsById(String id);
}
