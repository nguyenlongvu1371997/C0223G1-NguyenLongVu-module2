package ss15_handle_exception.excercise;

import java.util.Scanner;

public class CheckTriangle {
    private static Object IllegalTriangleException;

    public static void checkTriangle(double sideA, double sideB, double sideC) throws IllegalTriangleException {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            throw new IllegalTriangleException("cạnh tam giác không được âm");
        } else if (sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA) {
            throw new IllegalTriangleException("tổng 2 cạnh bất kì phải lớn hơn cạnh còn lại");
        } else {
            System.out.println("tam giác hợp lệ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double sideA = 0.0, sideB = 0.0, sideC = 0.0;
        System.out.println("nhập cạnh a");
        try {
            sideA = Double.parseDouble(sc.nextLine());
        } catch (NumberFormatException e) {
            System.err.println(e);
            System.out.println("phải nhập số");
        }
        System.out.println("nhập cạnh b");
        try {
            sideB = Double.parseDouble(sc.nextLine());
        } catch (NumberFormatException e) {
            System.err.println(e);
            System.out.println("phải nhập số");
        }
        System.out.println("nhập cạnh c");
        try {
            sideC = Double.parseDouble(sc.nextLine());
        } catch (NumberFormatException e) {
            System.err.println(e);
            System.out.println("phải nhập số");
        }
        try {
            CheckTriangle.checkTriangle(sideA, sideB, sideC);
        } catch (IllegalTriangleException e) {
            System.err.println(e);
        }
    }
}
