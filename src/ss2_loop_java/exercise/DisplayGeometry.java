package ss2_loop_java.exercise;

import java.sql.SQLOutput;

public class DisplayGeometry {
    public static void main(String[] args) {
        String rectangle = "";
        String rightTriangle = "";
        String invertedRightTriangle = "";
        String isoscelesTriangle = "";
        for (byte width = 0; width < 4; width++) {
            for (byte length = 0; length < 20; length++) {
                rectangle += "*";
            }
            rectangle += "\n";
        }
        System.out.println(rectangle);
        for (byte side1 = 0; side1 < 5; side1++) {
            for (byte side2 = 0; side2 <= side1; side2++) {
                rightTriangle += "*";
            }
            rightTriangle += "\n";
        }
        System.out.println(rightTriangle);
        for (byte side1 = 0; side1 < 5; side1++) {
            for (byte side2 = side1; side2 < 5; side2++) {
                invertedRightTriangle += "*";
            }
            invertedRightTriangle += "\n";
        }
        System.out.println(invertedRightTriangle);
        for (byte side = 0; side < 7; side++) {
            for (byte bottom = 0; bottom <= (7 * 2 + 1); bottom++) {
                if (bottom < (7 + 1 - side) || bottom > (7 + 1 + side)) {
                    isoscelesTriangle += " ";
                } else {
                    isoscelesTriangle += "*";
                }
            }
            isoscelesTriangle += "\n";
        }
        System.out.println(isoscelesTriangle);
    }

}
