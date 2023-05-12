DROP TABLE IF EXISTS mobility_status CASCADE;
DROP TABLE IF EXISTS job_title CASCADE;
DROP TABLE IF EXISTS patient_provider CASCADE;
DROP TABLE IF EXISTS provider CASCADE;
DROP TABLE IF EXISTS patient CASCADE;
DROP TABLE IF EXISTS patient_note CASCADE;

CREATE TABLE job_title (
job_title_id serial,
job_title_name varchar(50), 

	 
CONSTRAINT PK_job_title PRIMARY KEY (job_title_id));


CREATE TABLE mobility_status (
mobility_status_id serial,
mobility_status_description varchar(10), 

	 
CONSTRAINT PK_mobility_status PRIMARY KEY (mobility_status_id));




CREATE TABLE patient (
patient_id serial,
first_name varchar(100)NOT NULL,
last_name varchar(100) NOT NULL, 
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



CREATE TABLE provider (
provider_id serial,
first_name varchar(100)NOT NULL,
last_name varchar(100) NOT NULL, 
job_title_id int NOT NULL,
	
	CONSTRAINT PK_provider PRIMARY KEY (provider_id),
	CONSTRAINT FK_provider_job_title FOREIGN KEY (job_title_id) REFERENCES job_title (job_title_id));


CREATE TABLE patient_provider(
	patient_provider_id serial NOT NULL,
	patient_id int NOT NULL,
	provider_id int NOT NULL,
	CONSTRAINT PK_patient_provider PRIMARY KEY (patient_provider_id),
	CONSTRAINT FK_patient_provider_patient FOREIGN KEY(patient_id) REFERENCES patient (patient_id),
	CONSTRAINT FK_patient_provider_provider FOREIGN KEY(provider_id) REFERENCES provider (provider_id));
	

INSERT INTO mobility_status (mobility_status_description) VALUES ('Clear');
INSERT INTO mobility_status (mobility_status_description) VALUES ('Not Clear');

INSERT INTO job_title (job_title_name) VALUES ('Physician');
INSERT INTO job_title (job_title_name) VALUES ('Nurse');
INSERT INTO job_title (job_title_name) VALUES ('Occupational Therapist');
INSERT INTO job_title (job_title_name) VALUES ('Physical Therapist');

INSERT INTO patient (first_name, last_name, birth_date, admit_date, pulse_rate, respiration_rate, systolic_bp, diastolic_bp, sp_O2, temperature, partial_thromboplastin_time, mobility_status_id)
VALUES ('John', 'Doe', '1994-01-01', '2023-01-01', 54, 50, 120, 80, 99, 97, 1, 1);

INSERT INTO patient (first_name, last_name, birth_date, admit_date,pulse_rate, respiration_rate, systolic_bp, diastolic_bp, sp_O2, temperature, partial_thromboplastin_time, mobility_status_id)
VALUES ('Jane', 'Smith', '1978-01-01', '2022-04-04', 60, 50, 165, 99, 99, 97, 1, 2 );

INSERT INTO patient_note (patient_id , note_details , date_added )
VALUES (1, 'This is a note', '2023-03-14');

INSERT INTO patient_note (patient_id , note_details , date_added )
VALUES (2, 'This is a note', '2023-03-15');

INSERT INTO provider (provider_id, first_name, last_name, job_title_id)
VALUES (1, 'Serena', 'Williams', 3);

INSERT INTO provider (provider_id, first_name, last_name, job_title_id)
VALUES (2, 'Venus', 'Williams', 2);

INSERT INTO patient_provider (patient_id, provider_id) 
VALUES (1, 1);




-- select * from patient
-- join patient_note on patient.patient_id = patient_note.patient_id
-- join mobility_status on patient.mobility_status_id = mobility_status.mobility_status_id





