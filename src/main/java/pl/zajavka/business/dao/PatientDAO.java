package pl.zajavka.business.dao;

import pl.zajavka.domain.Patient;

import java.util.Optional;

public interface PatientDAO {

    Optional<Patient> findByPesel(String patientPesel);

    Patient savePatient(Patient patient);
}
