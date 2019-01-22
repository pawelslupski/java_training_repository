package exercises.genericClassAndMethods.task.example;

public class GenericMethods {
    public static void main(String[] args) {
        Integer[] numArray = {1, 2, 3, 4, 5};
        Character[] charArray = {'a', 'b', 'c', 'd', 'e'};

        displayElements(numArray);
        displayElements(charArray);

        print5Times(2);
        print5Times("Krzysio");
    }

    public static <T> void print5Times(T arg) {
        for(int i = 0; i < 5; i++) {
            System.out.println(arg);
        }
    }

    public static <T> void displayElements(T[] array) {
        for(T arg : array) {
            System.out.print(arg + " ");
        }
        System.out.println();
    }
}
