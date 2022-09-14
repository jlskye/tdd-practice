package tdd.learn.card.user.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuditDto {
    private String id;
    private int errorTime;
}
