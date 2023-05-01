package extra_exercises;

import java.util.ArrayList;

public class Exercise3 {
    public ArrayList<Integer> arrayFibonacci(int number) {
        int a = 0;
        int b = 1;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        while (b + a < number) {
            b += a;
            a = b - a;
            list.add(b);
        }
        return list;
    }

    public static void main(String[] args) {
        Exercise3 exercise3 = new Exercise3();
        System.out.println(exercise3.arrayFibonacci(100));
    }
}
