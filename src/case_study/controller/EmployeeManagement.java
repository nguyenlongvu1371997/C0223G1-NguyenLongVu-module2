package case_study.controller;

import java.util.Scanner;

public class EmployeeManagement {
    Scanner sc = new Scanner(System.in);
    boolean returnMenu = false;

    public void employeeManagement() {
        System.out.println("1. Display list employee\n" +
                "2. Add new employee\n" +
                "3. Edit employee\n" +
                "4. Return main menu");
        String choose;
        do {
            choose = sc.nextLine();
            switch (choose) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                default:
                    System.out.println("bạn nhập nhầm rồi, nhập lại đi");
                    break;
            }
        } while (!choose.equals("4"));
        FuramaController furamaController = new FuramaController();
        furamaController.displayMainMenu();
    }


}
