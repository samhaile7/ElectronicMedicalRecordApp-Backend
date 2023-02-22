package samhaile.project;

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

    //Constructors

    public Patient() {};

    public Patient(String firstName, String lastName, int age, boolean isOnThrombolytics) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isOnThrombolytics = isOnThrombolytics;
   
        
    }

    // Add getters and setters once added all attributes (labs especially)


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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isOnThrombolytics() {
        return isOnThrombolytics;
    }

    public void setOnThrombolytics(boolean onThrombolytics) {
        isOnThrombolytics = onThrombolytics;
    }

    public boolean isClearForMobility() {
        return isClearForMobility;
    }

    public void setClearForMobility(boolean clearForMobility) {
        isClearForMobility = clearForMobility;
    }

    public int getPartialThromboplastinTimePTT() {
        return partialThromboplastinTimePTT;
    }

    public void setPartialThromboplastinTimePTT(int partialThromboplastinTimePTT) {
        this.partialThromboplastinTimePTT = partialThromboplastinTimePTT;
    }

    public int getSystolicBloodPressureSP() {
        return systolicBloodPressureSP;
    }

    public void setSystolicBloodPressureSP(int systolicBloodPressureSP) {
        this.systolicBloodPressureSP = systolicBloodPressureSP;
    }

    public int getDiastolicBloodPressureDP() {
        return diastolicBloodPressureDP;
    }

    public void setDiastolicBloodPressureDP(int diastolicBloodPressureDP) {
        this.diastolicBloodPressureDP = diastolicBloodPressureDP;
    }

    public int getHeartRateHR() {
        return heartRateHR;
    }

    public void setHeartRateHR(int heartRateHR) {
        this.heartRateHR = heartRateHR;
    }
}
