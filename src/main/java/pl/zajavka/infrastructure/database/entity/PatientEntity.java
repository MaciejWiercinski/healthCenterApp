package pl.zajavka.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode(of = "patientPesel")
@ToString(of = {"patientId", "name", "surname", "patientPesel", "email", "phone"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "patients")
public class PatientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer patientId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String surname;

    @Column(name = "patient_pesel", nullable = false)
    private String patientPesel;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String phone;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "patient")
    private Set<AppointmentEntity> appointments;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "patient")
    private Set<MedicalHistoryEntity> medicalHistories;

}
