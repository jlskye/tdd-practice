package tdd.learn.card.user.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import tdd.learn.card.user.entity.Card;

@RequiredArgsConstructor
@Component
public class CardsRepository {
    private CardsEntityRepository cardsEntityRepository;

    public Card getCardById(String cardNo) {
        return cardsEntityRepository.getCardsById(cardNo);
    }
    public Card saveCard(Card card) {
        return cardsEntityRepository.save(card);
    }

    public void deleteAll() {
        cardsEntityRepository.deleteAll();
    }
}
