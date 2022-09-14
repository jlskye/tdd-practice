package tdd.learn.card.user.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import tdd.learn.card.user.entity.Audit;
import tdd.learn.card.user.entity.Card;
import tdd.learn.card.user.repository.AbstractIntegrationTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CardServiceTest extends AbstractIntegrationTest {
    //todo: service test 不需要 test container>
//    @Mock
//    private CardsRepository cardsRepository;
//
//    @Mock
//    private AuditRepository auditRepository;
//
//    @InjectMocks
//    private CardService cardService;
//
//    @BeforeEach
//    void setUp() {
//        cardsRepository.saveCard(new Card("152110", "111111", "02"));
//        auditRepository.saveAudit(new Audit("152110", 0));
//    }
//
//    @AfterEach
//    void tearDown() {
//        cardsRepository.deleteAll();
//        auditRepository.deleteAll();
//    }

//    @Test
//    void given_matched_cardNo_and_pin_when_audit_not_has_error_then_verify_success() {
//        when(cardsRepository.getCardById(1L)).thenReturn(new Card(1L, "111111", "02"));
//        when(auditRepository.getAuditById(1L)).thenReturn(new Audit(1L, 0));
//
//        Boolean verificationResult = cardService.verifyCardStatusSuccess(1L, "111111");
//
//        //todo: to verify auditRepository & cardsRepository save po action
//        assertThat(verificationResult).isTrue();
//    }
//
//    @Test
//    void given_matched_cardNo_and_pin_when_audit_has_error_less_than_3_then_verify_fail() {
//        when(cardsRepository.getCardById(1L)).thenReturn(new Card(1L, "111111", "02"));
//        when(auditRepository.getAuditById(1L)).thenReturn(new Audit(1L, 0));
//
//        Boolean verificationResult = cardService.verifyCardStatusSuccess(1L, "222222");
//
//        //todo: to verify auditRepository & cardsRepository save po action
//        verify(cardsRepository.saveCard())
//        assertThat(verificationResult).isFalse();
//    }
}