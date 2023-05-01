package extra_exercises;

import java.util.ArrayList;

public class Exercise2 {
    public ArrayList<String> countCharacters(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        ArrayList<String> array = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < stringBuilder.length(); i++) {
            count = 1;
            for (int j = i + 1; j < stringBuilder.length(); j++) {
                if (stringBuilder.charAt(i) == stringBuilder.charAt(j)) {
                    count++;
                    stringBuilder.deleteCharAt(j);
                    j--;
                }
            }
            array.add(String.valueOf(count) + String.valueOf(stringBuilder.charAt(i)));
        }
        return array;
    }

    public static void main(String[] args) {
        String string = "abcabcdabcdeabcdef";
        Exercise2 exercise2 = new Exercise2();
        System.out.println(exercise2.countCharacters(string));
    }
}
