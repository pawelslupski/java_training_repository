package exercises.methods;

public class Calculate {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double a = 10;
        double b = 5;

        System.out.println("a = " + a + ", b = " + b );
        System.out.println("a + b = " + calculator.add(a, b));
        System.out.println("a - b = " + calculator.subtract(a, b));
        System.out.println("a / b = " + calculator.divide(a, b));
        System.out.println("a * b = " + calculator.multiply(a, b));
    }
}
