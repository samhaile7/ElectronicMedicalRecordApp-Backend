package com.samuelhaile.emrapp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity(name = "Provider")
public class Provider {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int providerId;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private int jobTitleId;

    public Provider() {
    }

    public Provider(int providerId, String firstName, String lastName, String email, int jobTitleId) {
        this.providerId = providerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.jobTitleId = jobTitleId;
    }

    public Provider(String firstName, String lastName, int jobTitleId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobTitleId = jobTitleId;
    }

    public int getProviderId() {
        return providerId;
    }

    public void setProviderId(int providerId) {
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

    public int getJobTitleId() {
        return jobTitleId;
    }

    public void setJobTitleId(int jobTitleId) {
        this.jobTitleId = jobTitleId;
    }

    @Override
    public String toString() {
        return "Provider{" +
                "providerId=" + providerId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", jobTitleId=" + jobTitleId +
                '}';
    }
}
