package pl.zajavka.domain;

import lombok.*;

@With
@Value
@Builder
@EqualsAndHashCode(of = "doctorPesel")
@ToString(of = {"doctorId", "name", "surname", "doctorPesel", "specialty"})
public class Doctor {

    Integer doctorId;
    String name;
    String surname;
    String doctorPesel;
    String specialty;
}
