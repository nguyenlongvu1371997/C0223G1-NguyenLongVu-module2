package s14_sort_algorithm.excercise;

import java.util.Arrays;
import java.util.Scanner;

public class InsertSortByStep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số lượng của mảng");
        int number = Integer.parseInt(sc.nextLine());
        int[] array = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.print("nhập phần tử thứ "+(i+1)+" ");
            array[i]=Integer.parseInt(sc.nextLine());
        }
        insertSortByStep(array);

    }
    public static void insertSortByStep(int[] array){
        for (int i = 1; i < array.length; i++) {
            System.out.println("chèn phần tử ở vị trí "+i+" vào mảng bên trái");
            int number = array[i];
            for (int j = i - 1; j >= 0; j--) {
                if (array[j] > number) {
                    System.out.println("phần tử ở vị trí "+j+" bé hơn phần tử cần chèn thì dịch chuyển phẩn tử đó sang phải");
                    array[j + 1] = array[j];
                    if (j == 0 || array[j - 1] < number) {
                        array[j] = number;
                        break;
                    }
                }
            }
            System.out.println("mảng sau lần lập thứ: " +i);
            System.out.println(Arrays.toString(array));
        }
    }
}
