package com.samuelhaile.emrapp.controller;

import com.samuelhaile.emrapp.dao.JdbcPatientDao;
import com.samuelhaile.emrapp.dao.PatientDao;
import com.samuelhaile.emrapp.model.Patient;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
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
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Patient Not Found");
        } else {
            return patient;
        }
    }


    @ResponseStatus (HttpStatus.CREATED)
    @RequestMapping(path = "/patients", method = RequestMethod.POST)
    public Patient createPatient(@RequestBody @Valid Patient newPatient) {
        return patientDao.createPatient(newPatient);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @RequestMapping(path = "/patients/{id}", method = RequestMethod.DELETE)
    public void deletePatient( @PathVariable int id) {
        if (patientDao.getPatientById(id) == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Patient Not Found");
        }
         patientDao.deletePatient(id);
    }

}
