package exercises.inputOutput;

import java.io.*;
import java.util.Scanner;

public class CompanyApp {
    public static final String FILE_NAME = "src/exercises/inputOutput/employees.txt";
    public static final int READ_FROM_USER = 1;
    public static final int READ_FROM_FILE = 2;

    public static void main(String[] args) {
        File file = new File("src/exercises/inputOutput/employees.txt");
        Scanner sc = new Scanner(System.in);
        Company company = new Company();
        CompanyApp companyApp = new CompanyApp();

        displayOptions();
        int option = sc.nextInt();
        sc.nextLine();

        switch(option) {
            case READ_FROM_USER:
                companyApp.readFromUser(company);
                break;
            case READ_FROM_FILE:
              companyApp.readFromFile(company);
        }
        sc.close();
    }

    private void readFromUser(Company company) {
        try (Scanner scanner = new Scanner(System.in);
             FileOutputStream fos = new FileOutputStream(FILE_NAME);
             ObjectOutputStream oos = new ObjectOutputStream(fos);
             ) {

            for (int i = 0; i < Company.MAX_SIZE; i++) {
                System.out.println("Creating new employee...");
                System.out.println("Please type the name:");
                String name = scanner.nextLine();
                System.out.println("Please type the surname:");
                String surname = scanner.nextLine();
                System.out.println("Please insert the salary:");
                double salary = scanner.nextDouble();
                scanner.nextLine();

                company.addEmployee(new Employee(name, surname, salary), i);
            }
            oos.writeObject(company);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private void readFromFile(Company company) {
        try (FileInputStream fis = new FileInputStream(FILE_NAME);
             ObjectInputStream ois = new ObjectInputStream(fis);
        ) {
            company = (Company) ois.readObject();
            for (int i = 0; i < Company.MAX_SIZE; i++) {
                System.out.println(company.getEmployees()[i]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void displayOptions() {
        System.out.println("Insert your data - " + READ_FROM_USER);
        System.out.println("Load data from file - " + READ_FROM_FILE);
    }
}
