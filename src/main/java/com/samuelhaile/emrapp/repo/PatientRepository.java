package com.samuelhaile.emrapp.repo;

import com.samuelhaile.emrapp.model.Patient;
import com.samuelhaile.emrapp.model.Provider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {

   // Provider getProviderByProviderById(Long providerId);

   Patient findByPatientId(Long patientId);



}
