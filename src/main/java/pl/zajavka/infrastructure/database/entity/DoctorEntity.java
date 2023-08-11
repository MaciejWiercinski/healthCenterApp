package pl.zajavka.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode(of = "doctorPesel")
@ToString(of = {"name","surname", "doctorPesel", "specialty", "email", "phone"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "doctors")
public class DoctorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer doctorId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String surname;

    @Column(name = "doctor_pesel", nullable = false)
    private String doctorPesel;

    @Column(nullable = false)
    private String specialty;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String phone;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "doctor")
    private Set<AvailabilityEntity> availabilities;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "doctor")
    private Set<AppointmentEntity> appointments;

}
