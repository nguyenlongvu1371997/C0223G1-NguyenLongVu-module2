package extra_exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise5 {
    public String findIndex(int[] list, int number) {
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] + list[j] == number) {
                    return "vị trí của 2 phần tử có tổng " + number + " là: " + i + ", " + j;
                }
            }
        }
        return "không tồn tại";
    }

    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5, 6, 7, 10};
        Exercise5 exercise5 = new Exercise5();
        System.out.println(exercise5.findIndex(list, 16));
    }
}
