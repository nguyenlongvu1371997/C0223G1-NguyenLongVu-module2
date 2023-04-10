package ss6_inheritance.excercise.point_and_moveable_point;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.setXSpeed(xSpeed);
        this.setYSpeed(ySpeed);
    }

    public float[] getSpeed() {
        float[] xySpeed = new float[2];
        xySpeed[0] = xSpeed;
        xySpeed[1] = ySpeed;
        return xySpeed;
    }

    @Override
    public String toString() {
        return super.toString() +
                "MovablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    public MovablePoint move() {
        float x = super.getX() + this.getXSpeed();
        float y = super.getY() + this.getYSpeed();
        super.setXY(x, y);
        return this;
    }

    public static void main(String[] args) {
        MovablePoint p4 = new MovablePoint(1, 2, 3, 4);
        System.out.println(p4.toString());
        System.out.println(p4.move().toString());
    }
}
