package extra_exercises;

import java.util.ArrayList;

public class Exercise4 {
    public ArrayList<Integer> findNumber(int number) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 5; i < number; i += 10) {
            if (i % 3 == 0) {
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Exercise4 exercise4 = new Exercise4();
        System.out.println(exercise4.findNumber(100));
    }
}
