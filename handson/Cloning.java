class Employee implements Cloneable {
    String name;
    int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Employee [age=" + age + ", name=" + name + "]";
    }

}

public class Cloning {
    public static void main(String[] args) {
        Employee employee1 = new Employee("James", 12);
        try {
            Employee employee2 = (Employee) employee1.clone();
            employee2.name = "Joana";
            employee2.age = 11;
            System.out.println(employee1);
            System.out.println(employee2);
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

    }
}