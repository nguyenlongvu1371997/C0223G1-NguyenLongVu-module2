package ss3_arrray_method_java.excercise;

import java.util.Scanner;

public class FindMinInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số phần tử");
        int quantity = Integer.parseInt(sc.nextLine());
        int[] array = new int[quantity];
        for (int i = 0; i < quantity; i++) {
            System.out.println("nhập phần tử thứ: " + (i + 1));
            array[i] = Integer.parseInt(sc.nextLine());
        }
        int min = array[0];
        for (int i = 0; i < quantity; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("giá trị bé nhất là: " + min);
    }
}
