package case_study.controller;

import java.util.Scanner;

public class FuramaController {
    Scanner sc = new Scanner(System.in);
    boolean outMenu = false;

    public void displayMainMenu() {
        System.out.println("1. Employee Management\n" +
                "2. Customer Management\n" +
                "3. Facility Management\n" +
                "4. Booking Management\n" +
                "5. Promotion Management\n" +
                "6. Exit");
        do {
            String choose = sc.nextLine();
            switch (choose) {
                case "1":
                    EmployeeManagement employeeManagement = new EmployeeManagement();
                    employeeManagement.employeeManagement();
                    outMenu = true;
                    break;
                case "2":
                    CustomerManagement customerManagement = new CustomerManagement();
                    customerManagement.customerManagement();
                    break;
                case "3":
                    FacilityManagement facilityManagement = new FacilityManagement();
                    facilityManagement.facilityManagement();
                    break;
                case "4":
                    BookingManagement bookingManagement = new BookingManagement();
                    bookingManagement.bookingManagement();
                    break;
                case "5":
                    PromotionManagement promotionManagement = new PromotionManagement();
                    promotionManagement.promotionManagement();
                    break;
                case "6":
                    outMenu = true;
                    System.out.println("thoát thành công");
                    break;
                default:
                    System.out.println("bạn nhập nhầm rồi, nhập lại đi");
                    break;
            }
        } while (outMenu == false);
    }
}

