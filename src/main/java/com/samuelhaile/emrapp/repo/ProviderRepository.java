package com.samuelhaile.emrapp.repo;

import com.samuelhaile.emrapp.model.Provider;
import com.samuelhaile.emrapp.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProviderRepository extends JpaRepository<Provider, Long> {

   // Provider getProviderByProviderById(Long providerId);
   Provider findByProviderId(Long providerId);



}
