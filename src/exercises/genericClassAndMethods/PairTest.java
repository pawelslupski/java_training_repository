package exercises.genericClassAndMethods;

public class PairTest {
    public static void main(String[] args) {
        Pair<Double, String> pair = new Pair<>(14.5, "Green");
        Pair<Integer, String> pairTwo = new Pair<>(5, "Medium");
        Pair<String, Boolean> pairThree = new Pair<>("Qualified", true);

        display(pair);
        display(pairTwo);
        display(pairThree);
    }

    private static <T, V> void display(Pair<T, V> pair) {
        System.out.println("The pair of values equals: " + pair.gettGenericField() +
                ", " + pair.getvGenericField());
    }
}
