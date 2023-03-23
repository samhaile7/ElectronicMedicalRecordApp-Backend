package com.samuelhaile.emrapp.model;

public class LabChart {

    private int labChartId;
    private int patientId;
    private int pulseRate;
    private int respirationRate;
    private int temperature;
    private int sPO2;
    private int partialThromboplastinTime;
    private int systolicBloodPressure;
    private int diastolicBloodPressure;

    public LabChart() {
    }

    public LabChart(int patientId, int pulseRate, int respirationRate, int temperature, int sPO2, int partialThromboplastinTime, int systolicBloodPressure, int diastolicBloodPressure) {
        this.patientId = patientId;
        this.pulseRate = pulseRate;
        this.respirationRate = respirationRate;
        this.temperature = temperature;
        this.sPO2 = sPO2;
        this.partialThromboplastinTime = partialThromboplastinTime;
        this.systolicBloodPressure = systolicBloodPressure;
        this.diastolicBloodPressure = diastolicBloodPressure;
    }

    public int getLabChartId() {
        return labChartId;
    }

    public void setLabChartId(int labChartId) {
        this.labChartId = labChartId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
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
        return "LabChart{" +
                "labChartId=" + labChartId +
                ", patientId=" + patientId +
                ", pulseRate=" + pulseRate +
                ", respirationRate=" + respirationRate +
                ", temperature=" + temperature +
                ", sPO2=" + sPO2 +
                ", partialThromboplastinTime=" + partialThromboplastinTime +
                ", systolicBloodPressure=" + systolicBloodPressure +
                ", diastolicBloodPressure=" + diastolicBloodPressure +
                '}';
    }
}
