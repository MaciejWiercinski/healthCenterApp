package pl.zajavka.domain;

import lombok.*;

@With
@Value
@Builder
@EqualsAndHashCode(of = "patientPesel")
@ToString(of = {"patientId", "name", "surname", "patientPesel", "contactInfo"})
public class Patient {

    Integer patientId;
    String name;
    String surname;
    String patientPesel;
    String contactInfo;
}
