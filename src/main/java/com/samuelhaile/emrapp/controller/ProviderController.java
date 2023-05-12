package com.samuelhaile.emrapp.controller;


import com.samuelhaile.emrapp.dao.PatientDao;
import com.samuelhaile.emrapp.dao.ProviderDao;
import com.samuelhaile.emrapp.model.Patient;
import com.samuelhaile.emrapp.model.Provider;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class ProviderController {
    private ProviderDao providerDao;

    public ProviderController(ProviderDao providerDao) {
        this.providerDao = providerDao;
    }

    @RequestMapping(path = "/providers/{providerId}/patients", method = RequestMethod.GET)
    public List<Patient> getAllPatientsByProvider(@PathVariable int providerId) {
        return providerDao.listAllPatientsUnderProvider(providerId);
    }

    @RequestMapping(path = "/providers/{providerId}/role", method = RequestMethod.GET)
    public String getProviderRoleByProviderId(@PathVariable int providerId) {
        return providerDao.getProviderRole(providerId);
    }

    @RequestMapping(path = "/providers", method = RequestMethod.GET)
    public List<Provider> listAllProviders() {
        return providerDao.listAllProviders();
    }

    @RequestMapping(path = "/providers/{providerId}", method = RequestMethod.GET)
    public Provider getProviderById(@PathVariable int providerId) {
        Provider provider = providerDao.getProviderById(providerId);
        if (provider == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Provider Not Found");
        } else {
            return provider;
        }
    }

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(path = "/providers", method = RequestMethod.POST)
    public Provider createProvider(@RequestBody @Valid Provider newProvider) {
        return providerDao.createProvider(newProvider);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @RequestMapping(path = "/providers/{providerId}", method = RequestMethod.DELETE)
    public void deleteProvider( @PathVariable int providerId) {
        if (providerDao.getProviderById(providerId) == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Provider Not Found");
        }
        providerDao.deleteProvider(providerId);
    }


    @RequestMapping(path = "/providers", method = RequestMethod.PUT)
    public void updateProvider( @RequestBody @Valid  Provider providerToUpdate) {
        if (providerDao.getProviderById(providerToUpdate.getProviderId()) == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Provider Not Found");
        }
        providerDao.updateProvider(providerToUpdate);
    }

}
