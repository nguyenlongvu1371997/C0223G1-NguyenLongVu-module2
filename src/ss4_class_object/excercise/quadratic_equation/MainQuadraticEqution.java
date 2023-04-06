package ss4_class_object.excercise.quadratic_equation;

import java.util.Scanner;

public class MainQuadraticEqution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập a");
        double a = Integer.parseInt(sc.nextLine());
        System.out.println("nhập b");
        double b = Integer.parseInt(sc.nextLine());
        System.out.println("nhập c");
        double c = Integer.parseInt(sc.nextLine());
        QuadraticEquation qua = new QuadraticEquation(a, b, c);
        if (qua.getDiscriminant() > 0) {
            System.out.println("phương trình có 2 nghiệm là: " + qua.getRoot1() + " và " + qua.getRoot2());
        } else if (qua.getDiscriminant() == 0) {
            System.out.println("phương trình có 1 nghiệm kép là: " + qua.getRoot1());
        } else {
            System.out.println("phương trình vô nghiệm");
        }
    }
}
