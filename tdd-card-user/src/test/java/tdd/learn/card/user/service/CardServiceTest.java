package tdd.learn.card.user.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import tdd.learn.card.user.entity.Audit;
import tdd.learn.card.user.entity.Card;
import tdd.learn.card.user.repository.AuditRepository;
import tdd.learn.card.user.repository.CardsRepository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CardServiceTest {
    @Mock
    private CardsRepository cardsRepository;

    @Mock
    private AuditRepository auditRepository;

    @InjectMocks
    private CardService cardService;

    @Test
    void given_matched_cardNo_and_pin_when_audit_not_has_error_then_verify_success() {
        when(cardsRepository.getCardById(1L)).thenReturn(new Card(1L, "111111", "02"));
        when(auditRepository.getAuditById(1L)).thenReturn(new Audit(1L, 0));

        Boolean verificationResult = cardService.verifyCardStatusSuccess(1L, "111111");

        assertThat(verificationResult).isTrue();
    }
}