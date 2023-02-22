package sh_patient_ehr;

import sh_patient_ehr.dao.UserInterface;

public class ElectronicHealthRecordApp {
    public static void main(String[] args) {
        ElectronicHealthRecordApp electronicHealthRecordApp = new ElectronicHealthRecordApp();

        electronicHealthRecordApp.run();


        //Display Welcome! here is a list of patients: and their details
        //Display Master array list
        // display time
        //What would you like to do?
        // 1 update record (usa Patient dao to update record in database)
        // 2 Get mobility status
        // 3 discharge (are you sure?) then add a discharged
        // 4 add new patient (create new patient object, pass it to PAtient DAO interface to add to SQL table)
        // 5 view patient dashboard (uses patient DAo to show current list of patients)
            // enter name, last name etc.and add to constructor
            // print success! Patient created: you will find them on patient dashboard
        // 4 logger system with time functionality into a text file

    }

    private void run(){
        UserInterface userInterface = new UserInterface();
        userInterface.displayWelcomePage();
        userInterface.displayChoices();

    }
}