CREATE TABLE medical_history
(
    history_id        SERIAL PRIMARY KEY,
    patient_pesel     VARCHAR(11) REFERENCES patients (patient_pesel),
    medical_condition TEXT      NOT NULL,
    treatment_details TEXT,
    date_recorded     TIMESTAMP NOT NULL
);