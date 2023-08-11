package pl.zajavka.business;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.zajavka.business.dao.DoctorDAO;
import pl.zajavka.domain.Doctor;
import pl.zajavka.domain.exception.NotFoundException;

import java.util.Optional;

@Slf4j
@Service
@AllArgsConstructor
public class DoctorService {

    private final DoctorDAO doctorDAO;

    @Transactional
    public Doctor findDoctor(String doctorPesel) {
        Optional<Doctor> doctor = doctorDAO.findByPesel(doctorPesel);
        if (doctor.isEmpty()) {
            throw new NotFoundException("Could not find doctor by doctorPesel: [%s]".formatted(doctorPesel));
        }
        return doctor.get();
    }

    @Transactional
    public void saveAvailability(Doctor doctor) {
        doctorDAO.saveAvailability(doctor);
    }
    @Transactional
    public Doctor saveDoctor(Doctor doctor) {
        return doctorDAO.saveDoctor(doctor);
    }
}
