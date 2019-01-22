package exercises.arrays.arraysClass.example;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        String[] names = {"Basia", "Kasia", "Wojtek", "Agnieszka", "Kacper"};
        Integer[] numbers = {5, 2, 3, 11, 64, 32, 565};

        System.out.println("numbers: ");
        printArray(numbers);

        //sorting
        System.out.println("Arrays.sort(numbers)");
        Arrays.sort(numbers);
        printArray(numbers);

        System.out.println("Arrays.binarySearch(numbers)");
        int i = Arrays.binarySearch(numbers, 64);
        System.out.println("Element found at index: " + i);

        System.out.println("=================================================");

        System.out.println("names: ");
        printArray(names);

        System.out.println("Arrays.sort(names): ");
        Arrays.sort(names);
        printArray(names);

        //copyOf
        System.out.println("NamesSecondArray as a result of Arrays.copyOf() + plus two new references added: ");
        System.out.println();
        String[] namesSecondArray = Arrays.copyOf(names, 7);
        namesSecondArray[5] = "Maciek";
        namesSecondArray[6] = "Baska";
        printArray(namesSecondArray);

        System.out.println("Sorted again: ");
        Arrays.sort(namesSecondArray);
        printArray(namesSecondArray);

        System.out.println("NamesThirdArray as a result of Arrays.copyOf(): ");
        System.out.println();
        String[] namesTrirdArray = Arrays.copyOf(namesSecondArray, 7);
        printArray(namesSecondArray);
        printArray(namesTrirdArray);
        boolean equals = Arrays.equals(namesSecondArray, namesTrirdArray);
        System.out.println("Are they equals ? : " + equals);
        System.out.println();

        System.out.println("=====================================================");

        //fill
        System.out.println("Arrays.fill()");
        System.out.println();
        String[] strings = new String[10];
        Arrays.fill(strings, "Wacek");
        printArray(strings);
    }

    public static <T> void printArray(T[] array) {
        for (T t : array) {
            System.out.println(t + " ");
        }
        System.out.println();
    }
}
