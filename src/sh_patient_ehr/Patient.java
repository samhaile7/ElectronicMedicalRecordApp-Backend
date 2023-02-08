package sh_patient_ehr;

public class Patient {

    //Attributes

    private String firstName;
    private String lastName;
    private int age;
    private int uniqueIdentifier;
    private boolean isOnThrombolytics;
    boolean clearedForMobility;

    //Constructor

    public Patient() {};

    public Patient(String firstName, String lastName, int age, int uniqueIdentifier) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.uniqueIdentifier = uniqueIdentifier;
    }

    // Add getters and setters once added all attributes (labs especially)

}
