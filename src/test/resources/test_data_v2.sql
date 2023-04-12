DROP TABLE IF EXISTS mobility_status CASCADE;
DROP TABLE IF EXISTS patient CASCADE;
DROP TABLE IF EXISTS patient_note CASCADE;

CREATE TABLE mobility_status (
mobility_status_id serial,
mobility_status_description varchar(10), 

CONSTRAINT PK_mobility_status PRIMARY KEY (mobility_status_id));

CREATE TABLE patient (
patient_id serial,
first_name varchar(50)NOT NULL,
last_name varchar(50) NOT NULL, 
birth_date date NOT NULL,
admit_date date NOT NULL,
pulse_rate int NOT NULL,
respiration_rate int NOT NULL,
systolic_bp int NOT NULL,
diastolic_bp int NOT NULL,
sp_O2 int NOT NULL,
temperature int NOT NULL,
partial_thromboplastin_time int NOT NULL, 
mobility_status_id int NOT NULL,
	
CONSTRAINT PK_patient PRIMARY KEY (patient_id), 
CONSTRAINT FK_patient_mobility_status FOREIGN KEY (mobility_status_id) REFERENCES mobility_status (mobility_status_id));

CREATE TABLE patient_note (
note_id serial,
patient_id int,
note_details text,
date_added date,
CONSTRAINT PK_patient_note PRIMARY KEY (note_id),
CONSTRAINT FK_patient_note_patient FOREIGN KEY (patient_id) REFERENCES patient (patient_id));

INSERT INTO mobility_status (mobility_status_description) VALUES ('Clear');
INSERT INTO mobility_status (mobility_status_description) VALUES ('Not Clear');

INSERT INTO patient (first_name, last_name, birth_date, admit_date, pulse_rate, respiration_rate, systolic_bp, diastolic_bp, sp_O2, temperature, partial_thromboplastin_time, mobility_status_id)
VALUES ('John', 'Doe', '1994-01-01', '2023-01-01', 54, 50, 120, 80, 99, 97, 1, 1);

INSERT INTO patient (first_name, last_name, birth_date, admit_date,pulse_rate, respiration_rate, systolic_bp, diastolic_bp, sp_O2, temperature, partial_thromboplastin_time, mobility_status_id)
VALUES ('Jane', 'Smith', '1978-01-01', '2022-04-04', 60, 50, 165, 99, 99, 97, 1, 2 );

INSERT INTO patient_note (patient_id , note_details , date_added )
VALUES (1, 'This is a note', '2023-03-14');

INSERT INTO patient_note (patient_id , note_details , date_added )
VALUES (2, 'This is a note', '2023-03-15');

-- select * from patient
-- join patient_note on patient.patient_id = patient_note.patient_id
-- join mobility_status on patient.mobility_status_id = mobility_status.mobility_status_id





