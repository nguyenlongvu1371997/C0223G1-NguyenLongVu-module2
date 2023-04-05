package ss3_arrray_method_java.excercise;

import java.util.Arrays;

public class Fibonacci100 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(displayFibonacci(100)));
    }

    public static int[] displayFibonacci(int limit) {
        int a = 0;
        int b = 1;
        int[] arr = new int[limit];
        arr[0] = 0;
        arr[1] = 1;
        int count = 2;
        while (b <= limit) {
            b += a;
            a = b - a;
            arr[count] = a;
            count++;
        }
        int[] arr1 = new int[count];
        for (int i = 0; i < count; i++) {
            arr1[i] = arr[i];
        }
        return arr1;
    }
}
