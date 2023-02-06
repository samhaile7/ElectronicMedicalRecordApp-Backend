package sh_patient_ehr;

public class Patient {

    //Attributes

    private String firstName;
    private String lastName;
    private int age;
    private int idNumber;

    //Constructor

    public Patient() {};

    public Patient(String firstName, String lastName, int age, int idNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.idNumber = idNumber;
    }

    // Add getters and setters once added all attributes (labs especially)

}
