package ss3_arrray_method_java.excercise;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        int[] myList = new int[10];
        myList[0] = 1;
        myList[1] = 2;
        myList[2] = 3;
        myList[3] = 4;
        System.out.println("nhập phần tử bạn muốn thêm");
        Scanner sc1 = new Scanner(System.in);
        int element = Integer.parseInt(sc1.nextLine());
        System.out.println("nhập vị trí bạn muốn thêm");
        int index = 0;
        do {
            Scanner sc2 = new Scanner(System.in);
            index = Integer.parseInt(sc2.nextLine());
        } while (index < 0 || index >= myList.length);
        for (int i = myList.length - 1; i > index; i--) {
            myList[i] = myList[i - 1];
        }
        myList[index] = element;
        System.out.println(Arrays.toString(myList));
    }
}
