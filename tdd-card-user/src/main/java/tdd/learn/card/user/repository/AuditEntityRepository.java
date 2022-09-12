package tdd.learn.card.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tdd.learn.card.user.entity.Audit;

public interface AuditEntityRepository extends JpaRepository<Audit, Long> {
    Audit getAuditById(Long id);
}
