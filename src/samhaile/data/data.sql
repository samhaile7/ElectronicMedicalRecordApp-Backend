--BEGIN TRANSACTION;
DROP TABLE IF EXISTS labs;
DROP TABLE IF EXISTS patient;

CREATE TABLE patient (
patient_id serial,
first_name varchar(50)NOT NULL,
last_name varchar(50) NOT NULL, 
birth_date date NOT NULL,
admit_date date NOT NULL,


	CONSTRAINT PK_patient PRIMARY KEY (patient_id)
);
CREATE TABLE labs (
labs_id serial,
patient_id int,
lab_1 numeric(3,1),
lab_2 numeric(3,1),
mobility_status boolean NOT NULL, 

	CONSTRAINT FK_labs_patient FOREIGN KEY (patient_id) REFERENCES patient(patient_id)
);

INSERT INTO patient (first_name, last_name, birth_date, admit_date) VALUES 
('John', 'Doe', '1965-01-02', '2023-01-17');

SELECT * from patient


--COMMIT;

