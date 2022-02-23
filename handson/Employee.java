public class Employee implements Comparable<Object> {
    int empId;
    String name;
    float salary;

    public Employee(int empId, String name, float salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Object o) {
        Employee emp = (Employee) o;
        if (this.salary == emp.salary)
            return 0;
        else if (this.salary > emp.salary)
            return 1;
        return -1;
    }

    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
    }

}
