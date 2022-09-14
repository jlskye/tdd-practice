package tdd.learn.card.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tdd.learn.card.user.entity.AuditEntity;

public interface AuditEntityRepository extends JpaRepository<AuditEntity, String> {
    AuditEntity getAuditById(String id);
}
