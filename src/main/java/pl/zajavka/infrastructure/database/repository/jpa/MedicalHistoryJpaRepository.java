package pl.zajavka.infrastructure.database.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.zajavka.infrastructure.database.entity.DoctorEntity;
import pl.zajavka.infrastructure.database.entity.MedicalHistoryEntity;

@Repository
public interface MedicalHistoryJpaRepository extends JpaRepository<MedicalHistoryEntity, Long> {
}
