package tdd.learn.card.user.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import tdd.learn.card.user.entity.Card;

@RequiredArgsConstructor
@Component
public class CardsRepository {
    private CardsEntityRepository cardsEntityRepository;

    public Card getCardById(Long cardNo) {
        return cardsEntityRepository.getCardsById(cardNo);
    }

    public void deleteALl() { cardsEntityRepository.deleteAll();}
}
