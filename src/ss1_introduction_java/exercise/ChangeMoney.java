package ss1_introduction_java.exercise;

import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        short vnd = 23000;
        System.out.println("nhập số tiền USD bạn muốn đổi: ");
        Scanner sc = new Scanner(System.in);
        int money = Integer.parseInt(sc.nextLine());
        int moneyViet = vnd*money;
        System.out.println("số tiền Việt được đổi sang là: "+moneyViet+" đồng");
    }
}
