package case_study.controller;

import java.util.Scanner;

public class BookingManagement {
    Scanner sc = new Scanner(System.in);
    boolean returnMenu = false;

    public void bookingManagement() {
        System.out.println("1. Add new booking\n" +
                "2. Display list booking\n" +
                "3. Create new contracts\n" +
                "4. Display list contracts\n" +
                "5. Edit contracts\n" +
                "6. Return main menu");
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
                case "5":
                    break;
                case "6":
                    break;
                default:
                    System.out.println("bạn nhập sai rồi, nhập lại đi");
                    break;

            }
        } while (!choose.equals("6"));
        FuramaController furamaController = new FuramaController();
        furamaController.displayMainMenu();
    }
}
