package com.samuelhaile.emrapp.controller;

import com.samuelhaile.emrapp.dao.JdbcPatientDao;
import com.samuelhaile.emrapp.dao.PatientDao;
import com.samuelhaile.emrapp.model.Patient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping (path ="/patient")
public class PatientController {

    private PatientDao patientDao;

    public PatientController(PatientDao patientDao) {
        this.patientDao = patientDao;
    }

    @RequestMapping (path = "/testingpatient", method = RequestMethod.GET)
    public String getTestMessage() {
        return "This is a message that should display";
    }


    @RequestMapping (path = "/listallpatients", method = RequestMethod.GET)
    public List<Patient> listAllPatients() {return patientDao.listAllPatients();}
}
