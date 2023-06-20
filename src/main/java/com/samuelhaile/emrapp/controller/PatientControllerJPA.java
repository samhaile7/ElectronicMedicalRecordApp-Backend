package com.samuelhaile.emrapp.controller;

import com.samuelhaile.emrapp.repo.PatientRepository;
import com.samuelhaile.emrapp.repo.ProviderRepository;
import com.samuelhaile.emrapp.model.Patient;
import com.samuelhaile.emrapp.model.RangeCheckerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@CrossOrigin

public class PatientControllerJPA {

    @Autowired
    ProviderRepository providerRepository;
    @Autowired
    PatientRepository patientRepository;
    @Autowired
    RangeCheckerService rangeCheckerService;


    @RequestMapping(path = "/patients", method = RequestMethod.GET)
    public List<Patient> listAllPatients() {
        return patientRepository.findAll();
    }


    @RequestMapping(path = "/patients/{id}", method = RequestMethod.GET)
    public Patient getPatientById(@PathVariable Long id) {
        Patient patient = patientRepository.findByPatientId(id);
        if (patient == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Patient Not Found");
        } else {
            return patient;
        }
    }


    @ResponseStatus (HttpStatus.CREATED)
    @RequestMapping(path = "/patients", method = RequestMethod.POST)
    public Patient createPatient(@RequestBody @Valid Patient newPatient) {
        Patient patientWithUpdatedMobilityStatus = rangeCheckerService.assignPatientMobilityStatus(newPatient);
        return patientWithUpdatedMobilityStatus;
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @RequestMapping(path = "/patients/{id}", method = RequestMethod.DELETE)
    public void deletePatient( @PathVariable Long id) {
        if (patientRepository.findByPatientId(id) == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Patient Not Found");
        }
         patientRepository.delete(patientRepository.findByPatientId(id));
    }


    @RequestMapping(path = "/patients", method = RequestMethod.PUT)
    public void updatePatient( @RequestBody @Valid  Patient patientToUpdate) {
        if (patientRepository.findByPatientId(patientToUpdate.getPatientId()) == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Patient Not Found");
        }
        Patient patientWithUpdatedMobilityStatus = rangeCheckerService.assignPatientMobilityStatus(patientToUpdate);
        patientRepository.save(patientWithUpdatedMobilityStatus);
    }

    //Add association for join table here

}
