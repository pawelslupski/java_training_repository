package exercises.collections.lists;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Adder {
    public static final String EXIT = "EXIT";

    public static void main(String[] args) {
        List<Double> numbers = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in);) {
            add(scanner, numbers);
            printData(numbers);
        }
    }

    private static void add(Scanner scanner, List<Double> list) {
        System.out.println("Type next number you'd like to add or \"EXIT\" to quit");
        String option = scanner.nextLine();

        if (option.equals(Adder.EXIT))
            return;

        try {
            Double number = Double.parseDouble(option);
            list.add(number);
        } catch (InputMismatchException ex) {
            System.out.println("Sorry but the format is incorrect. Try again!");
        }
        add(scanner, list);
    }

    static void printData(List<Double> list) {
        StringBuilder builder = new StringBuilder();
        double sum = 0;
        for(double d: list) {
           builder.append(d);
           builder.append("+");
           sum += d;
        }
        builder.replace(builder.length()-1, builder.length(), "=");
        builder.append(sum);
        System.out.println(builder.toString());
    }
}