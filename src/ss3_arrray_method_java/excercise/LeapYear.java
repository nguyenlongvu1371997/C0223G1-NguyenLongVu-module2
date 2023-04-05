package ss3_arrray_method_java.excercise;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập năm bạn muốn kiểm tra");
        int year = Integer.parseInt(sc.nextLine());
        System.out.println(checkLeapYear(year));
    }

    public static boolean checkLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        if (year % 4 == 0) {
            return true;
        }
        return false;
    }
}
