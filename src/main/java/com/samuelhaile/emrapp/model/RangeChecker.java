package com.samuelhaile.emrapp.model;

public class RangeChecker {

    // Add min and max lab values here, final constants
    final double MIN_SYSTOLIC_PRESSURE = 0;
    final double MAX_SYSTOLIC_PRESSURE = 0;
    final double MIN_DIASTOLIC_PRESSURE = 0;
    final double MAX_DIASTOLIC_PRESSURE = 0;
    final double MIN_PARTIAL_THROMBOPLASTIN_TIME = 0;
    final double MAX_PARTIAL_THROMBOPLASTIN_TIME = 0;
    final double MIN_PULSE = 0;
    final double MAX_PULSE = 0;
    final double MIN_RESPIRATION_RATE = 0;
    final double MAX_RESPIRATION_RATE = 0;
    final double MIN_TEMPERATURE = 0;
    final double MAX_TEMPERATURE = 0;
    final double MIN_OXYGEN_SPO2 = 0;
    final double MAX_OXYGEN_SPO2 = 0;


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
        if (patient.getsPO2() > MAX_OXYGEN_SPO2 || patient.getsPO2() < MIN_OXYGEN_SPO2){
            output = false;
        };

        return output;
    }

}
