package extra_exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Exercise7 {
    public String arrangeString(String string) {
        ArrayList<Character> array = new ArrayList<Character>();
        String stringArranged = "";
        for (int i = 0; i < string.length(); i++) {
            array.add(string.charAt(i));
        }
        array.sort(Comparator.comparing(Character -> Character));
        for (int i = 0; i < array.size(); i++) {
            stringArranged += array.get(i);
        }
        return stringArranged;
    }

    public static void main(String[] args) {
        String string = "abcabcbca";
        Exercise7 exercise7 = new Exercise7();
        System.out.println(exercise7.arrangeString(string));
    }
}
