package tdd.learn.card.user.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "audit")
public class Audit {
    @Id
    private String id;
    private int errorTime;
}
