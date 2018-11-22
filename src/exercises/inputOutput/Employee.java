package exercises.inputOutput;

public class Employee extends Person {
    private static final long  serialVersionUID = 3812017177088226527L;

    private double salary;

    public Employee(String name, String surname, double salary) {
        super(name, surname);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + " Employee{" +
                "salary=" + salary +
                '}';
    }
}
