package ss3_arrray_method_java.excercise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementFromArray {
    public static void main(String[] args) {
        int[] myList = new int[10];
        myList[0] = 1;
        myList[1] = 2;
        myList[2] = 3;
        myList[3] = 4;
        myList[4] = 5;
        myList[5] = 6;
        myList[6] = 7;
        myList[7] = 8;
        myList[8] = 9;
        myList[9] = 10;
        System.out.println("nhập vị trí phần tử bạn muốn xóa");
        Scanner sc = new Scanner(System.in);
        int index = Integer.parseInt(sc.nextLine());
        for (int i = index; i < (myList.length - 1); i++) {
            myList[i] = myList[i + 1];
        }
        myList[myList.length - 1] = 0;
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i]);
        }
        System.out.println(Arrays.toString(myList));
    }
}
