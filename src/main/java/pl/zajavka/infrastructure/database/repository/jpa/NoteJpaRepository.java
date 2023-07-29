package pl.zajavka.infrastructure.database.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.zajavka.infrastructure.database.entity.MedicalHistoryEntity;
import pl.zajavka.infrastructure.database.entity.NoteEntity;

@Repository
public interface NoteJpaRepository extends JpaRepository<NoteEntity, Long> {
}
