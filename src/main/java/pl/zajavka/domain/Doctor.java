package pl.zajavka.domain;

import lombok.*;

@With
@Value
@Builder
@EqualsAndHashCode(of = "pesel")
@ToString(of = {"doctorId", "name", "surname", "pesel", "specialty"})
public class Doctor {

    Integer doctorId;
    String name;
    String surname;
    String pesel;
    String specialty;
}
