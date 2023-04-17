package ss11_dsa_stack_queue.excercise;

import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public class CountWordInString {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        String string = "i love you pac pac pac";
        String string1 = "";
        for (int i = 0; i <= string.length(); i++) {
            if (i == string.length() || string.charAt(i) == ' ') {
                String string2 = string1.toUpperCase();
                if (map.get(string2) != null) {
                    map.put(string2, map.get(string2) + 1);
                } else {
                    map.put(string2, 1);
                }
                string1 = "";
            } else {
                string1 += string.charAt(i);
            }
        }
        System.out.println(map);
    }
}
