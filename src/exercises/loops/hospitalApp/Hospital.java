package exercises.loops.hospitalApp;

import java.util.Scanner;

public class Hospital {
    public static final int MAX_NUMBER = 10;
    Scanner scanner = new Scanner(System.in);
    Patient[] patients;
    int currentNum;

    public Hospital() {
        patients = new Patient[MAX_NUMBER];
        currentNum = 0;
    }

    public void addPatient() {
        if (currentNum < MAX_NUMBER) {
            System.out.println("Please type the name...");
            String name = scanner.nextLine();
            System.out.println("Please type the surname...");
            String surname = scanner.nextLine();
            System.out.println("Please type the PESEL number");
            String PESEL = scanner.nextLine();
            Patient patient = new Patient(name, surname, PESEL);
            patients[currentNum] = patient;
            System.out.println("New patient has been added to the queue");
            currentNum++;
        } else {
            System.out.println("Sorry but our system is full! Try again later");
        }
    }


    public void displayPatients() {
        for(int i = 0; i < currentNum; i++) {
            System.out.println("The list of current patients:");
            System.out.println(patients[i].toString());
        }
    }
}

