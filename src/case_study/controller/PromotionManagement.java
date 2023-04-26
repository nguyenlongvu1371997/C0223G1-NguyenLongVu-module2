package case_study.controller;

import java.util.Scanner;

public class PromotionManagement {
    Scanner sc = new Scanner(System.in);
    boolean returnMenu = false;

    public void promotionManagement() {
        System.out.println("1. Display customers use service\n" +
                "2. Display customers get voucher\n" +
                "3. Return main menu");
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
                default:
                    System.out.println("bạn nhập sai rồi, nhập lại đi");
                    break;
            }
        } while (!choose.equals("3"));
        FuramaController furamaController = new FuramaController();
        furamaController.displayMainMenu();
    }
}
