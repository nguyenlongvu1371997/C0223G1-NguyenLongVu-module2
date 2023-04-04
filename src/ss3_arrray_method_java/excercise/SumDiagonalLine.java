package ss3_arrray_method_java.excercise;

import java.util.Arrays;
import java.util.Scanner;

public class SumDiagonalLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập kích thước mảng hình vuông");
        int number = Integer.parseInt(sc.nextLine());
        int[][] array = new int[number][number];
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.println("nhập phần tử vị trí: " + i + "," + j);
                array[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < number; i++) {
            sum1 += array[i][i];
            sum2 += array[i][number - 1 - i];
        }
        System.out.println("Tổng các số của 2 đường chéo là: " + sum1 + ", " + sum2);

    }
}
