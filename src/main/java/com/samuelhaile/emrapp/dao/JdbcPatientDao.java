package com.samuelhaile.emrapp.dao;

import com.samuelhaile.emrapp.model.Patient;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


// This class creates and updates new patients in database.
// method get Patient(patientid) that reads from database and returns patient object
// from sql row to customer object private method
//insert method that inserts into databsae, returning patient id, then set that new id to patient object with returning


@Component
public class JdbcPatientDao implements PatientDao {

    private JdbcTemplate jdbcTemplate;
/*Only jdbc template instance that springs creates here. For all daos. Spring injects it into
    constructor here. We flag it with @Component (tells spring this dependency is injected here and wired to other daos as well*/
    public JdbcPatientDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public List<Patient> listAllPatients() {
List<Patient> listOfPatients = new ArrayList<>();


        String sql = "SELECT patient_id, first_name, last_name, birth_date, admit_date, mobility_status_id  " +
               "FROM patient; ";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);

        while (results.next()) {
            listOfPatients.add(mapRowToPatient(results));

        }
        return listOfPatients;
    }

    @Override
    public Patient getPatientById(int patientId) {
        Patient patient = null;

        String sql = "SELECT patient_id, first_name, last_name, birth_date, admit_date, mobility_status_id  " +
                "FROM patient " +
                "WHERE patient_id = ?; ";


        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, patientId);

        if (results.next()) {
            patient = mapRowToPatient(results);
        }
            return patient;
    }

    //Adds new patient object to database, which returns autoincremented id. id is set to patient object. Patient object returned.
    @Override
    public Patient createPatient(Patient patient) {

        String sql = "INSERT INTO patient (first_name, last_name, birth_date, admit_date, mobility_status_id) " +
                "VALUES (?, ?, ?, ?, ?) RETURNING patient_id;";
        Integer patientId = jdbcTemplate.queryForObject(sql, Integer.class, patient.getFirstName(), patient.getLastName(), patient.getBirthDate(), patient.getAdmitDate(), patient.getMobilityStatusId());
        patient.setPatientId(patientId) ;
        return patient;
    }

    @Override
    public void deletePatient(int patientId) {
        String sql = "DELETE FROM patient WHERE patient_id = ?";
        jdbcTemplate.update(sql, patientId);
    }

    @Override
    public void updatePatient(Patient patient) {


    }


    // Maps rowSet from sql to java Patient model object

    private Patient mapRowToPatient(SqlRowSet row) {
        Patient patient = new Patient();
        patient.setPatientId(row.getInt("patient_id"));
        patient.setFirstName(row.getString("first_name"));
        patient.setLastName(row.getString("last_name"));
        patient.setBirthDate(row.getDate("birth_date").toLocalDate());
        patient.setAdmitDate(row.getDate("admit_date").toLocalDate());
        patient.setMobilityStatusId(row.getInt("mobility_status_id"));

        return patient;

    }



}
