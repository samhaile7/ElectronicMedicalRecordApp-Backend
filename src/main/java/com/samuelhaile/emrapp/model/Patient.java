package com.samuelhaile.emrapp.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public class Patient {

    //Attributes

    private int patientId;
    @NotBlank (message = "First name required")
    private String firstName;
    @NotBlank (message = "Last name required")
    private String lastName;
    @NotNull (message = "Birth date required")
    private LocalDate birthDate;
    @NotNull (message = "Admit date required")
    private LocalDate admitDate;
    private int mobilityStatusId;




    public Patient() {
    }

    public Patient(String firstName, String lastName, LocalDate birthDate, LocalDate admitDate, int mobilityStatusId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.admitDate = admitDate;
        this.mobilityStatusId = mobilityStatusId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getAdmitDate() {
        return admitDate;
    }

    public void setAdmitDate(LocalDate admitDate) {
        this.admitDate = admitDate;
    }

    public int getMobilityStatusId() {
        return mobilityStatusId;
    }

    public void setMobilityStatusId(int mobilityStatusId) {
        this.mobilityStatusId = mobilityStatusId;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientId=" + patientId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", admitDate=" + admitDate +
                ", mobilityStatusId=" + mobilityStatusId +
                '}';
    }
}
