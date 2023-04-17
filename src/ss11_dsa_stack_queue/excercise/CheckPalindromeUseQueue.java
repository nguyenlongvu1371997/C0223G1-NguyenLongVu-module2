package ss11_dsa_stack_queue.excercise;

import java.util.*;

public class CheckPalindromeUseQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chuỗi cần kiểm tra");
        String string = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        ArrayDeque<Character> queue = new ArrayDeque<>();
        for (int i = 0; i < string.length(); i++) {
            stack.push(string.charAt(i));
            queue.add(string.charAt(i));
        }
        boolean flag = true;
        for (int i = 0; i < string.length(); i++) {
            if (stack.pop() != queue.pop()) {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}
