package pl.zajavka.domain;

import lombok.*;
import pl.zajavka.infrastructure.database.entity.NoteEntity;

import java.time.OffsetDateTime;

@With
@Value
@Builder
@EqualsAndHashCode(of = "appointmentId")
@ToString(of = {"appointmentId", "doctor", "patient", "appointmentDate", "status"})
public class Appointment {

    Integer appointmentId;
    Doctor doctor;
    Patient patient;
    OffsetDateTime appointmentDate;
    String status;
    NoteEntity note;
}
