package pl.zajavka.domain;

import lombok.*;

import java.util.Set;

@With
@Value
@Builder
@EqualsAndHashCode(of = "patientPesel")
@ToString(of = {"patientId", "name", "surname", "patientPesel", "email", "phone"})
public class Patient {

    Integer patientId;
    String name;
    String surname;
    String patientPesel;
    String email;
    String phone;
    Set<Appointment> appointments;
    Set<MedicalHistory> medicalHistories;
}
