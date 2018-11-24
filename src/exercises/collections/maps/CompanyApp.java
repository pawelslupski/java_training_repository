package exercises.collections.maps;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CompanyApp {
    private static final int EXIT = 0;
    private static final int ADD_EMPLOYEE = 1;
    private static final int FIND_EMPLOYEE = 2;
    private static final String HELLO = "Welcome to the program:)";
    private static final String GOODBYE = "Thanks for using our app. See you soon!";
    private Company company;

    public static void main(String[] args) {
        Company company = new Company();
        controlLoop(company);
    }

    private static void controlLoop(Company company) {
        System.out.println(HELLO);
        try (Scanner scanner = new Scanner(System.in);) {
            int option = -1;
            while (option != EXIT) {
                showOptions();
                option = scanner.nextInt();
                scanner.nextLine();
                switch (option) {
                    case ADD_EMPLOYEE:
                        if (addEmployee(scanner, company)) {
                            System.out.println("Employee was successfully added to the database");
                        } else {
                            System.out.println("Something went wrong while adding new employee. Try again!");
                        }
                        break;
                    case FIND_EMPLOYEE:
                        System.out.println(findEmployee(scanner, company));
                        break;
                    case EXIT:
                        System.out.println(GOODBYE);
                        break;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("The format of input is incorrect.Try again!");
            controlLoop(company);
        }
    }

    private static void showOptions() {
        System.out.println("Choose the option:");
        System.out.println("1 - add new employee");
        System.out.println("2 - find employee");
        System.out.println("0 - exit the program");
    }

    private static boolean addEmployee(Scanner scanner, Company company) {
        System.out.println("Let's add new employee");
        System.out.println("Please type the name");
        String name = scanner.nextLine();
        System.out.println("Please type the surname");
        String surname = scanner.nextLine();
        System.out.println("Please type the salary");
        double salary = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Please type the PESEL number");
        String PESEL = scanner.nextLine();

        Employee employee = new Employee(name, surname, salary, PESEL);
        return company.addEmployee(employee);
    }

    private static String findEmployee(Scanner scanner, Company company) {
        System.out.println("Let's find the employee");
        System.out.println("Please type the firstName");
        String firstName = scanner.nextLine();
        System.out.println("Please type the lastName");
        String lastName = scanner.nextLine();

        return company.findEmployee(firstName, lastName);
    }
}
