package pl.zajavka.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
@Getter
@Setter
@EqualsAndHashCode(of = "availabilityId")
@ToString(of = {"availabilityId", "doctor", "patient", "startDate", "endDate"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "availability")
public class AvailabilityEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long availabilityId;

    @ManyToOne
    @JoinColumn(name = "doctor_id", nullable = false)
    private DoctorEntity doctor;

    @Column(nullable = false)
    private LocalDate startDate;

    @Column(nullable = false)
    private LocalDate endDate;
}
