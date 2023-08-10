package pl.zajavka.business;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.zajavka.business.dao.PatientDAO;
import pl.zajavka.domain.Patient;
import pl.zajavka.domain.exception.NotFoundException;

import java.util.Optional;

@Service
@AllArgsConstructor
public class PatientService {

    private final PatientDAO patientDAO;

    @Transactional
    public Patient findPatient(String patientPesel) {
        Optional<Patient> patient = patientDAO.findByPesel(patientPesel);
        if (patient.isEmpty()) {
            throw new NotFoundException("Could not find patient by patientPesel: [%s]".formatted(patientPesel));
        }
        return patient.get();
    }
}
