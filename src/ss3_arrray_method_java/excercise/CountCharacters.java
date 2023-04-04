package ss3_arrray_method_java.excercise;

import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chuỗi");
        String str = sc.nextLine();
        char cha = 'i';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == cha) {
                count++;
            }
        }
        System.out.println("số bạn cần muốn đếm xuất hiện " + count + " lần");
    }
}
