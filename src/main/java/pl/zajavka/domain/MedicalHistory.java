package pl.zajavka.domain;

import lombok.*;

import java.time.OffsetDateTime;

@With
@Value
@Builder
@EqualsAndHashCode(of = "historyId")
@ToString(of = {"patient", "medicalCondition", "treatmentDetails", "dateRecorded"})
public class MedicalHistory {

    Long historyId;
    Patient patient;
    String medicalCondition;
    String treatmentDetails;
    OffsetDateTime dateRecorded;
}
