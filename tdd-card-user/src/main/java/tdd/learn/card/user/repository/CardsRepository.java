package tdd.learn.card.user.repository;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import tdd.learn.card.user.entity.Card;
import tdd.learn.card.user.model.CardDto;

@RequiredArgsConstructor
@Component
public class CardsRepository {
    private CardsEntityRepository cardsEntityRepository;
    private ModelMapper mapper;

    public CardDto getCardById(String cardNo) {
        return mapToDto(cardsEntityRepository.getCardsById(cardNo));
    }
    public CardDto saveCard(Card card) {
        return mapToDto(cardsEntityRepository.save(card));
    }

    public void deleteAll() {
        cardsEntityRepository.deleteAll();
    }

    private CardDto mapToDto(Card card) {
        CardDto cardDto = mapper.map(card, CardDto.class);
        return cardDto;
    }

    private Card mapToEntity(CardDto cardDto) {
        Card card = mapper.map(cardDto, Card.class);
        return card;
    }
}
