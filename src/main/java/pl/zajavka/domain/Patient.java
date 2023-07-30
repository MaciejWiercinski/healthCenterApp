package pl.zajavka.domain;

import lombok.*;

@With
@Value
@Builder
@EqualsAndHashCode(of = "pesel")
@ToString(of = {"patientId", "name", "surname", "pesel", "contactInfo"})
public class Patient {

    Long patientId;
    String name;
    String surname;
    String pesel;
    String contactInfo;
}
