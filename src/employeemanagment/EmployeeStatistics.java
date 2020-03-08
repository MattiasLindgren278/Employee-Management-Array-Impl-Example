package employeemanagment;

import java.util.Scanner;

public class EmployeeStatistics {

    static Scanner sc = new Scanner(System.in);

    public static void calculateAverageSalary() {

        double averageSalary;
        double sum = 0;

        for (int i = 0; i < EmployeeManager.nextFreePos; i++) {
            sum += EmployeeManager.employeeList[i].getSalary();
        }

        if ((EmployeeManager.nextFreePos) != 0) {
            averageSalary = sum / (EmployeeManager.nextFreePos);
            System.out.println("The average salary is " + averageSalary);
        } else {
            System.out.println("No employees in list.");
        }

    }

    public static void getLargestSalary() {
        int max = 0;
        for (int i = 1; i < EmployeeManager.nextFreePos; i++) {
            if (EmployeeManager.employeeList[i].getSalary() > EmployeeManager.employeeList[max].getSalary()) {
                max = i;
            }
        }
        System.out.println(EmployeeManager.employeeList[max].getName() + " has the biggest salary, and it is "
                + EmployeeManager.employeeList[max].getSalary());
    }

    public static void getAverageAge() {
        double averageAge = 0;
        double totalAge = 0;

        for (int i = 0; i < EmployeeManager.nextFreePos; i++) {
            totalAge += EmployeeManager.employeeList[i].calculateAge();
        }
        if (EmployeeManager.nextFreePos != 0) {
            averageAge = totalAge / EmployeeManager.nextFreePos;
        }

        System.out.println("The average age is " + (int) averageAge + ".");

    }

    public static void getSmallestSalary() {
        int min = 0;
        for (int i = 1; i < EmployeeManager.nextFreePos; i++) {
            if (EmployeeManager.employeeList[i].getSalary() < EmployeeManager.employeeList[min].getSalary()) {
                min = i;
            }
        }
        System.out.println(EmployeeManager.employeeList[min].getName() + " has the smallest salary and it is "
                + EmployeeManager.employeeList[min].getSalary());
    }

    public static void getOldestEmployee() {
        int oldest = 0;
        for (int i = 1; i < EmployeeManager.nextFreePos; i++) {
            if (EmployeeManager.employeeList[i].calculateAge() > EmployeeManager.employeeList[oldest].calculateAge()) {
                oldest = i;
            }
        }

        System.out.println("The oldest employee is " + EmployeeManager.employeeList[oldest].getName()
                + " and he/she is " + EmployeeManager.employeeList[oldest].calculateAge() + ".");
    }

    public static void getYoungestEmployee() {
        int youngest = 0;
        for (int i = 1; i < EmployeeManager.nextFreePos; i++) {
            if (EmployeeManager.employeeList[i].calculateAge() < EmployeeManager.employeeList[youngest].calculateAge()) {
                youngest = i;
            }
        }
        System.out.println("The youngest employee is " + EmployeeManager.employeeList[youngest].getName()
                + " and he/she is " + EmployeeManager.employeeList[youngest].calculateAge() + ".");
    }

}
