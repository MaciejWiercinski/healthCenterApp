package pl.zajavka.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@EqualsAndHashCode(of = "noteId")
@ToString(of = {"noteId", "appointment", "noteText", "timestamp"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "notes")
public class NoteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer noteId;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "appointment_id", nullable = false)
    private AppointmentEntity appointment;

    @Column(nullable = false)
    private String noteText;

    @Column(nullable = false)
    private LocalDateTime timestamp;
}
