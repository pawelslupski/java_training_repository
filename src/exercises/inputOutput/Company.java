package exercises.inputOutput;

import java.io.Serializable;

public class Company implements Serializable {
    private static final long  serialVersionUID = 3812017177088226526L;

    public static final int MAX_SIZE = 3;
    private Employee[] employees;

    public Company() {
        employees = new Employee[3];
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee empl, int index) {
        employees[index] = empl;
    }
}
