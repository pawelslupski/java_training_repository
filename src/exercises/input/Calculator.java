package exercises.input;

public class Calculator {
    public static final String ADD = "+";
    public static final String SUBTRACT = "-";
    public static final String MULTIPLY = "*";
    public static final String DIVIDE = "/";

    public double calculate(double a, double b, String option) {
        double result = 0;

        switch(option) {
            case ADD:
                result = a + b;
                break;
            case SUBTRACT:
                result =  a - b;
                break;
            case MULTIPLY:
                result = a * b;
                break;
            case DIVIDE:
                result = a / b;
                break;
            default:
                System.out.println("There is no such option! Please try again!");
        }
        return result;
    }

}
