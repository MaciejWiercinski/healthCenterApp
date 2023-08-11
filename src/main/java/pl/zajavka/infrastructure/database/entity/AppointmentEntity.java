package pl.zajavka.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@EqualsAndHashCode(of = "appointmentId")
@ToString(of = {"appointmentId", "doctor", "patient", "appointmentDate", "status"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "appointments")
public class AppointmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer appointmentId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "doctor_id", nullable = false)
    private DoctorEntity doctor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id", nullable = false)
    private PatientEntity patient;

    @Column(nullable = false)
    private LocalDateTime appointmentDate;

    @Column(nullable = false)
    private String status;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "appointment")
    private NoteEntity note;
}
