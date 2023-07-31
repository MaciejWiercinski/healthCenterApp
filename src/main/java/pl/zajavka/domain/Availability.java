package pl.zajavka.domain;

import lombok.*;

import java.time.OffsetDateTime;
@With
@Value
@Builder
@EqualsAndHashCode(of = "availabilityId")
@ToString(of = {"doctor", "startDate", "endDate"})
public class Availability {

    Integer availabilityId;
    Doctor doctor;
    OffsetDateTime startDate;
    OffsetDateTime endDate;
}
