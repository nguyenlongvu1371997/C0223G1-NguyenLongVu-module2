package case_study.controller;

import case_study.service.customer.CustomerService;

import java.util.Scanner;

public class CustomerManagement {
    Scanner sc = new Scanner(System.in);
    CustomerService customerService = new CustomerService();

    public void customerManagement() {

        String choose;
        do {
            System.out.println("1. Display list customer\n" +
                    "2. Add new custommer\n" +
                    "3. Edit customer\n" +
                    "4. Return main menu");
            choose = sc.nextLine();
            switch (choose) {
                case "1":
                    customerService.displayList();
                    break;
                case "2":
                    customerService.add();
                    break;
                case "3":
                    customerService.edit();
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
