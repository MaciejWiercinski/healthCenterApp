package pl.zajavka.business;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.zajavka.domain.Availability;
import pl.zajavka.domain.Doctor;

import java.time.OffsetDateTime;

@Service
@AllArgsConstructor
public class AvailabilityService {

    private final DoctorService doctorService;

    @Transactional
    public Availability createAvailability(Doctor doctor, OffsetDateTime startDate, OffsetDateTime endDate) {
        Doctor availableDoctor = doctorService.findDoctor(doctor.getPesel());
        return buildAvailability(availableDoctor, startDate, endDate);
    }

    private Availability buildAvailability(Doctor doctor, OffsetDateTime startDate, OffsetDateTime endDate) {
        return Availability.builder()
                .doctor(doctor)
                .startDate(startDate)
                .endDate(endDate)
                .build();
    }

}
