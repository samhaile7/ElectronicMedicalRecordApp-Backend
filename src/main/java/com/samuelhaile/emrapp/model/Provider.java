package com.samuelhaile.emrapp.model;

import jakarta.validation.constraints.NotBlank;

public class Provider {


    private int providerId;
    @NotBlank(message = "First name required")
    private String firstName;
    @NotBlank (message = "Last name required")
    private String lastName;
    private int jobTitleId;

    public Provider() {
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

    public int getJobTitleId() {
        return jobTitleId;
    }

    public void setJobTitleId(int jobTitleId) {
        this.jobTitleId = jobTitleId;
    }
}
