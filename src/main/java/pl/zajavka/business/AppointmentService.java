package pl.zajavka.business;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;

@Service
@AllArgsConstructor
public class AppointmentService {

    private final PatientService patientService;
    private final DoctorService doctorService;
    private final AvailabilityService availabilityService;
    @Transactional
    public void makeAppointment(DoctorService doctor, PatientService patient, OffsetDateTime date) {

    }

}
