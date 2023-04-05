package ss3_arrray_method_java.excercise;

import java.util.Scanner;

public class CheckOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số bạn muốn kiểm tra");
        int number = Integer.parseInt(sc.nextLine());
        System.out.println(isOdd(number));
    }

    public static boolean isOdd(int number) {
        if (number % 2 == 1) {
            return true;
        }
        return false;
    }
}
