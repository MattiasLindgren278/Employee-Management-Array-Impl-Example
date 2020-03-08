package model;

import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.YEARS;

public class Employee {

    private static String companyName = "A company";
    private String name;
    private String jobTitle;
    private String birthDate;
    private double salary;
    private int employeeID;
    private static int counter = 1;

    public Employee(String name, String jobTitle, String birthDate, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.birthDate = birthDate;
        this.salary = salary;
        this.employeeID = counter;
        counter++;
    }

    public Employee() {
        this.employeeID = counter;
        counter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public static String getCompanyName() {
        return companyName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "Name: " + name + ". Jobtitle: " + jobTitle + ". Birthdate: " + birthDate + ". Salary: " + salary + ". EmployeeID: " + employeeID;
    }
    
    public long calculateAge(){
        LocalDate birthdate = LocalDate.parse(birthDate);
        LocalDate now = LocalDate.now();
        long age = YEARS.between(birthdate, now);
        return age;
    }
    

}
