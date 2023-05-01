package case_study.model.person;

public class Employee extends Person {
    private String degree;
    private String position;
    private String salary;

    public Employee() {
    }

    public Employee(String code, String name, String dayOfBirth, String gender, String id, String phoneNumber, String email, String degree, String position, String salary) {
        super(code, name, dayOfBirth, gender, id, phoneNumber, email);
        this.degree = degree;
        this.position = position;
        this.salary = salary;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", dayOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", id='" + id + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                "degree='" + degree + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String infoEmployee() {
        return code + "," + name + "," + dateOfBirth + "," + gender + "," + id + "," + phoneNumber + "," + email + "," + degree + "," + position + "," + salary;
    }
}
