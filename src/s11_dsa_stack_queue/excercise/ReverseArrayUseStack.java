package s11_dsa_stack_queue.excercise;

import java.util.Arrays;
import java.util.Stack;

public class ReverseArrayUseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 10};
        for (int a : array) {
            stack.push(a);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
        System.out.println(Arrays.toString(array));
        Stack<Character> stack1 = new Stack<>();
        String string = "abcabc1234ab";
        for (int j = 0; j < string.length(); j++) {
            stack1.push(string.charAt(j));
        }
        String string1 = "";
        for (int j = 0; j < string.length(); j++) {
            string1 += stack1.pop();
        }
        System.out.println(string1);
    }
}
