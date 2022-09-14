package tdd.learn.card.user.repository;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import tdd.learn.card.user.entity.CardEntity;
import tdd.learn.card.user.model.Card;

@RequiredArgsConstructor
@Component
public class CardsRepository {
    private CardsEntityRepository cardsEntityRepository;
    private ModelMapper mapper;

    public Card getCardById(String cardNo) {
        return mapToModel(cardsEntityRepository.getCardsById(cardNo));
    }
    public Card saveCard(CardEntity card) {
        return mapToModel(cardsEntityRepository.save(card));
    }

    public void deleteAll() {
        cardsEntityRepository.deleteAll();
    }

    private Card mapToModel(CardEntity cardEntity) {
        Card card = mapper.map(cardEntity, Card.class);
        return card;
    }

    private CardEntity mapToEntity(Card cardDto) {
        CardEntity card = mapper.map(cardDto, CardEntity.class);
        return card;
    }
}
