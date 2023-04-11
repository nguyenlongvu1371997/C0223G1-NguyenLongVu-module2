package ss7_abstract_class_and_interface.excercise;

import java.util.Random;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Circle(12);
        Shape s2 = new Circle(5);
        Shape s3 = new Rectangle(5, 10);
        Shape s4 = new Rectangle(3, 8);
        Shape[] arr = {s1, s2, s3, s4};

        for (byte i = 0; i < arr.length; i++) {
            double randomNumber = Math.floor(Math.random() * 100);
            if (arr[i] instanceof Circle) {
                Circle shape = (Circle) arr[i];
                System.out.println("Hình thứ " + (i + 1));
                System.out.println("Diện tích cũ là: " + shape.getArea());
                shape.reSize(randomNumber);
                System.out.println("phần trăm tăng lên là: " + randomNumber);
                System.out.println("Diện tích mới là: " + shape.getArea());

            } else {
                Rectangle shape = (Rectangle) arr[i];
                System.out.println("Hình thứ " + (i + 1));
                System.out.println("Diện tích cũ là: " + shape.getArea());
                shape.reSize(randomNumber);
                System.out.println("phần trăm tăng lên là: " + randomNumber);
                System.out.println("Diện tích mới là: " + shape.getArea());
            }
        }

    }
}
