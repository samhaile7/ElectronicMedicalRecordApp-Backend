package sh_patient_ehr.dao;

import java.util.Scanner;

public class UserInterface {

    private Scanner userInput = new Scanner(System.in);
    public void displayWelcomePage() {
        System.out.println("***************************************");
        System.out.println("Welcome to Sam Haile Memorial Hospital Electronic Health Record System");
        System.out.println("***************************************");
    }

    public void displayChoices() {
        System.out.println("1. View my Patient Dashboard");
        System.out.println("2. Check if Patient is Clear for Therapy");
        System.out.println("3. Update Patient Info");
        System.out.println("4. Add New Patient");
        System.out.println("5. Discharge Patient");

    }

    //Getuserchoice methods gets user input and returns it
}
