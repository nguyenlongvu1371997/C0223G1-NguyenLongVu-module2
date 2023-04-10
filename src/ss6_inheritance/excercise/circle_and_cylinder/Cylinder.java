package ss6_inheritance.excercise.circle_and_cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateVolume() {
        return (Math.pow(getRadius(), 2) * 3.14 * getHeight());
    }

    @Override
    public String toString() {
        return "Cylinder{" + super.toString() +
                "height=" + height +
                '}';
    }

    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        c1.setRadius(5);
        c1.setColor("red");
        c1.setHeight(10);
        System.out.println(c1.toString());
        System.out.println(c1.calculateVolume());
    }
}
