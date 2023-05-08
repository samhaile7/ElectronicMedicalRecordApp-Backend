package com.samuelhaile.emrapp.dao;

import com.samuelhaile.emrapp.model.Patient;
import com.samuelhaile.emrapp.model.Provider;

import java.util.List;

public interface ProviderDao {


    List<Provider> listAllProviders();
    Provider getProviderById(int providerId);
    Provider createProvider(Provider provider);
    void deleteProvider(int providerId);
    void updateProvider(Provider provider);
    List<Patient> listAllPatientsUnderProvider();




}
