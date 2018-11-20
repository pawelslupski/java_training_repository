package exercises.arrays.program;

public class ArraysProcessor {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        numbers[0] = 2;
        numbers[1] = 5;
        numbers[2] = 12;
        int[] numbersTwo = new int[3];
        numbersTwo[0] = 6;
        numbersTwo[1] = 7;
        numbersTwo[2] = 9;

        int addResult = numbers[0] + numbers[1] + numbers[2] + numbersTwo[0] + numbersTwo[1] + numbersTwo[2];
        System.out.println("The sum of all array elements equals = " + addResult);
    }
}
