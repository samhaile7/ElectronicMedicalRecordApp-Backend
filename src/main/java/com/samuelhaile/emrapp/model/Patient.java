package com.samuelhaile.emrapp.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public class Patient {

    //Attributes

    private int patientId;
    @NotBlank(message = "First name required")
    private String firstName;
    @NotBlank(message = "Last name required")
    private String lastName;
    @NotNull(message = "Birth date required")
    private LocalDate birthDate;
    @NotNull(message = "Admit date required")
    private LocalDate admitDate;
    @NotNull(message = "Pulse rate required")
    private int pulseRate;
    @NotNull(message = "Respiration rate required")
    private int respirationRate;
    @NotNull(message = "Temperature required")
    private int temperature;
    @NotNull(message = "SpO2 required")
    private int sPO2;
    @NotNull(message = "PTT required")
    private int partialThromboplastinTime;
    @NotNull(message = "Systolic Pressure required")
    private int systolicBloodPressure;
    @NotNull(message = "Diastolic Pressure required")
    private int diastolicBloodPressure;

    private int mobilityStatusId;


    public Patient() {
    }

    public Patient(String firstName, String lastName, LocalDate birthDate, LocalDate admitDate, int pulseRate, int respirationRate, int temperature, int sPO2, int partialThromboplastinTime, int systolicBloodPressure, int diastolicBloodPressure, int mobilityStatusId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.admitDate = admitDate;
        this.pulseRate = pulseRate;
        this.respirationRate = respirationRate;
        this.temperature = temperature;
        this.sPO2 = sPO2;
        this.partialThromboplastinTime = partialThromboplastinTime;
        this.systolicBloodPressure = systolicBloodPressure;
        this.diastolicBloodPressure = diastolicBloodPressure;
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

    public int getPulseRate() {
        return pulseRate;
    }

    public void setPulseRate(int pulseRate) {
        this.pulseRate = pulseRate;
    }

    public int getRespirationRate() {
        return respirationRate;
    }

    public void setRespirationRate(int respirationRate) {
        this.respirationRate = respirationRate;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getsPO2() {
        return sPO2;
    }

    public void setsPO2(int sPO2) {
        this.sPO2 = sPO2;
    }

    public int getPartialThromboplastinTime() {
        return partialThromboplastinTime;
    }

    public void setPartialThromboplastinTime(int partialThromboplastinTime) {
        this.partialThromboplastinTime = partialThromboplastinTime;
    }

    public int getSystolicBloodPressure() {
        return systolicBloodPressure;
    }

    public void setSystolicBloodPressure(int systolicBloodPressure) {
        this.systolicBloodPressure = systolicBloodPressure;
    }

    public int getDiastolicBloodPressure() {
        return diastolicBloodPressure;
    }

    public void setDiastolicBloodPressure(int diastolicBloodPressure) {
        this.diastolicBloodPressure = diastolicBloodPressure;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientId=" + patientId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", admitDate=" + admitDate +
                ", pulseRate=" + pulseRate +
                ", respirationRate=" + respirationRate +
                ", temperature=" + temperature +
                ", sPO2=" + sPO2 +
                ", partialThromboplastinTime=" + partialThromboplastinTime +
                ", systolicBloodPressure=" + systolicBloodPressure +
                ", diastolicBloodPressure=" + diastolicBloodPressure +
                ", mobilityStatusId=" + mobilityStatusId +
                '}';
    }
}
