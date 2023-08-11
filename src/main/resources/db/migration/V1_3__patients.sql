CREATE TABLE patients
(
    patient_id    SERIAL PRIMARY KEY,
    name          VARCHAR(255) NOT NULL,
    surname       VARCHAR(255) NOT NULL,
    patient_pesel VARCHAR(11)  NOT NULL,
    email  VARCHAR(255) NOT NULL,
    phone  VARCHAR(20) NOT NULL,
    UNIQUE (patient_pesel)
);