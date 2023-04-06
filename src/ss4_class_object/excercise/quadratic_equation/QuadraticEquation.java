package ss4_class_object.excercise.quadratic_equation;

public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return (Math.pow(b, 2) - 4 * a * c);
    }

    public double getRoot1() {
        return (((-b) + Math.pow(getDiscriminant(), 0.5)) / (2 * a));
    }

    public double getRoot2() {
        return (((-b) - Math.pow(getDiscriminant(), 0.5)) / (2 * a));
    }
}
