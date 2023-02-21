package sh_patient_ehr;

public class Patient {

    //Attributes
    
    private int patientId;
    private String firstName;
    private String lastName;
    private int age;
    private boolean isOnThrombolytics;
    private boolean isClearForMobility;

    //attributes for lab values
    private int partialThromboplastinTimePTT;
    private int systolicBloodPressureSP;
    private int diastolicBloodPressureDP;
    private int heartRateHR;
    
    //update labs methods with new values as parameters
    //

    //Constructor

    public Patient() {};

    public Patient(String firstName, String lastName, int age, int uniqueIdentifier) {
        this.patientId = patientId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        
    }

    // Add getters and setters once added all attributes (labs especially)

}
