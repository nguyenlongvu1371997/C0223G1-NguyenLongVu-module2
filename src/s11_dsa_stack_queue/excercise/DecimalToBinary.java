package s11_dsa_stack_queue.excercise;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Stack<Integer> binary = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số cần chuyển: ");
        Integer number = Integer.parseInt(sc.nextLine());
        int count = 0;
        while (number >= 1) {
            binary.push(number % 2);
            number = number / 2;
            count++;
        }
        String string = "";
        for (int i = 0; i < count; i++) {
            string += binary.pop();
        }
        System.out.println(string);
    }
}
