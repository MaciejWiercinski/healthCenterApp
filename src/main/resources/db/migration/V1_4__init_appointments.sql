CREATE TABLE appointments
(
    appointment_id   SERIAL PRIMARY KEY,
    doctor_pesel     VARCHAR(11) REFERENCES doctors (doctor_pesel),
    patient_pesel    VARCHAR(11) REFERENCES patients (patient_pesel),
    appointment_date DATE        NOT NULL,
    status           VARCHAR(20) NOT NULL
);