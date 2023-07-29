package pl.zajavka.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
@Getter
@Setter
@EqualsAndHashCode(of = "historyId")
@ToString(of = {"historyId", "patient", "medicalCondition", "treatmentDetails", "dateRecorded"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "medical_history")
public class MedicalHistoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long historyId;

    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false)
    private PatientEntity patient;

    @Column(nullable = false)
    private String medicalCondition;

    @Column
    private String treatmentDetails;

    @Column(nullable = false)
    private LocalDate dateRecorded;
}
