package tdd.learn.card.user.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import tdd.learn.card.user.entity.AuditEntity;

@RequiredArgsConstructor
@Component
public class AuditRepository {
    private AuditEntityRepository auditEntityRepository;

    public AuditEntity getAuditById(String id) {
        return auditEntityRepository.getAuditById(id);
    }

    public AuditEntity saveAudit(AuditEntity audit) { return auditEntityRepository.save(audit); }

    public void deleteAll() {
        auditEntityRepository.deleteAll();
    }
}
