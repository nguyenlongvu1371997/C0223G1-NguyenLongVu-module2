package ss6_inheritance.excercise.point2d_and_point3d;

import java.util.Arrays;

public class Point3D extends Point2D {
    public float z;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        float[] xyz = new float[3];
        xyz[0] = getX();
        xyz[1] = getY();
        xyz[2] = getZ();

        return xyz;
    }

    public void setXYZ(float x, float y, float z) {
        this.setXY(x, y);
        this.setZ(z);
    }

    @Override
    public String toString() {
        return "Point3D{" + super.toString() +
                "z=" + z +
                '}';
    }

    public static void main(String[] args) {
        Point3D p3 = new Point3D(1,2,3);
        p3.setXYZ(2,3,4);
        System.out.println(Arrays.toString(p3.getXYZ()));
        System.out.println(p3.toString());
    }
}
