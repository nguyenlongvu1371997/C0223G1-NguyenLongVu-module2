package ss13_search_algorithm.excercise;

import java.util.Scanner;

public class FindTheLongestConsecutiveString {
    public String findTheLongestString(String string) {
        int max = 0;
        String stringMax = "";
        String str = "";
        int count = 0;

        for (int i = 0; i < string.length(); i++) {
            if (i == 0 || string.charAt(i) > string.charAt(i - 1)) {
                str += string.charAt(i);
                count++;
                if (count > max) {
                    max = count;
                    stringMax = str;
                }
            } else {
                count = 1;
                str = "" + string.charAt(i);
            }
        }
        return stringMax;
    }

    public static void main(String[] args) {
        System.out.println("nhập chuỗi");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        FindTheLongestConsecutiveString findTheLongestString = new FindTheLongestConsecutiveString();
        System.out.println(findTheLongestString.findTheLongestString(string));
    }
}


