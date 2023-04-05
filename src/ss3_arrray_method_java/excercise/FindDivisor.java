package ss3_arrray_method_java.excercise;

import java.util.Arrays;
import java.util.Scanner;

public class FindDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số vào đây");
        int number = Integer.parseInt(sc.nextLine());
        System.out.println(Arrays.toString(findDivisor(number)));
    }

    public static int[] findDivisor(int number) {
        int count = 0;
        int[] arr = new int[number];
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                arr[count] = i;
                count++;
            }
        }
        int[] arr1 = new int[count];
        for (int i = 0; i < count; i++) {
            arr1[i] = arr[i];
        }
        return arr1;
    }
}
