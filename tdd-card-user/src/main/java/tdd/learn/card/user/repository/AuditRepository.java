package tdd.learn.card.user.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import tdd.learn.card.user.entity.Audit;

@RequiredArgsConstructor
@Component
public class AuditRepository {
    private AuditEntityRepository auditEntityRepository;

    public Audit getAuditById(Long id) {
        return auditEntityRepository.getAuditById(id);
    }

    public Audit saveAudit(Audit audit) { return auditEntityRepository.save(audit); }

    public void deleteAll() {
        auditEntityRepository.deleteAll();
    }
}
