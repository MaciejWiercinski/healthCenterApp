package pl.zajavka.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

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
    private Integer historyId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id", nullable = false)
    private PatientEntity patient;

    @Column(nullable = false)
    private String medicalCondition;

    @Column
    private String treatmentDetails;

    @Column(nullable = false)
    private LocalDateTime dateRecorded;
}
