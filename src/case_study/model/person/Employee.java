package case_study.model.person;

public class Employee extends Person {
    private String degree;
    private String position;
    private double salary;

    public Employee() {
    }

    public Employee(String code, String name, String dayOfBirth, String gender, String id, String phoneNumber, String email, String degree, String position, double salary) {
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setAll(String code, String name, String dayOfBirth, String gender, String id, String phoneNumber, String email, String degree, String position, double salary) {
        setCode(code);
        setDegree(degree);
        setId(id);
        setName(name);
        setPosition(position);
        setDayOfBirth(dayOfBirth);
        setGender(gender);
        setPhoneNumber(phoneNumber);
        setEmail(email);
        setSalary(salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "degree='" + degree + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", dayOfBirth='" + dayOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", id='" + id + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String infoEmployee() {
        return "{" + code + "," + name + "," + dayOfBirth + "," + gender + "," + id + "," + phoneNumber + "," + email + "," + degree + "," + position + "," + salary;
    }
}
