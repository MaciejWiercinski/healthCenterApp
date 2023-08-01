CREATE TABLE appointments
(
    appointment_id   SERIAL PRIMARY KEY,
    doctor_pesel        VARCHAR(11) REFERENCES doctors (pesel),
    patient_pesel       VARCHAR(11) REFERENCES patients (pesel),
    appointment_date DATE        NOT NULL,
    status           VARCHAR(20) NOT NULL
);