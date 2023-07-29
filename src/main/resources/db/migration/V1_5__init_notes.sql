CREATE TABLE notes
(
    note_id        SERIAL PRIMARY KEY,
    appointment_id INTEGER REFERENCES appointments (appointment_id),
    note_text      TEXT      NOT NULL,
    timestamp      TIMESTAMP NOT NULL
);