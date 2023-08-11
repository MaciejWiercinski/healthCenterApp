CREATE TABLE availability
(
    availability_id SERIAL PRIMARY KEY,
    doctor_pesel    VARCHAR(11) REFERENCES doctors (doctor_pesel),
    start_date      TIMESTAMP NOT NULL,
    end_date        TIMESTAMP NOT NULL
);