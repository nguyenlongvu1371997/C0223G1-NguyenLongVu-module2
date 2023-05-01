package case_study.service;

import java.time.LocalDate;
import java.time.Period;

public class CheckInfo {
    public static boolean checkCodeEmployee(String code) {
        String PATTERN = "^NV\\d{4}$";
        return code.matches(PATTERN);
    }

    public static boolean checkCodeCustomer(String code) {
        String PATTERN = "^KH\\d{4}$";
        return code.matches(PATTERN);
    }

    public static boolean checkName(String name) {

        String PATTERN = "^([\\p{Lu}][\\p{Ll}]{1,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5}$";
        return name.matches(PATTERN);
    }

    public static boolean checkDateOfBirth(String dateOfBirth) {
        String PATTERN = "^(0\\d|1\\d|2\\d|3(0|1))+/+(0\\d|1(0|1|2))+/+\\d{4}$";
        return dateOfBirth.matches(PATTERN);
    }

    public static boolean checkAge(String dateOfBirth) {
        int date = Integer.parseInt(String.valueOf(dateOfBirth.charAt(0))) * 10 + Integer.parseInt(String.valueOf(dateOfBirth.charAt(1)));
        int month = Integer.parseInt(String.valueOf(dateOfBirth.charAt(3))) * 10 + Integer.parseInt(String.valueOf(dateOfBirth.charAt(4)));
        int year = Integer.parseInt(dateOfBirth.substring(6, 10));
//        LocalDate date1 = LocalDate.parse(dateOfBirth);
        LocalDate birth = LocalDate.of(year, month, date);
        if (Period.between(birth, LocalDate.now()).getYears() >= 18) {
            return true;
        }
        return false;
    }

    public static boolean checkId(String id) {
        String PATTERN1 = "^\\d{9}$";
        String PATTERN2 = "^\\d{12}$";
        if (id.matches(PATTERN1) || id.matches(PATTERN2)) {
            return true;
        }
        return false;
    }

    public static boolean checkPhoneNumber(String phoneNumber) {
        String PATTERN = "^0\\d{9}$";
        return phoneNumber.matches(PATTERN);
    }

    public static String checkGender(String gender) {
        switch (gender) {
            case "1":
                return "male";
            case "2":
                return "female";
            case "3":
                return "LGBT";
            default:
                return "0";
        }
    }

    public static String checkDegree(String degree) {
        switch (degree) {
            case "1":
                return "intermediate";
            case "2":
                return "college";
            case "3":
                return "university";
            case "4":
                return "after_university";
            default:
                return "0";
        }
    }

    public static String checkPosition(String position) {
        switch (position) {
            case "1":
                return "receptionist";
            case "2":
                return "staff";
            case "3":
                return "expert";
            case "4":
                return "supervisor";
            case "5":
                return "manager";
            case "6":
                return "director";
            default:
                return "0";
        }
    }

    public static boolean checkSalary(String salary) {
        String PATTERN = "^[1-9]\\d*$";
        return salary.matches(PATTERN);

    }


}
