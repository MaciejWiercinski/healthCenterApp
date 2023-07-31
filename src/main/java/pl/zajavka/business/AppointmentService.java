package pl.zajavka.business;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AppointmentService {

    private final PatientService patientService;
    private final DoctorService doctorService;
    private final AvailabilityService availabilityService;
    @Transactional
    public void makeAppointment() {

    }

}
