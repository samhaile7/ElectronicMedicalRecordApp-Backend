package com.samuelhaile.emrapp.dao;


import com.samuelhaile.emrapp.model.Patient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJdbcTest
public class JdbcPatientDaoTest {

    private JdbcPatientDao patientDao;

    public JdbcPatientDaoTest(JdbcPatientDao patientDao) {
        this.patientDao = patientDao;
    }

//    @Test

//    public void list_patients_should_return_all_patients() {
//        List<Patient> patientList = patientDao.listAllPatients();
//        assertEquals(5, patientList.size());
//
//    }



}
