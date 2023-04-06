package ss4_class_object.excercise.fan;

import com.sun.org.apache.xerces.internal.util.SAXLocatorWrapper;

public class Fan {
    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;
    int speed;
    boolean on;
    double radius;
    String color;

    private Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    private Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (on == true) {
            return "Fan{" +
                    "speed=" + speed +
                    ", on=" + on +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        } else {
            return "Fan{" +
                    " on=" + on +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }
    }


    public static void main(String[] args) {
        Fan Fan1 = new Fan(MEDIUM, true, 10, "yellow");
        System.out.println(Fan1.toString());
        Fan Fan2 = new Fan(FAST, false, 5, "blue");
        System.out.println(Fan2.toString());
    }
}

