package com.samuelhaile.emrapp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

@Entity(name = "Patient")
public class Patient {

    //Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long patientId;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false)
    private LocalDate birthDate;
    @Column(nullable = false)
    private LocalDate admitDate;
    @Column(nullable = false)
    private int pulseRate;
    @Column(nullable = false)
    private int respirationRate;
    @Column(nullable = false)
    private int temperature;
    @Column(nullable = false)
    private int sPO2;
    @Column(nullable = false)
    private int partialThromboplastinTime;
    @Column(nullable = false)
    private int systolicBloodPressure;
    @Column(nullable = false)
    private int diastolicBloodPressure;
    @Column(nullable = false)

    private int mobilityStatusId;

    public Patient() {
    }

    public Patient(Long patientId, String firstName, String lastName, LocalDate birthDate, LocalDate admitDate, int pulseRate, int respirationRate, int temperature, int sPO2, int partialThromboplastinTime, int systolicBloodPressure, int diastolicBloodPressure, int mobilityStatusId) {
        this.patientId = patientId;
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

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
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
