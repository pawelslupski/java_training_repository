package exercises.loops;

import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, please type how many numbers would you like to add together");
        int counter = scanner.nextInt();
        int sum = 0;
        while(counter > 0) {
            System.out.println("Please type next digit");
            sum += scanner.nextInt();
            counter--;
        }
        System.out.println("The sum of your numbers equals: " + sum);
        scanner.close();
    }
}
