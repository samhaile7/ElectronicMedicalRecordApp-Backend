package com.samuelhaile.emrapp;

import com.samuelhaile.emrapp.model.Job;
import com.samuelhaile.emrapp.model.Provider;
import com.samuelhaile.emrapp.repo.NoteRepository;
import com.samuelhaile.emrapp.repo.PatientRepository;
import com.samuelhaile.emrapp.repo.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class Demodata {

    @Autowired
    ProviderRepository providerRepository;
    @Autowired
    PatientRepository patientRepository;
    @Autowired
    NoteRepository noteRepository;



    public static void  addDemoData() {

        Job job1 = new Job();
        job1.setJobTitle("Physician");

        Job job2 = new Job();
        job1.setJobTitle("Therapist");

        Job job3 = new Job();
        job1.setJobTitle("Nurse");


        Provider provider1 = new Provider();
        provider1.setFirstName("Serena");
        provider1.setLastName("Williams");
        provider1.setEmail("erreer@gmail.com");


        Provider provider2 = new Provider();
        provider2.setFirstName("Roger");
        provider2.setLastName("Federer");
        provider2.setEmail("roger@gmail.com");


}
}
