package tdd.learn.card.user.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tdd.learn.card.user.entity.Audit;
import tdd.learn.card.user.entity.Card;
import tdd.learn.card.user.repository.AuditRepository;
import tdd.learn.card.user.repository.CardsRepository;

@RequiredArgsConstructor
@Service
public class CardService {
    private CardsRepository cardsRepository;
    private AuditRepository auditRepository;

    public Boolean verifyCardStatusSuccess(Long cardNo, String pin) {
        Card card = cardsRepository.getCardById(cardNo);
        Audit audit = auditRepository.getAuditById(cardNo);
        return true;
    }
}
