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

        if (card.getPin().equals(pin)) {
            if (audit.getErrorTime() > 0) {
                auditRepository.saveAudit(new Audit(audit.getId(), 0));
            }
            Card newCard = new Card(card.getId(), card.getPin(), CardStatusEnum.SUCCESS.description);
            cardsRepository.saveCard(newCard);
            return true;
        } else {
            auditRepository.saveAudit(new Audit(audit.getId(), audit.getErrorTime() + 1));
            String cardStatus = audit.getErrorTime() == 2 ? CardStatusEnum.LOCKED.description : CardStatusEnum.INVALID.description;
            cardsRepository.saveCard(new Card(card.getId(), card.getPin(), cardStatus));
            return false;
        }
    }
}
