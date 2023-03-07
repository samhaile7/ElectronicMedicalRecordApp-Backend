package samhaile.project.dao;

import samhaile.project.Patient;
import org.apache.commons.dbcp2.BasicDataSource;

// This class creates and updates new patients in database.
// method get Patient(patientid) that reads from database and returns patient object
// from sql row to customer object private method
//insert method that inserts into databsae, returning patient id, then set that new id to patient object with returning

public class PatientDao implements PatientDaoInterface{

    //Make constructor here that takes in a new datasource as a parameter


    @Override
    public Patient getPatientById(int Id) {
        Patient patient = null;

        String sql = "SELECT patient_id, first_name, last_name, birth_date, admit_date  " +
                "FROM patient " +
                "WHERE patient_id = ?;";
        //Add SQL ROW SET here



        return patient;
    }



    @Override
    public Patient createPatient(Patient patient) {
        return null;
    }

    @Override
    public void removePatient(Patient patient) {

    }

    @Override
    public void updatePatient(Patient patient) {

    }

    @Override
    public void getCurrentListPatients() {

    }


}
