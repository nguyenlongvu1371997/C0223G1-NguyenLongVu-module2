package s14_sort_algorithm.excercise;

import java.util.Arrays;

public class InsertionSort {
    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int number = array[i];
            for (int j = i - 1; j >= 0; j--) {
                if (array[j] > number) {
                    array[j + 1] = array[j];
                    if (j == 0 || array[j - 1] < number) {
                        array[j] = number;
                        break;
                    }
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {3, 4, 5, 1, 2, 4, 8, 12, 201, 6};
        System.out.println(Arrays.toString(InsertionSort.insertionSort(array)));
    }
}
