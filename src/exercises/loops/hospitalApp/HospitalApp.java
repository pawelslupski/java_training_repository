package exercises.loops.hospitalApp;

import java.util.Scanner;

public class HospitalApp {
    public static final int EXIT = 0;
    public static final int ADD = 1;
    public static final int SHOW = 2;

    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        System.out.println("Welcome to our hospital app");

        while (choice != EXIT) {
            System.out.println("Please type \"1\" to add new patient");
            System.out.println("Please type \"2\" to show all patients");
            System.out.println("Please type \"0\" to exit the game");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case ADD:
                    hospital.addPatient();
                    break;
                case SHOW:
                    hospital.displayPatients();
                    break;
                case EXIT:
                    System.out.println("Thanks for your visit!See you soon:)");
                    break;
                default:
                    System.out.println("There is no such option! Try again!");
            }
        }
    }
}