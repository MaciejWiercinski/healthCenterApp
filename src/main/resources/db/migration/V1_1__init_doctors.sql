CREATE TABLE doctors
(
    doctor_id    SERIAL PRIMARY KEY,
    name         VARCHAR(255) NOT NULL,
    surname      VARCHAR(255) NOT NULL,
    doctor_pesel VARCHAR(11)  NOT NULL,
    specialty    VARCHAR(100) NOT NULL,
    email        VARCHAR(255) NOT NULL,
    phone        VARCHAR(20) NOT NULL,
    UNIQUE (doctor_pesel)
);
