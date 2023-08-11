package pl.zajavka.business.dao;

import pl.zajavka.domain.Doctor;

import java.util.Optional;

public interface DoctorDAO {


    Optional<Doctor> findByPesel(String doctorPesel);

    Doctor saveDoctor(Doctor doctor);

    void saveAvailability(Doctor doctor);

}
