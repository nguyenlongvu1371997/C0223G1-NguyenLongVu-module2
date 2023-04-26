package case_study.repository.employee;

import case_study.model.person.Employee;
import case_study.utils.ReadAndWriteEmployee;

import java.util.ArrayList;

public class EmployeeRepository {
    ReadAndWriteEmployee readAndWriteEmployee = new ReadAndWriteEmployee();
    String PATH = "C:\\Users\\Laptop T&T\\Desktop\\codegym\\module 2\\src\\case_study\\data\\employee";



    public String displayEmployee() {
        String string = "";
        for (Employee e : readAndWriteEmployee.readEmployee(PATH)) {
            string += toString();
            string += "\n";
        }
        return string;
    }
    public int findCodeEmployee(String code){
        ArrayList<Employee> list =readAndWriteEmployee.readEmployee(PATH);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getCode().equals(code)){
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
    public void editEmployee(int index,String code, String name, String dayOfBirth, String gender, String id, String phoneNumber, String email, String degree, String position, double salary){
        ArrayList<Employee> list = readAndWriteEmployee.readEmployee(PATH);
        list.get(index).setAll(code, name, dayOfBirth, gender, id, phoneNumber, email, degree, position, salary);
    }
}
