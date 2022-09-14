package tdd.learn.card.user.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CardService {


    public Boolean verifyCardStatusSuccess(String cardNo, String pin) {
        return false;
    }

//    public Boolean verifyCardStatusSuccess(Long cardNo, String pin) {
//        Card card = cardsRepository.getCardById(cardNo);
//        Audit audit = auditRepository.getAuditById(cardNo);
//
//        if (card.getPin().equals(pin)) {
//            if (audit.getErrorTime() > 0) {
//                auditRepository.saveAudit(new Audit(audit.getId(), 0));
//            }
//            Card newCard = new Card(card.getId(), card.getPin(), CardStatusEnum.SUCCESS.description);
//            cardsRepository.saveCard(newCard);
//            return true;
//        } else {
//            auditRepository.saveAudit(new Audit(audit.getId(), audit.getErrorTime() + 1));
//            String cardStatus = audit.getErrorTime() == 2 ? CardStatusEnum.LOCKED.description : CardStatusEnum.INVALID.description;
//            cardsRepository.saveCard(new Card(card.getId(), card.getPin(), cardStatus));
//            return false;
//        }
//    }
}
