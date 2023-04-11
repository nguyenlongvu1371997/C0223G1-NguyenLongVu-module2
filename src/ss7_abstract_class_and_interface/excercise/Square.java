package ss7_abstract_class_and_interface.excercise;

public class Square extends Shape implements IColorable {
    private double side = 1;

    public Square(double side) {
        this.side = side;
    }

    public Square() {
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}
