CREATE TABLE doctors
(
    doctor_id SERIAL PRIMARY KEY,
    name      VARCHAR(255) NOT NULL,
    surname   VARCHAR(255) NOT NULL,
    pesel     VARCHAR(255) NOT NULL,
    specialty VARCHAR(100) NOT NULL
);
