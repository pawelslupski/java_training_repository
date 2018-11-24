package exercises.collections.maps;

import java.util.HashMap;
import java.util.Map;

public class Company {
    private HashMap<String, Employee> employees;

    public Company() {
        employees = new HashMap<>();
    }

    public boolean addEmployee(Employee employee) {
        if(employees.containsKey(employee.getPESEL())) {
            return false;
        } else {
            employees.put(employee.getPESEL(), employee);
            return true;
        }
    }

    public String findEmployee(String firstName, String lastName) {
        for(Map.Entry<String, Employee> entry: employees.entrySet()) {
            if (entry.getValue().getFirstName().equals(firstName) &&
                    entry.getValue().getLastName().equals(lastName)) {
                return entry.getValue().toString();
            }
        }
        return "There is no record matching these data";
    }
}
