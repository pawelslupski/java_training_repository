package exercises.thisClause;

public class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double add(double a, double b, double c) {
        return add(a, b) + c;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double subtract(double a, double b, double c) {
        return subtract(a, b) - c;
    }
}
