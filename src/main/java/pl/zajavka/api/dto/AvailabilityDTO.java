package pl.zajavka.api.dto;

import jakarta.validation.constraints.Email;
import lombok.*;

import java.time.OffsetDateTime;

@Data
@With
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AvailabilityDTO {

    String doctorName;
    String doctorSurname;
    String doctorPesel;
    String doctorSpecialty;
    @Email
    String doctorEmail;
    String doctorPhone;

    OffsetDateTime startDate;
    OffsetDateTime endDate;
}
