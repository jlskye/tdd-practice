package tdd.learn.card.user.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cards")
public class CardEntity {
    @Id
    private String id;
    private String pin;
    private String cardStatus;
}
