package case_study.model.person;

public class Customer extends Person {
    private String type;
    private String address;

    public Customer() {
    }

    public Customer(String code, String name, String dayOfBirth, String gender,
                    String id, String phoneNumber, String email, String type, String address) {
        super(code, name, dayOfBirth, gender, id, phoneNumber, email);
        this.type = type;
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void booking() {

    }

    public void makeContract() {

    }

    @Override
    public String toString() {
        return "Customer{" +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", dayOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", id='" + id + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", type='" + type + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String infoCustomer() {
        return code + "," + name + "," + dateOfBirth + "," + gender + "," + id + "," + phoneNumber + "," + email + "," + type + "," + address;
    }
}
