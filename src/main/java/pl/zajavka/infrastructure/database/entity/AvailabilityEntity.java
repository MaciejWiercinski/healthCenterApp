package pl.zajavka.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@EqualsAndHashCode(of = "availabilityId")
@ToString(of = {"availabilityId", "doctor", "startDate", "endDate"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "availability")
public class AvailabilityEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer availabilityId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "doctor_id", nullable = false)
    private DoctorEntity doctor;

    @Column(nullable = false)
    private LocalDateTime startDate;

    @Column(nullable = false)
    private LocalDateTime endDate;
}
