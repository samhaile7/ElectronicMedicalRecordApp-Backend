DROP TABLE IF EXISTS mobility_status CASCADE;
DROP TABLE IF EXISTS lab_chart CASCADE;
DROP TABLE IF EXISTS patient CASCADE;
DROP TABLE IF EXISTS patient_note CASCADE;


CREATE TABLE lab_chart (
lab_chart_id serial, 
pulse_rate int,
respiration_rate int,
systolic_bp int,
diastolic_bp int,
ptt int,
sp_O2 int,
temperature int,
partial_thromboplastin_time int, 

CONSTRAINT PK_lab_chart_id PRIMARY KEY (lab_chart_id)
);

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
mobility_status_id int NOT NULL,
lab_chart_id int NOT NULL,
CONSTRAINT PK_patient PRIMARY KEY (patient_id), 
CONSTRAINT FK_patient_mobility_status FOREIGN KEY (mobility_status_id) REFERENCES mobility_status (mobility_status_id),
CONSTRAINT FK_patient_lab_chart FOREIGN KEY (lab_chart_id) REFERENCES lab_chart (lab_chart_id));

CREATE TABLE patient_note (
note_id serial,
patient_id int,
note_details text,
date_added date,
CONSTRAINT PK_patient_note PRIMARY KEY (note_id),
CONSTRAINT FK_patient_note_patient FOREIGN KEY (patient_id) REFERENCES patient (patient_id));

--INSERT INTO patient (first_name, last_name, birth_date, admit_date) VALUES 
--('John', 'Doe', '1965-01-02', '2023-01-17');

INSERT INTO mobility_status (mobility_status_description) VALUES ('Clear');
INSERT INTO mobility_status (mobility_status_description) VALUES ('Not Clear');

SELECT * from mobility_status



