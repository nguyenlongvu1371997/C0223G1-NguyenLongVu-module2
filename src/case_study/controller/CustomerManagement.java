package case_study.controller;

import java.util.Scanner;

public class CustomerManagement {
    Scanner sc = new Scanner(System.in);
    boolean returnMenu = false;

    public void customerManagement() {
        System.out.println("1. Display list customer\n" +
                "2. Add new custommer\n" +
                "3. Edit customer\n" +
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
