package pl.zajavka.domain;

import lombok.*;

@With
@Value
@Builder
@EqualsAndHashCode(of = "pesel")
@ToString(of = {"doctorId", "name", "surname", "pesel", "specialty"})
public class Doctor {

    Long doctorId;
    String name;
    String surname;
    String pesel;
    String specialty;
}
