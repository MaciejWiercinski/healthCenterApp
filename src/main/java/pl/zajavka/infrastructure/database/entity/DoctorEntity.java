package pl.zajavka.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@EqualsAndHashCode(of = "doctorId")
@ToString(of = {"name", "specialty"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "doctors")
public class DoctorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long doctorId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String specialty;
}
