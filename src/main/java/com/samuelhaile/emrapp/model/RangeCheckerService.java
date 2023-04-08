package com.samuelhaile.emrapp.model;


public class RangeCheckerService {

    // Add min and max lab values here, final constants
    final double MIN_SYSTOLIC_PRESSURE = 90;
    final double MAX_SYSTOLIC_PRESSURE = 159;
    final double MIN_DIASTOLIC_PRESSURE = 60;
    final double MAX_DIASTOLIC_PRESSURE = 99;
    final double MIN_PARTIAL_THROMBOPLASTIN_TIME = 11;
    final double MAX_PARTIAL_THROMBOPLASTIN_TIME = 22;
    final double MIN_PULSE = 40;
    final double MAX_PULSE = 140;
    final double MIN_RESPIRATION_RATE = 10;
    final double MAX_RESPIRATION_RATE = 24;
    final double MIN_TEMPERATURE = 95;
    final double MAX_TEMPERATURE = 99.5;
    final double MIN_OXYGEN_SPO2 = 90;


    //update mobility status method(patient) with patient as a parameter
    // compares current patient lab values(getter from Patient class
    // to constant ranges, set mobility status

    public Patient setPatientMobilityStatus(Patient patient) {
        if (valuesWithinRange(patient)) {
            patient.setMobilityStatusId(1);
        }
        else {
            patient.setMobilityStatusId(2);
        }
        return patient;

    }

    private boolean valuesWithinRange(Patient patient) {
        boolean output = true;
        if (patient.getDiastolicBloodPressure() > MAX_DIASTOLIC_PRESSURE || patient.getDiastolicBloodPressure() < MIN_DIASTOLIC_PRESSURE) {
            output = false;
        };
        if (patient.getSystolicBloodPressure() > MAX_SYSTOLIC_PRESSURE || patient.getSystolicBloodPressure() < MIN_SYSTOLIC_PRESSURE){
            output = false;
        };
        if (patient.getPartialThromboplastinTime() > MAX_PARTIAL_THROMBOPLASTIN_TIME || patient.getPartialThromboplastinTime() < MIN_PARTIAL_THROMBOPLASTIN_TIME){
            output = false;
        };
        if (patient.getPulseRate() > MAX_PULSE || patient.getPulseRate() < MIN_PULSE){
            output = false;
        };
        if (patient.getRespirationRate() > MAX_RESPIRATION_RATE || patient.getRespirationRate() < MIN_RESPIRATION_RATE){
            output = false;
        };
        if (patient.getTemperature() > MAX_TEMPERATURE || patient.getTemperature() < MIN_TEMPERATURE){
            output = false;
        };
        if (patient.getsPO2() < MIN_OXYGEN_SPO2){
            output = false;
        };

        return output;
    }

}
