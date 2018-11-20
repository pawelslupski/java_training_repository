package exercises.input;

import java.util.Locale;
import java.util.Scanner;

public class CalcProcessor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.println("Please type the first digit");
        double a = input.nextDouble();
        input.nextLine();
        System.out.println("Please type the operation you want to process: \"+\"" + ", " + "\"-\"" +
                ", " + "\"*\"" + ", " + "\"/\"");
        String option = input.nextLine();
        System.out.println("Please type the second digit");
        double b = input.nextDouble();
        input.nextLine();
        input.close();

        Calculator calculator = new Calculator();
        double result = calculator.calculate(a, b, option);
        System.out.println("The result is: " + result);
    }
}
