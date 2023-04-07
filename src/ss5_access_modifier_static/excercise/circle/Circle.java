package ss5_access_modifier_static.excercise.circle;

public class Circle {
    private double radius = 1;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return (Math.pow(getRadius(), 2) * 3.14);
    }
}
