package ss3_arrray_method_java.excercise;

import java.util.Scanner;

public class CalculateSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số hàng");
        int m = Integer.parseInt(sc.nextLine());
        System.out.println("nhập số cột");
        int n = Integer.parseInt(sc.nextLine());
        int[][] array = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("nhập phần tử ở vị trí " + i + " " + j);
                array[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        System.out.println("nhập cột bạn muốn tính tổng");
        int column = Integer.parseInt(sc.nextLine());
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][column];
        }
        System.out.println("tổng của cột đó là: " + sum);
    }
}
