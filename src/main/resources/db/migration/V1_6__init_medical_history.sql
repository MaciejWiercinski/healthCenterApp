CREATE TABLE medical_history
(
    history_id        SERIAL PRIMARY KEY,
    patient_id        INTEGER REFERENCES patients (patient_id),
    medical_condition TEXT NOT NULL,
    treatment_details TEXT,
    date_recorded     DATE NOT NULL
);