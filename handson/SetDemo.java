import java.util.*;

public class SetDemo {
    static TreeSet<Employee> set = new TreeSet<Employee>();

    public static void main(String[] args) {
        Employee emp2 = new Employee(2473, "Joan", 23456);
        Employee emp3 = new Employee(3547, "Bob", 124000);
        Employee emp1 = new Employee(2341, "James", 34647);
        addEmployee(emp3);
        addEmployee(emp2);
        addEmployee(emp1);
        displayAllEmployees();
    }

    public static void addEmployee(Employee emp) {
        set.add(emp);
    }

    public static void displayAllEmployees() {
        Iterator<Employee> employees = set.iterator();
        while (employees.hasNext()) {
            System.out.println(employees.next());
        }
    }
}