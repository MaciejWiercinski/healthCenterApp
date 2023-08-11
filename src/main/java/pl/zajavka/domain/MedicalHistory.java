package pl.zajavka.domain;

import lombok.*;

import java.time.LocalDateTime;

@With
@Value
@Builder
@EqualsAndHashCode(of = "historyId")
@ToString(of = {"patient", "medicalCondition", "treatmentDetails", "dateRecorded"})
public class MedicalHistory {

    Integer historyId;
    Patient patient;
    String medicalCondition;
    String treatmentDetails;
    LocalDateTime dateRecorded;
}
