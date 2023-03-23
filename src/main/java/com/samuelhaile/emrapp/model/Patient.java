package com.samuelhaile.emrapp.model;

public class Patient {

    //Attributes

    private int patientId;
    private String firstName;
    private String lastName;
    private String birthDate;
    private String admitDate;
    private String mobilityStatusId;


    private int labChartId;
    private int pulseRate;
    private int respirationRate;
    private int temperature;
    private int sPO2;
    private int partialThromboplastinTime;
    private int systolicBloodPressure;
    private int diastolicBloodPressure;

    private int noteId;
    private String noteDetails;
    private String dateNoteAdded;

    public Patient() {
    }

    public Patient(String firstName, String lastName, String birthDate, String admitDate, String mobilityStatusId, int pulseRate, int respirationRate, int temperature, int sPO2, int partialThromboplastinTime, int systolicBloodPressure, int diastolicBloodPressure, String noteDetails, String dateNoteAdded) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.admitDate = admitDate;
        this.mobilityStatusId = mobilityStatusId;
        this.pulseRate = pulseRate;
        this.respirationRate = respirationRate;
        this.temperature = temperature;
        this.sPO2 = sPO2;
        this.partialThromboplastinTime = partialThromboplastinTime;
        this.systolicBloodPressure = systolicBloodPressure;
        this.diastolicBloodPressure = diastolicBloodPressure;
        this.noteDetails = noteDetails;
        this.dateNoteAdded = dateNoteAdded;
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

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAdmitDate() {
        return admitDate;
    }

    public void setAdmitDate(String admitDate) {
        this.admitDate = admitDate;
    }

    public String getMobilityStatusId() {
        return mobilityStatusId;
    }

    public void setMobilityStatusId(String mobilityStatusId) {
        this.mobilityStatusId = mobilityStatusId;
    }

    public int getLabChartId() {
        return labChartId;
    }

    public void setLabChartId(int labChartId) {
        this.labChartId = labChartId;
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

    public int getNoteId() {
        return noteId;
    }

    public void setNoteId(int noteId) {
        this.noteId = noteId;
    }

    public String getNoteDetails() {
        return noteDetails;
    }

    public void setNoteDetails(String noteDetails) {
        this.noteDetails = noteDetails;
    }

    public String getDateNoteAdded() {
        return dateNoteAdded;
    }

    public void setDateNoteAdded(String dateNoteAdded) {
        this.dateNoteAdded = dateNoteAdded;
    }
}
