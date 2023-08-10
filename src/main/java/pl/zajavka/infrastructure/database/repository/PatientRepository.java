package pl.zajavka.infrastructure.database.repository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import pl.zajavka.business.dao.PatientDAO;
import pl.zajavka.domain.Patient;
import pl.zajavka.infrastructure.database.entity.PatientEntity;
import pl.zajavka.infrastructure.database.repository.jpa.PatientJpaRepository;
import pl.zajavka.infrastructure.database.repository.mapper.PatientEntityMapper;

import java.util.Optional;

@Repository
@AllArgsConstructor
public class PatientRepository implements PatientDAO {

    private final PatientJpaRepository patientJpaRepository;
    private final PatientEntityMapper patientEntityMapper;

    @Override
    public Optional<Patient> findByPesel(String patientPesel) {
        return patientJpaRepository.findByPatientPesel(patientPesel)
                .map(patientEntityMapper::mapFromEntity);
    }

    @Override
    public Patient savePatient(Patient patient) {
        PatientEntity toSave = patientEntityMapper.mapToEntity(patient);
        PatientEntity saved = patientJpaRepository.save(toSave);
        return patientEntityMapper.mapFromEntity(saved);
    }
}
