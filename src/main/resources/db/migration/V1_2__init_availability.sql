CREATE TABLE availability
(
    availability_id SERIAL PRIMARY KEY,
    doctor_id       INTEGER REFERENCES doctors (doctor_id),
    start_date      DATE NOT NULL,
    end_date        DATE NOT NULL
);