package com.samuelhaile.emrapp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.List;

@Entity(name = "Provider")
public class Provider {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long providerId;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false, unique = true)
    private String email;

    @ManyToOne
    @JoinColumn(name = "job_id")
    private Job job;

//    @OneToMany(mappedBy = "provider")
//    private List<Patient> patientsUnderProvider;

//    @ManyToMany(mappedBy = "patientProviders")
//    List<Patient> patientsUnderProvider;




    public Provider() {
    }

    public Provider(Long providerId, String firstName, String lastName, String email, Job job) {
        this.providerId = providerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.job = job;

    }

    public Long getProviderId() {
        return providerId;
    }

    public void setProviderId(Long providerId) {
        this.providerId = providerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }




}
