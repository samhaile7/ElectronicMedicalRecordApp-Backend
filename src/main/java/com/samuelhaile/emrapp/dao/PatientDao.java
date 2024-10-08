package com.samuelhaile.emrapp.dao;

import com.samuelhaile.emrapp.model.Patient;

import java.util.List;

public interface PatientDao {

	List<Patient> listAllPatients();

	Patient getPatientById(int patientId);

	Patient createPatient(Patient patient);

	void deletePatient(int patientId);

	void updatePatient(Patient patient);

}
