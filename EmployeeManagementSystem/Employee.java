package EmployeeManagementSystem;
import java.io.Serializable;
import java.time.LocalDate;

public class Employee implements Serializable {

    private String name;
    private LocalDate dateOfBirth;
    private String department;
    private String designation;
    private Double Salary;
    public Employee() {
    }
    public Employee(String name, LocalDate dateOfBirth, String department, String designation, Double salary) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.department = department;
        this.designation = designation;
        Salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(LocalDate localDate) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public Double getSalary() {
        return Salary;
    }
    public void setSalary(Double salary) {
        Salary = salary;
    }
    @Override
    public String toString() {
        return "Employee [Salary=" + Salary + ", dateOfBirth=" + dateOfBirth + ", department=" + department
                + ", designation=" + designation + ", name=" + name + "]";
    }
    
    
}
