package case_study.service.employee;

import case_study.model.person.Employee;
import case_study.repository.employee.EmployeeRepository;
import case_study.service.CheckInfo;

import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    EmployeeRepository employeeRepository = new EmployeeRepository();
    Scanner sc = new Scanner(System.in);

    @Override
    public void add() {
        System.out.println("enter employee code: NVxxxx");
        String code;
        do {
            code = sc.nextLine();
            if (!CheckInfo.checkCodeEmployee(code)) {
                System.out.println("you entered wrong, please enter again");
            } else if (employeeRepository.findCodeEmployee(code) != -1) {
                System.out.println("this employee code is already exist, please enter again");
            } else {
                break;
            }
        } while (true);
        System.out.println("enter name");
        String name;
        do {
            name = sc.nextLine();
            if (CheckInfo.checkName(name)) {
                break;
            }
            System.out.println("wrong name, please enter again");
        } while (true);
        System.out.println("enter date of birth (dd/mm/yyyy)");
        String dayOfBirth;
        do {
            dayOfBirth = sc.nextLine();
            if (!CheckInfo.checkDateOfBirth(dayOfBirth)) {
                System.out.println("wrong date of birth");
                continue;
            }
            if (CheckInfo.checkAge(dayOfBirth)) {
                break;
            }
            System.out.println("employee is under 18");
        } while (true);
        System.out.println("choose gender: 1.male 2.female 3. LGBT");
        String gender;
        do {
            gender = sc.nextLine();
            if (CheckInfo.checkGender(gender).equals("0")) {
                System.out.println("wrong choice, choose again");
                continue;
            }
            gender = CheckInfo.checkGender(gender);
            break;
        } while (true);
        System.out.println("enter ID (9 or 11 numbers)");
        String id;
        do {
            id = sc.nextLine();
            if (CheckInfo.checkId(id)) {
                break;
            }
            System.out.println("wrong ID, enter again");
        } while (true);
        System.out.println("enter telephone number (10 numbers)");
        String phoneNumber;
        do {
            phoneNumber = sc.nextLine();
            if (CheckInfo.checkPhoneNumber(phoneNumber)) {
                break;
            }
            System.out.println("wrong telephone number, enter again");
        } while (true);
        System.out.println("enter email");
        String email = sc.nextLine();
        System.out.println("choose degree: 1.Intermediate 2.College 3.University 4.After University");
        String degree;
        do {
            degree = sc.nextLine();
            if (CheckInfo.checkDegree(degree).equals("0")) {
                System.out.println("wrong choice, choose again");
                continue;
            }
            degree = CheckInfo.checkDegree(degree);
            break;
        } while (true);
        System.out.println("choose position: 1.Receptionist 2.Staff 3.Expert 4.Supervisor 5.Manager 6.Director");
        String position;
        do {
            position = sc.nextLine();
            if (CheckInfo.checkPosition(position).equals("0")) {
                System.out.println("wrong choice, choose again");
                continue;
            }
            position = CheckInfo.checkPosition(position);
            break;
        } while (true);
        System.out.println("enter salary");
        String salary;
        do {
            salary = sc.nextLine();
            if (CheckInfo.checkSalary(salary)) {
                break;
            }
            System.out.println("you enter wrong, enter again");
        } while (true);
        Employee employee = new Employee(code, name, dayOfBirth, gender, id, phoneNumber, email, degree, position, salary);
        employeeRepository.addEmployee(employee);
        System.out.println("add employee successful");
    }

    @Override
    public void displayList() {
        System.out.println(employeeRepository.display());
    }

    @Override
    public void edit() {
        System.out.println("enter employee code");
        String code;
        int index;
        boolean flag = false;
        boolean finishEdit = false;
        String choose;
        String name;
        String dayOfBirth;
        String gender;
        String id;
        String phoneNumber;
        String email;
        String degree;
        String position;
        String salary;
        Employee employee;
        do {
            code = sc.nextLine();
            if ((index = employeeRepository.findCodeEmployee(code)) == -1) {
                System.out.println("employee code does not exist, enter again");
                continue;
            }
            break;
        } while (true);
        employee = employeeRepository.findEmployee(index);
        do {
            System.out.println("select an item to edit\n" +
                    "1. Name\n" +
                    "2. Date of birth\n" +
                    "3. Gender\n" +
                    "4. ID\n" +
                    "5. Telephone number\n" +
                    "6. Email\n" +
                    "7. Degree\n" +
                    "8. Position\n" +
                    "9. Salary");
            do {
                choose = sc.nextLine();
                switch (choose) {
                    case "1":
                        System.out.println("enter name");
                        do {
                            name = sc.nextLine();
                            if (CheckInfo.checkName(name)) {
                                break;
                            }
                            System.out.println("wrong name, please enter again");
                        } while (true);
                        employee.setName(name);
                        break;

                    case "2":
                        System.out.println("enter date of birth (dd/mm/yyyy)");
                        do {
                            dayOfBirth = sc.nextLine();
                            if (!CheckInfo.checkDateOfBirth(dayOfBirth)) {
                                System.out.println("wrong date of birth");
                                continue;
                            }
                            if (CheckInfo.checkAge(dayOfBirth)) {
                                break;
                            }
                            System.out.println("employee is under 18");
                        } while (true);
                        employee.setDateOfBirth(dayOfBirth);
                        break;

                    case "3":
                        System.out.println("choose gender: 1.male 2.female 3. LGBT");
                        do {
                            gender = sc.nextLine();
                            if (CheckInfo.checkGender(gender).equals("0")) {
                                System.out.println("wrong choice, choose again");
                                continue;
                            }
                            gender = CheckInfo.checkGender(gender);
                            break;
                        } while (true);
                        employee.setGender(gender);
                        break;

                    case "4":
                        System.out.println("enter ID");
                        do {
                            id = sc.nextLine();
                            if (CheckInfo.checkId(id)) {
                                break;
                            }
                            System.out.println("wrong ID, enter again");
                        } while (true);
                        employee.setId(id);
                        break;

                    case "5":
                        System.out.println("enter telephone number");
                        do {
                            phoneNumber = sc.nextLine();
                            if (CheckInfo.checkPhoneNumber(phoneNumber)) {
                                break;
                            }
                            System.out.println("wrong telephone number, enter again");
                        } while (true);
                        employee.setPhoneNumber(phoneNumber);
                        break;

                    case "6":
                        System.out.println("enter email");
                        email = sc.nextLine();
                        employee.setEmail(email);
                        break;

                    case "7":
                        System.out.println("choose degree: 1.Intermediate 2.College 3.University 4.After University");
                        do {
                            degree = sc.nextLine();
                            if (CheckInfo.checkDegree(degree).equals("0")) {
                                System.out.println("wrong choice, choose again");
                                continue;
                            }
                            degree = CheckInfo.checkDegree(degree);
                            break;
                        } while (true);
                        employee.setDegree(degree);
                        break;

                    case "8":
                        System.out.println("choose position: 1.Receptionist 2.Staff 3.Expert 4.Supervisor 5.Manager 6.Director");
                        do {
                            position = sc.nextLine();
                            if (CheckInfo.checkPosition(position).equals("0")) {
                                System.out.println("wrong choice, choose again");
                                continue;
                            }
                            position = CheckInfo.checkPosition(position);
                            break;
                        } while (true);
                        employee.setPosition(position);
                        break;

                    case "9":
                        System.out.println("enter salary");
                        do {
                            salary = sc.nextLine();
                            if (CheckInfo.checkSalary(salary)) {
                                break;
                            }
                            System.out.println("you enter wrong, enter again");
                        } while (true);
                        employee.setSalary(salary);
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
        employeeRepository.editEmployee(index, employee);
    }
}

