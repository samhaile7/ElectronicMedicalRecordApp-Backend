package com.samuelhaile.emrapp.dao;

import com.samuelhaile.emrapp.model.Patient;

import java.util.List;


// This class creates and updates new patients in database.
// method get Patient(patientid) that reads from database and returns patient object
// from sql row to customer object private method
//insert method that inserts into databsae, returning patient id, then set that new id to patient object with returning

public class JdbcPatientDao implements PatientDao {
    @Override
    public List<Patient> listAllPatients() {
        return null;
    }

    @Override
    public Patient getPatientById(int patientId) {
        return null;
    }

    @Override
    public int addPatient(Patient patient) {
        return 0;
    }

    @Override
    public void deletePatient(Patient patient) {

    }

    @Override
    public void updatePatient(Patient patient) {

    }

    //Make constructor here that takes in a new datasource as a parameter


//    @Override
//    public Patient getPatientById(int Id) {
//        Patient patient = null;
//
//        String sql = "SELECT patient_id, first_name, last_name, birth_date, admit_date  " +
//                "FROM patient " +
//                "WHERE patient_id = ?;";
//        //Add SQL ROW SET here
//
//
//
//        return patient;
//    }



}
