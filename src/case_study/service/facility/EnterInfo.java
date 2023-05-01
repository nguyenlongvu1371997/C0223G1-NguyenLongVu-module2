package case_study.service.facility;

import case_study.service.CheckInfo;

import java.util.Scanner;

public class EnterInfo {
    Scanner sc = new Scanner(System.in);

    public String enterName() {
        System.out.println("enter name");
        String name;
        do {
            name = sc.nextLine();
            if (CheckInfo.checkName(name)) {
                return name;
            }
            System.out.println("wrong name, please enter again");
        } while (true);
    }

    public String enterDateOfBirth(String person) {
        System.out.println("enter date of birth (dd/mm/yyyy)");
        String dayOfBirth;
        do {
            dayOfBirth = sc.nextLine();
            if (!CheckInfo.checkDateOfBirth(dayOfBirth)) {
                System.out.println("wrong date of birth");
                continue;
            }
            if (CheckInfo.checkAge(dayOfBirth)) {
                return dayOfBirth;
            }
            System.out.println(person + " is under 18");
        } while (true);
    }

    public String enterGender() {
        System.out.println("choose gender: 1.male 2.female 3. LGBT");
        String gender;
        do {
            gender = sc.nextLine();
            if (CheckInfo.checkGender(gender).equals("0")) {
                System.out.println("wrong choice, choose again");
                continue;
            }
            gender = CheckInfo.checkGender(gender);
            return gender;
        } while (true);
    }

    public String enterPhoneNumber() {
        System.out.println("enter telephone number (10 numbers)");
        String phoneNumber;
        do {
            phoneNumber = sc.nextLine();
            if (CheckInfo.checkPhoneNumber(phoneNumber)) {
                return phoneNumber;
            }
            System.out.println("wrong telephone number, enter again");
        } while (true);
    }

    public String enterId() {
        System.out.println("enter ID (9 or 11 numbers)");
        String id;
        do {
            id = sc.nextLine();
            if (CheckInfo.checkId(id)) {
                return id;
            }
            System.out.println("wrong ID, enter again");
        } while (true);
    }

    public String enterEmail() {
        System.out.println("enter email");
        String email = sc.nextLine();
        return email;
    }

    public String enterTypeOfCustomer() {
        System.out.println("choose type of customer\n" +
                "1. Diamond\n" +
                "2. Platinum\n" +
                "3. Gold\n" +
                "4. Silver\n" +
                "5. Member");
        String choose;
        do {
            choose = sc.nextLine();
            switch (choose) {
                case "1":
                    return "Diamond";
                case "2":
                    return "Platinum";
                case "3":
                    return "Gold";
                case "4":
                    return "Silver";
                case "5":
                    return "Member";
                default:
                    System.out.println("you enter wrong, enter again");
                    continue;
            }
        } while (true);
    }
    public String enterAddress(){
        System.out.println("enter address");
        String address = sc.nextLine();
        return address;
    }
}
