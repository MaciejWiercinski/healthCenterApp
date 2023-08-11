package pl.zajavka.api.dto;

import lombok.*;

import java.time.LocalDateTime;

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
    String doctorEmail;
    String doctorPhone;

    LocalDateTime startDate;
    LocalDateTime endDate;
}
