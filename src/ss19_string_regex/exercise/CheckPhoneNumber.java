package ss19_string_regex.exercise;

public class CheckPhoneNumber {
    public boolean checkPhoneNumber(String phoneNumber) {
        String PATTERN = "^\\d{2}+-0+\\d{7}";
        return phoneNumber.matches(PATTERN);
    }

    public static void main(String[] args) {
        CheckPhoneNumber checkPhoneNumber = new CheckPhoneNumber();
        String phoneNumber = "a2-01345678";
        System.out.println(checkPhoneNumber.checkPhoneNumber(phoneNumber));
    }
}
