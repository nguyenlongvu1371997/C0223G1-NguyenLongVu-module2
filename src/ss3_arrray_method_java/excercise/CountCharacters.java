package ss3_arrray_method_java.excercise;

import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 1, 2, 3, 1, 2, 3, 4, 5, 1, 2};
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số bạn muốn đếm");
        int number = Integer.parseInt(sc.nextLine());
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                count++;
            }
        }
        System.out.println("số bạn cần muốn đếm xuất hiện " + count + " lần");
    }
}
