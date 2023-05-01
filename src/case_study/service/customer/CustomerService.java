package case_study.service.customer;

import case_study.model.person.Customer;
import case_study.repository.customer.CustomerRepository;
import case_study.service.CheckInfo;
import case_study.service.facility.EnterInfo;

import java.util.Scanner;

public class CustomerService implements ICustomerService {
    CustomerRepository customerRepository = new CustomerRepository();
    EnterInfo enterInfo = new EnterInfo();
    Scanner sc = new Scanner(System.in);

    @Override
    public void add() {
        System.out.println("enter customer code: KHxxxx");
        String code;
        do {
            code = sc.nextLine();
            if (!CheckInfo.checkCodeCustomer(code)) {
                System.out.println("you entered wrong, please enter again");
            } else if (customerRepository.findCodeCustomer(code) != -1) {
                System.out.println("this employee code is already exist, please enter again");
            } else {
                break;
            }
        } while (true);
        String name = enterInfo.enterName();
        String dateOfBirth = enterInfo.enterDateOfBirth("customer");
        String gender = enterInfo.enterGender();
        String id = enterInfo.enterId();
        String phoneNumber = enterInfo.enterPhoneNumber();
        String email = enterInfo.enterEmail();
        String type = enterInfo.enterTypeOfCustomer();
        String address = enterInfo.enterAddress();
        Customer customer = new Customer(code, name, dateOfBirth, gender, id, phoneNumber, email, type, address);
        customerRepository.addCustomer(customer);
        System.out.println("add customer successful");
    }

    @Override
    public void displayList() {
        System.out.println(customerRepository.display());
    }

    @Override
    public void edit() {
        System.out.println("enter customer code");
        String code;
        int index;
        boolean flag = false;
        boolean finishEdit = false;
        String choose;
        Customer customer;
        do {
            code = sc.nextLine();
            if ((index = customerRepository.findCodeCustomer(code)) == -1) {
                System.out.println("customer code does not exist, enter again");
                continue;
            }
            break;
        } while (true);
        customer = customerRepository.findCustomer(index);
        do {
            System.out.println("select an item to edit\n" +
                    "1. Name\n" +
                    "2. Date of birth\n" +
                    "3. Gender\n" +
                    "4. ID\n" +
                    "5. Telephone number\n" +
                    "6. Email\n" +
                    "7. Type of customer\n" +
                    "8. Address");
            do {
                choose = sc.nextLine();
                switch (choose) {
                    case "1":
                        customer.setName(enterInfo.enterName());
                        break;
                    case "2":
                        customer.setDateOfBirth(enterInfo.enterDateOfBirth("customer"));
                        break;
                    case "3":
                        customer.setGender(enterInfo.enterGender());
                        break;
                    case "4":
                        customer.setId(enterInfo.enterId());
                        break;
                    case "5":
                        customer.setPhoneNumber(enterInfo.enterPhoneNumber());
                        break;
                    case "6":
                        customer.setEmail(enterInfo.enterEmail());
                        break;
                    case "7":
                        customer.setType(enterInfo.enterEmail());
                        break;
                    case "8":
                        customer.setAddress(enterInfo.enterAddress());
                        break;
                    default:
                        System.out.println("you enter wrong, enter again");
                        flag = true;
                }
            } while (flag);
            System.out.println("do you want to continue editing\n" +
                    "1. yes\n" +
                    "2. no");
            String pick;
            do {
                pick = sc.nextLine();
                switch (pick) {
                    case "1":
                        break;
                    case "2":
                        finishEdit = true;
                        break;
                    default:
                        System.out.println("you enter wrong, enter again");
                        break;
                }
            } while (!pick.equals("1") && !pick.equals("2"));
        } while (!finishEdit);
        customerRepository.editCustomer(index, customer);
    }
}
