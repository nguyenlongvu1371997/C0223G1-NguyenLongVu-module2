package case_study.repository.employee;

import case_study.model.person.Employee;
import case_study.utils.ReadAndWriteEmployee;

import java.util.ArrayList;

public class EmployeeRepository implements IEmployeeRepository {
    ReadAndWriteEmployee readAndWriteEmployee = new ReadAndWriteEmployee();
    String PATH = "C:\\Users\\Laptop T&T\\Desktop\\codegym\\module 2\\src\\case_study\\data\\employee";


    public String display() {
        String string = "";
        for (Employee e : readAndWriteEmployee.readEmployee(PATH)) {
            string += e.toString();
            string += "\n";
        }
        return string;
    }

    public Employee findEmployee(int index) {
        ArrayList<Employee> list = readAndWriteEmployee.readEmployee(PATH);
        return list.get(index);
    }

    public int findCodeEmployee(String code) {
        ArrayList<Employee> list = readAndWriteEmployee.readEmployee(PATH);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCode().equals(code)) {
                System.out.println(list.get(i).toString());
                return i;
            }
        }
        return -1;
    }

    public void addEmployee(Employee employee) {
        ArrayList<Employee> list = readAndWriteEmployee.readEmployee(PATH);
        list.add(employee);
        readAndWriteEmployee.writeEmployee(list, PATH);
    }


    public void editEmployee(int index, Employee employee) {
        ArrayList<Employee> list = readAndWriteEmployee.readEmployee(PATH);
        list.set(index, employee);
        readAndWriteEmployee.writeEmployee(list, PATH);
    }
}
