package sh_patient_ehr.dao;

import sh_patient_ehr.Patient;

public interface PatientDaoInterface {

    //TODO Create/Add patient to datasource
    //Takes patient object as parameter (from user input), adds it to database using sql string, returning the serial id, then uses setter
    // to set patient id to returned, autogenerated Id.
     Patient createPatient(Patient patient);

    //TODO Remove patient from datasource
    //Removes Patient from datasource
    void removePatient(Patient patient);

    //TODO Update Patient Info
    //Update Patient info into datasource
    void updatePatient(Patient patient);

    //TODO Read patient/show list of patients, or get patient by ID
    //Gets a current list of patients from datasource
    void getCurrentListPatients();
}
