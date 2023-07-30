package pl.zajavka.domain;

import lombok.*;

import java.time.OffsetDateTime;

@With
@Value
@Builder
@EqualsAndHashCode(of = "appointmentId")
@ToString(of = {"appointmentId", "doctor", "patient", "appointmentDate", "status"})
public class Appointment {

    Long appointmentId;
    Doctor doctor;
    Patient patient;
    OffsetDateTime appointmentDate;
    String status;
}
