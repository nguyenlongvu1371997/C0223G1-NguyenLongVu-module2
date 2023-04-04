package ss3_arrray_method_java.excercise;

import java.util.Arrays;

public class MergeArraysTogether {
    public static void main(String[] args) {
        int[] myList1 = {1, 2, 3, 4, 5, 6, 7};
        int[] myList2 = {2, 3, 4, 5, 6, 7, 8};
        int[] myList3 = new int[myList1.length + myList2.length];
        for (int i = 0; i < myList1.length; i++) {
            myList3[i] = myList1[i];
        }
        for (int i = 0; i < myList2.length; i++) {
            myList3[myList1.length + i] = myList2[i];
        }
        System.out.println(Arrays.toString(myList3));
    }
}
