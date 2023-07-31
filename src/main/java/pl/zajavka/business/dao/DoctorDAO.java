package pl.zajavka.business.dao;

import pl.zajavka.domain.Doctor;

import java.util.List;
import java.util.Optional;

public interface DoctorDAO {

    List<Doctor> findAvailable();

    Optional<Doctor> findByPesel(String pesel);


    Doctor saveDoctor(Doctor doctor);
}
