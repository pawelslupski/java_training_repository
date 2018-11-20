package exercises.thisClause;

public class CalcTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double a = 23;
        double b = 12;
        double c = 3;

        System.out.println("a: " + a + ", b: " + b + ", c: " + c);
        System.out.println("a + b = " + calculator.add(a, b));
        System.out.println("a + b + c = " + calculator.add(a, b, c));
        System.out.println("a - b = " + calculator.subtract(a, b));
        System.out.println("a - b - c = " + calculator.subtract(a, b, c));
    }
}
