CREATE TABLE doctors
(
    doctor_id SERIAL PRIMARY KEY,
    name      VARCHAR(255) NOT NULL,
    specialty VARCHAR(100) NOT NULL
);
