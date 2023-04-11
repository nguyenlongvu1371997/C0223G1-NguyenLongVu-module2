package ss7_abstract_class_and_interface.excercise;

public class TestColor {
    public static void main(String[] args) {
        Shape s1 = new Square(12);
        Shape s2 = new Circle(5);
        Shape s3 = new Rectangle(5, 10);
        Shape s4 = new Rectangle(3, 8);
        Shape[] arr = {s1, s2, s3, s4};

        for (byte i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Square) {
                arr[i] = (Square) arr[i];
                System.out.println("Diện tích hình thứ " + (i + 1) + " là " + ((Square) arr[i]).getArea());
            } else if (arr[i] instanceof Circle) {
                arr[i] = (Circle) arr[i];
                System.out.println("Diện tích hình thứ " + (i + 1) + " là " + ((Circle) arr[i]).getArea());
            } else {
                arr[i] = (Rectangle) arr[i];
                System.out.println("Diện tích hình thứ " + (i + 1) + " là " + ((Rectangle) arr[i]).getArea());
            }
            if (arr[i] instanceof IColorable) {
                ((IColorable) arr[i]).howToColor();
            }
        }
    }
}

