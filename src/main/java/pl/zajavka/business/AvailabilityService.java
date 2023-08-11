package pl.zajavka.business;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.zajavka.domain.Availability;
import pl.zajavka.domain.Doctor;

import java.time.LocalDateTime;
import java.util.Set;

@Service
@AllArgsConstructor
public class AvailabilityService {

    private final DoctorService doctorService;

    @Transactional
    public void saveAvailability(Availability availability) {
        Doctor doctor = doctorService.findDoctor(availability.getDoctor().getDoctorPesel());
        LocalDateTime startDate = availability.getStartDate();
        LocalDateTime endDate = availability.getEndDate();

        Availability buildAvailability = buildAvailability(doctor, startDate, endDate);
        Set<Availability> availabilities = doctor.getAvailabilities();
        availabilities.add(buildAvailability);
        doctorService.saveAvailability(doctor.withAvailabilities(availabilities));
    }

    private Availability buildAvailability(Doctor doctor, LocalDateTime startDate, LocalDateTime endDate) {
        return Availability.builder()
                .doctor(doctor)
                .startDate(startDate)
                .endDate(endDate)
                .build();
    }

}
