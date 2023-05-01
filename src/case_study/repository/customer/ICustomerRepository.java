package case_study.repository.customer;

import case_study.model.person.Customer;
import case_study.repository.IRepository;

public interface ICustomerRepository extends IRepository {
    int findCodeCustomer(String code);

    void addCustomer(Customer customer);

    void editCustomer(int index, Customer customer);

    Customer findCustomer(int index);
}
