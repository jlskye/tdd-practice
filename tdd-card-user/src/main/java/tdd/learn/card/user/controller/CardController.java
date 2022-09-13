package tdd.learn.card.user.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import tdd.learn.card.user.service.CardService;

@RequiredArgsConstructor
@RestController
public class CardController {
    @Autowired
    private CardService cardService;

    @PostMapping("/card_status/{cardNo}/{pin}")
    public boolean getCardStatus(@PathVariable String cardNo, @PathVariable String pin) {
        return cardService.verifyCardStatusSuccess(cardNo, pin);
    }
}
