package exercises.arrays.array;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[20];
        employees[0] = new Employee("Krzystof", "Zieba", 4500);
        employees[1] = new Employee("Marian", "Szafranek", 5400);
        employees[2] = new Employee("Danuta", "Rozkosz", 2340);
        employees[3] = new Employee("Justyna", "Kotara", 15400);
        employees[4] = new Employee("Witek", "Zanko", 8340);
        employees[5] = new Employee("Marian", "Pazdzioch", 8340);
        employees[6] = new Employee("Roman", "Kapustka", 8340);
        employees[7] = new Employee("Piotr", "Zanko", 8340);

        int employeeindex = 2;
        System.out.println(employees[employeeindex - 1].getFirstName() + ", " +
                        employees[employeeindex - 1].getLastName() + ", " +
                        employees[employeeindex - 1].getSalary() + "zl");
        int employeesSize = employees.length;
        System.out.println("Wielkosc tablicy: " + employeesSize);
        System.out.println("Ostatni element tablicy to: " + employees[employeesSize - 1]);
    }
}
