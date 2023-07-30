CREATE TABLE patients
(
    patient_id   SERIAL PRIMARY KEY,
    name         VARCHAR(255) NOT NULL,
    surname      VARCHAR(255) NOT NULL,
    pesel        VARCHAR(11) NOT NULL,
    contact_info VARCHAR(255) NOT NULL,
    UNIQUE (pesel)
);