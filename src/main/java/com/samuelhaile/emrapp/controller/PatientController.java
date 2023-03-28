package com.samuelhaile.emrapp.controller;

import com.samuelhaile.emrapp.dao.JdbcPatientDao;
import com.samuelhaile.emrapp.dao.PatientDao;
import com.samuelhaile.emrapp.model.Patient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController

public class PatientController {

    private PatientDao patientDao;

    public PatientController(PatientDao patientDao) {
        this.patientDao = patientDao;
    }

    @RequestMapping(path = "/test", method = RequestMethod.GET)
    public String getTestMessage() {
        return "This is a message that should display";
    }


    @RequestMapping(path = "/patients", method = RequestMethod.GET)
    public List<Patient> listAllPatients() {
        return patientDao.listAllPatients();
    }


    @RequestMapping(path = "/patients/{id}", method = RequestMethod.GET)
    public Patient getPatientById(@PathVariable int id) {
        Patient patient = patientDao.getPatientById(id);
        if (patient == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Patient not found");
        } else {
            return patient;
        }
    }
}
