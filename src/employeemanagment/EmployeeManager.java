package employeemanagment;

import java.util.Scanner;
import model.Employee;

public class EmployeeManager {

    static Employee[] employeeList = new Employee[6];
    static Scanner sc = new Scanner(System.in);
    static int nextFreePos = 0;

    public static void addEmployee() {
        System.out.print("Enter the name of the employee: ");
        String name = sc.nextLine();
        System.out.print("Enter the work title of the employee: ");
        String workTitle = sc.nextLine();
        System.out.print("Enter the employees birthdate: ");
        String birthdate = sc.nextLine();
        System.out.print("Enter the employees salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();

        employeeList[nextFreePos] = new Employee(name, workTitle, birthdate, salary);
        nextFreePos++;
        System.out.println("");
        System.out.println("Employee " + employeeList[(nextFreePos - 1)] + " added.");

        if (nextFreePos == employeeList.length) {
            handleFullArray();
        }
    }

    public static void deleteEmployee() {
        System.out.println("What employee do you want to delete?\n");
        showEmployeeList();
        System.out.println("Enter employee ID");
        int deleteID = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < nextFreePos; i++) {
            if (employeeList[i].getEmployeeID() == deleteID) {
                if (employeeList[nextFreePos - 1].getEmployeeID() == deleteID) {
                    employeeList[nextFreePos - 1] = null;
                    nextFreePos--;
                } else {
                    employeeList[i] = employeeList[nextFreePos - 1];
                    employeeList[nextFreePos - 1] = null;
                    nextFreePos--;
                }
            }
        }

    }

    public static void updateEmployee() {
        System.out.println("Which employee do you want to update?\n");
        showEmployeeList();
        System.out.print("Enter employee ID: ");
        int updateID = sc.nextInt();

        for (int i = 0; i < nextFreePos; i++) {
            if (employeeList[i].getEmployeeID() == updateID) {
                System.out.println("What do you want to change?");
                System.out.println("1. Name.");
                System.out.println("2. Jobtitle.");
                System.out.println("3. Salary.");
                int choice = sc.nextInt();
                sc.nextLine();
                switch (choice) {
                    case 1:
                        System.out.print("Enter new name: ");
                        String newName = sc.nextLine();
                        employeeList[updateID].setName(newName);
                        System.out.println("Name set to " + employeeList[updateID].getName() + ".");
                        break;
                    case 2:
                        System.out.print("Enter the new job title: ");
                        String newJobTitle = sc.nextLine();
                        employeeList[updateID].setJobTitle(newJobTitle);
                        System.out.println("Job title set to " + employeeList[updateID].getJobTitle() + ".");
                        break;
                    case 3:
                        System.out.print("Enter the new salary: ");
                        double newSalary = sc.nextDouble();
                        sc.nextLine();
                        employeeList[updateID].setSalary(newSalary);
                        System.out.println("Salary set to " + employeeList[updateID].getSalary() + ".");
                        break;
                    default:
                        System.out.println("Wrong input");
                }
            }
        }
    }

    public static void findSpecificEmployee() {
        System.out.print("Enter the name of the student you are searching for: ");
        String searchName = sc.nextLine();
        //sc.nextLine();
        for (int i = 0; i < nextFreePos; i++) {
            if (employeeList[i].getName().equals(searchName)) {
                System.out.println(employeeList[i]);
            }
        }
    }

    public static void showEmployeeList() {
        for (int i = 0; i < nextFreePos; i++) {
            System.out.println(employeeList[i]);
        }
    }

    public static void getEmployeeAge() {
        System.out.println("For which employee do you want to retireve the age?");
        showEmployeeList();
        System.out.print("Enter employee ID: ");
        int employeeID = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < nextFreePos; i++) {
            if (employeeList[i].getEmployeeID() == employeeID) {
                System.out.println(employeeList[i].getName() + " is "
                        + employeeList[i].calculateAge() + " years old.");
            }

        }
    }

    public static void handleFullArray() {
        Employee[] employeeListNew = new Employee[employeeList.length + 10];
        for (int i = 0; i < employeeList.length; i++) {
            employeeListNew[i] = employeeList[i];
        }
        employeeList = employeeListNew;

    }

    public static void fillEmployeeList() {
        Employee employee1 = new Employee("Mattias", "CEO", "1995-05-05", 100);
        nextFreePos++;
        Employee employee2 = new Employee("Felix", "CEO", "1990-01-08", 150);
        nextFreePos++;
        Employee employee3 = new Employee("Axel", "CEO", "1984-04-21", 200);
        nextFreePos++;
        Employee employee4 = new Employee("Erika", "CEO", "1971-08-16", 250);
        nextFreePos++;
        Employee employee5 = new Employee("Max", "CEO", "1998-09-07", 300);
        nextFreePos++;

        employeeList[0] = employee1;
        employeeList[1] = employee2;
        employeeList[2] = employee3;
        employeeList[3] = employee4;
        employeeList[4] = employee5;
    }

}
