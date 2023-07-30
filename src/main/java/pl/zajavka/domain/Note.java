package pl.zajavka.domain;

import lombok.*;

import java.time.OffsetDateTime;

@With
@Value
@Builder
@EqualsAndHashCode(of = "noteId")
@ToString(of = {"appointment", "noteText", "timestamp"})
public class Note {

    Long noteId;
    Appointment appointment;
    String noteText;
    OffsetDateTime timestamp;
}