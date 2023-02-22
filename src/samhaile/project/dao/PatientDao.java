package samhaile.project.dao;

import samhaile.project.Patient;

// This class creates and updates new patients in database.
// method get Patient(patientid) that reads from database and returns patient object
// from sql row to customer object private method
//insert method that inserts into databsae, returning patient id, then set that new id to patient object with returning

public class PatientDao implements PatientDaoInterface{


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

    @Override
    public Patient getPatientById(int Id) {
        return null;
    }
}
