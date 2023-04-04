package ss3_arrray_method_java.excercise;

import java.util.Scanner;

public class FindMaxInArray {
    public static void main(String[] args) {
        System.out.println("nhập số cột");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("nhập số hàng");
        int m = Integer.parseInt(sc.nextLine());
        int[][] numbers = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("nhập phần tử ở vị trí " + i + " và " + j);
                numbers[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        int max = numbers[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (numbers[i][j] > max) {
                    max = numbers[i][j];
                }
            }
        }
        System.out.println("giá trị lớn nhất trong chuỗi là: " + max);
    }
}
