package ui;

import employeemanagment.EmployeeManager;
import employeemanagment.EmployeeStatistics;
import java.util.Scanner;

public class UserInterface {

    static Scanner sc = new Scanner(System.in);

    public static void menu() {
        boolean loop = true;
        do {
            System.out.println("Main menu");
            System.out.println("----------");
            System.out.println("1. Manage employees");
            System.out.println("2. Retrieve employee statistics");
            System.out.println("0. Exit");
            int choice = sc.nextInt();
            System.out.println("");
            switch (choice) {
                case 1:
                    employeeManagerMenu();
                    System.out.println("");
                    break;
                case 2:
                    employeeStatisticsMenu();
                    System.out.println("");
                    break;
                case 0:
                    loop = false;
                    break;
                default:
                    System.out.println("No such option available.");
                    System.out.println("");
            }
        } while (loop);
    }

    private static void employeeManagerMenu() {
        boolean loop = true;
        do {

            System.out.println("Employee manager menu");
            System.out.println("----------");
            System.out.println("1. Add employee");
            System.out.println("2. Delete employee");
            System.out.println("3. Update employee");
            System.out.println("4. Find employee");
            System.out.println("5. Get employee age");
            System.out.println("6. Show all employees");
            System.out.println("0. Back");
            int choice = sc.nextInt();
            System.out.println("");
            switch (choice) {
                case 1:
                    EmployeeManager.addEmployee();
                    System.out.println("");
                    break;
                case 2:
                    EmployeeManager.deleteEmployee();
                    System.out.println("");
                    break;
                case 3:
                    EmployeeManager.updateEmployee();
                    System.out.println("");
                    break;
                case 4:
                    EmployeeManager.findSpecificEmployee();
                    System.out.println("");
                    break;
                case 5:
                    EmployeeManager.getEmployeeAge();
                    System.out.println("");
                    break;
                case 6:
                    EmployeeManager.showEmployeeList();
                    System.out.println("");
                    break;
                case 0:
                    loop = false;
                    break;
                default:
                    System.out.println("No such option available.");
                    System.out.println("");
            }
        } while (loop);

    }

    private static void employeeStatisticsMenu() {
        boolean loop = true;
        do {
            System.out.println("Employee statistics menu");
            System.out.println("----------");
            System.out.println("1. Get average salary");
            System.out.println("2. Get the largest salary");
            System.out.println("3. Get the smallest salary");
            System.out.println("4. Get average age");
            System.out.println("5. Get oldest employee");
            System.out.println("6. Get youngest employee");
            System.out.println("0. Back");
            int choice = sc.nextInt();
            System.out.println("");
            switch (choice) {
                case 1:
                    EmployeeStatistics.calculateAverageSalary();
                    System.out.println("");
                    break;
                case 2:
                    EmployeeStatistics.getLargestSalary();
                    System.out.println("");
                    break;
                case 3:
                    EmployeeStatistics.getSmallestSalary();
                    System.out.println("");
                    break;
                case 4:
                    EmployeeStatistics.getAverageAge();
                    System.out.println("");
                    break;
                case 5:
                    EmployeeStatistics.getOldestEmployee();
                    System.out.println("");
                    break;
                case 6:
                    EmployeeStatistics.getYoungestEmployee();
                    System.out.println("");
                    break;
                case 0:
                    loop = false;
                    break;
                default:
                    System.out.println("No such option available");
            }
        } while (loop);

    }
}
