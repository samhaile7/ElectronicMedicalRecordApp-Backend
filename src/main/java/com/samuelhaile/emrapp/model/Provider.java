package com.samuelhaile.emrapp.model;

import jakarta.validation.constraints.NotBlank;

public class Provider {


    private int providerId;
    @NotBlank(message = "First name required")
    private String firstName;
    @NotBlank (message = "Last name required")
    private String lastName;
    @NotBlank(message = "Title required")
    private String jobTitle;

    public Provider() {
    }

    public Provider(String firstName, String lastName, String jobTitle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
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

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}
