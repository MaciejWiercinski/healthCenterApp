package pl.zajavka.domain;

import lombok.*;

import java.time.LocalDateTime;
@With
@Value
@Builder
@EqualsAndHashCode(of = "availabilityId")
@ToString(of = {"doctor", "startDate", "endDate"})
public class Availability {

    Integer availabilityId;
    Doctor doctor;
    LocalDateTime startDate;
    LocalDateTime endDate;
}
