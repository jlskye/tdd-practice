package tdd.learn.card.user.repository;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import tdd.learn.card.user.entity.CardEntity;
import tdd.learn.card.user.model.CardDto;

@RequiredArgsConstructor
@Component
public class CardsRepository {
    private CardsEntityRepository cardsEntityRepository;
    private ModelMapper mapper;

    public CardDto getCardById(String cardNo) {
        return mapToDto(cardsEntityRepository.getCardsById(cardNo));
    }
    public CardDto saveCard(CardEntity card) {
        return mapToDto(cardsEntityRepository.save(card));
    }

    public void deleteAll() {
        cardsEntityRepository.deleteAll();
    }

    private CardDto mapToDto(CardEntity card) {
        CardDto cardDto = mapper.map(card, CardDto.class);
        return cardDto;
    }

    private CardEntity mapToEntity(CardDto cardDto) {
        CardEntity card = mapper.map(cardDto, CardEntity.class);
        return card;
    }
}
