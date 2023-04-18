package ss13_search_algorithm.excercise;

import java.util.Scanner;

public class FindTheLongestString {
    public String findTheLongestString(String string) {
        String stringMax = "";
        String str = "";
        int count = 0;
        int max = 0;
        for (int i = 0; i < string.length(); i++) {
            if (i > 0 && string.charAt(i) > stringMax.charAt(0)) {
                continue;
            }
            for (int j = 0; j < string.length(); j++) {
                if (j == 0 || string.charAt(j) > string.charAt(j - 1))
                    str += string.charAt(j);
                count++;
                if (count > max) {
                    max = count;
                    stringMax = str;
                }
            }
            count = 0;
            str = "";
        }
        return stringMax;
    }

    public static void main(String[] args) {
        System.out.println("nhập chuỗi");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        FindTheLongestString findTheLongestString = new FindTheLongestString();
        System.out.println(findTheLongestString.findTheLongestString(string));
    }
}
