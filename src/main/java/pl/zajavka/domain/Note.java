package pl.zajavka.domain;

import lombok.*;

import java.time.LocalDateTime;

@With
@Value
@Builder
@EqualsAndHashCode(of = "noteId")
@ToString(of = {"appointment", "noteText", "timestamp"})
public class Note {

    Integer noteId;
    Appointment appointment;
    String noteText;
    LocalDateTime timestamp;
}
