INSERT INTO Doctors (name, surname, doctor_pesel, specialty)
VALUES ('Dr. John', 'Smith', '12345678901', 'Cardiology'),
       ('Dr. Emily', 'Johnson', '23456789012', 'Pediatrics'),
       ('Dr. Michael', 'Brown', '34567890123', 'Neurology');

INSERT INTO availability (doctor_pesel, start_date, end_date)
VALUES ('12345678901', '2023-08-01 08:00:00', '2023-08-01 12:00:00'),
       ('23456789012', '2023-08-02 09:00:00', '2023-08-02 13:00:00'),
       ('34567890123', '2023-08-01 10:00:00', '2023-08-01 14:00:00');

INSERT INTO Patients (name, surname, patient_pesel, contact_info)
VALUES ('Alice', 'Johnson', '45678901234', 'alice@example.com'),
       ('Bob', 'Anderson', '56789012345', 'bob@example.com'),
       ('Carol', 'Davis', '67890123456', 'carol@example.com');

INSERT INTO Appointments (doctor_pesel, patient_pesel, appointment_date, status)
VALUES ('12345678901', '45678901234', '2023-08-02', 'scheduled'),
       ('12345678901', '56789012345', '2023-08-08', 'scheduled'),
       ('23456789012', '67890123456', '2023-08-05', 'scheduled'),
       ('12345678901', '45678901234', '2023-08-10', 'scheduled'),
       ('34567890123', '56789012345', '2023-08-04', 'scheduled');

INSERT INTO Notes (note_text, timestamp)
VALUES ('Prescribed medication X', '2023-08-02 10:30:00'),
       ('Follow-up in 1 week', '2023-08-02 10:45:00'),
       ('Routine check-up', '2023-08-08 09:15:00'),
       ('Flu symptoms, rest', '2023-08-05 11:00:00'),
       ('Blood pressure normal', '2023-08-10 12:00:00'),
       ('MRI scheduled', '2023-08-04 15:30:00');

INSERT INTO Medical_History (patient_pesel, medical_condition, treatment_details, date_recorded)
VALUES ('45678901234', 'Hypertension', 'Medication A, Exercise', '2023-08-02'),
       ('45678901234', 'Allergy to penicillin', 'Avoid penicillin', '2023-08-02'),
       ('56789012345', 'Asthma', 'Inhaler as needed', '2023-08-05'),
       ('67890123456', 'Migraine', 'Rest, Painkillers', '2023-08-01'),
       ('45678901234', 'High Cholesterol', 'Medication B', '2023-08-10');
