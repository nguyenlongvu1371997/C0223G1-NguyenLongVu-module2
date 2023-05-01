package case_study.repository.customer;

import case_study.model.person.Customer;
import case_study.utils.ReadAndWriteCustomer;

import java.util.ArrayList;

public class CustomerRepository implements ICustomerRepository {
    ReadAndWriteCustomer readAndWriteCustomer = new ReadAndWriteCustomer();
    String PATH = "C:\\Users\\Laptop T&T\\Desktop\\codegym\\module 2\\src\\case_study\\data\\customer";

    @Override
    public String display() {
        String string = "";
        for (Customer c : readAndWriteCustomer.readCustomer(PATH)) {
            string += c.toString();
            string += "\n";
        }
        return string;
    }

    @Override
    public int findCodeCustomer(String code) {
        ArrayList<Customer> list = readAndWriteCustomer.readCustomer(PATH);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCode().equals(code)) {
                System.out.println(list.get(i).toString());
                return i;
            }
        }
        return -1;
    }

    @Override
    public void addCustomer(Customer customer) {
        ArrayList<Customer> list = readAndWriteCustomer.readCustomer(PATH);
        list.add(customer);
        readAndWriteCustomer.writeCustomer(list, PATH);
    }

    @Override
    public void editCustomer(int index, Customer customer) {
        ArrayList<Customer> list = readAndWriteCustomer.readCustomer(PATH);
        list.set(index, customer);
        readAndWriteCustomer.writeCustomer(list, PATH);
    }

    @Override
    public Customer findCustomer(int index) {
        ArrayList<Customer> list = readAndWriteCustomer.readCustomer(PATH);
        return list.get(index);
    }
}
