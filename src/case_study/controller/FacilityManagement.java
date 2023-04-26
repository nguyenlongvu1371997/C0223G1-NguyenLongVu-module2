package case_study.controller;

import java.util.Scanner;

public class FacilityManagement {
    Scanner sc = new Scanner(System.in);
    boolean returnMenu = false;

    public void facilityManagement() {
        System.out.println("1. Display list facility\n" +
                "2. Add new facility\n" +
                "3. Display list maintenance\n" +
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
