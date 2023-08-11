package pl.zajavka.domain;

import lombok.*;

import java.util.Set;

@With
@Value
@Builder
@EqualsAndHashCode(of = "doctorPesel")
@ToString(of = {"doctorId", "name", "surname", "doctorPesel", "specialty", "email", "phone"})
public class Doctor {

    Integer doctorId;
    String name;
    String surname;
    String doctorPesel;
    String specialty;
    String email;
    String phone;
    Set<Availability> availabilities;
    Set<Appointment> appointments;
}
