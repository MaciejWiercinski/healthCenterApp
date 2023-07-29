package pl.zajavka.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@EqualsAndHashCode(of = "patientId")
@ToString(of = {"patientId", "name", "contactInfo"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "patients")
public class PatientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long patientId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String contactInfo;
}
