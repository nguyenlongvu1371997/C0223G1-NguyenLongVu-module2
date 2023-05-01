package case_study.repository.employee;

import case_study.model.person.Employee;
import case_study.repository.IRepository;

public interface IEmployeeRepository extends IRepository {
    int findCodeEmployee(String code);

    void addEmployee(Employee employee);

    void editEmployee(int index, Employee employee);

    Employee findEmployee(int index);
}
