package com.samuelhaile.emrapp.controller;


import com.samuelhaile.emrapp.PatientRepository;
import com.samuelhaile.emrapp.ProviderRepository;
import com.samuelhaile.emrapp.dao.ProviderDao;
import com.samuelhaile.emrapp.model.Job;
import com.samuelhaile.emrapp.model.Patient;
import com.samuelhaile.emrapp.model.Provider;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin

public class ProviderControllerJPA {

    @Autowired
    ProviderRepository providerRepository;
    @Autowired
    PatientRepository patientRepository;

    @RequestMapping(path = "/providers", method = RequestMethod.GET)
    public List<Provider> listAllProviders() {
        return providerRepository.findAll();
    }

        @RequestMapping(path = "/providers/{providerId}", method = RequestMethod.GET)
    public Provider getProviderById(@PathVariable Long providerId) {
            if (providerRepository.findByProviderId(providerId) == null){
                throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Provider Not Found");
            }
            return providerRepository.findByProviderId(providerId);
        }



        @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(path = "/providers", method = RequestMethod.POST)
    public Provider createProvider(@RequestBody @Valid Provider newProvider) {
        return providerRepository.save(newProvider);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(path = "/providers/{providerId}/pickup", method = RequestMethod.POST)
    public void pickupPatient(@RequestBody @Valid Patient patient, @PathVariable long providerId) {
        if (providerRepository.findByProviderId(providerId) == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Provider Not Found");
        }
                 patient.setProvider(providerRepository.findByProviderId(providerId));
                 patientRepository.save(patient);
    }



        @ResponseStatus(HttpStatus.NO_CONTENT)
    @RequestMapping(path = "/providers/{providerId}", method = RequestMethod.DELETE)
    public void deleteProvider( @PathVariable Long providerId) {
            if (providerRepository.findByProviderId(providerId) == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Provider Not Found");
        }
        providerRepository.delete(providerRepository.findByProviderId(providerId));
    }




        @RequestMapping(path = "/providers", method = RequestMethod.PUT)
    public void updateProvider( @RequestBody @Valid  Provider providerToUpdate) {
        if (providerRepository.findByProviderId(providerToUpdate.getProviderId()) == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Provider Not Found");
        }
        providerRepository.save(providerToUpdate);
    }


        @RequestMapping(path = "/providers/{providerId}/patients", method = RequestMethod.GET)
    public List<Patient> getAllPatientsByProvider(@PathVariable Long providerId) {
        if (providerRepository.findByProviderId(providerId) == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Provider Not Found");
        }
        return providerRepository.findByProviderId(providerId).getPatientsUnderProvider();
    }

    @RequestMapping(path = "/providers/{providerId}/role", method = RequestMethod.GET)
    public Job getProviderRoleByProviderId(@PathVariable Long providerId) {

        if (providerRepository.findByProviderId(providerId) == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Provider Not Found");
        }
        return providerRepository.findByProviderId(providerId).getJob();
    }

}
