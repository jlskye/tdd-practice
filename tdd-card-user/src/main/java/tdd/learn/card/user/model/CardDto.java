package tdd.learn.card.user.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CardDto {
    private Long id;
    private String pin;
    private String cardStatus;
}
