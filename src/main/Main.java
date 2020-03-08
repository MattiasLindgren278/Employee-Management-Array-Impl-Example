package main;

import employeemanagment.EmployeeManager;
import ui.UserInterface;

public class Main {

    public static void main(String[] args) {
        EmployeeManager.fillEmployeeList();
        UserInterface.menu();
    }

}
