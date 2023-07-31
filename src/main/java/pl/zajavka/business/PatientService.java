package pl.zajavka.business;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.CustomLog;
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
    public Patient findPatient(String pesel) {
        Optional<Patient> patient = patientDAO.findByPesel(pesel);
        if (patient.isEmpty()) {
            throw new NotFoundException("Could not find patient by pesel: [%s]".formatted(pesel));
        }
        return patient.get();
    }
}
