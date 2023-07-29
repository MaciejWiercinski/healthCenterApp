CREATE TABLE appointments
(
    appointment_id   SERIAL PRIMARY KEY,
    doctor_id        INTEGER REFERENCES doctors (doctor_id),
    patient_id       INTEGER REFERENCES patients (patient_id),
    appointment_date DATE        NOT NULL,
    status           VARCHAR(20) NOT NULL
);