package case_study.controller;

import case_study.service.employee.EmployeeService;

import java.util.Scanner;

public class EmployeeManagement {
    Scanner sc = new Scanner(System.in);
    EmployeeService employeeService = new EmployeeService();

    public void employeeManagement() {
        String choose;
        do {
            System.out.println("1. Display list employee\n" +
                    "2. Add new employee\n" +
                    "3. Edit employee\n" +
                    "4. Return main menu");
            choose = sc.nextLine();
            switch (choose) {
                case "1":
                    employeeService.displayList();
                    break;
                case "2":
                    employeeService.add();
                    break;
                case "3":
                    employeeService.edit();
                    break;
                case "4":
                    break;
                default:
                    System.out.println("you enter wrong, enter again");
                    break;
            }
        } while (!choose.equals("4"));

    }


}
