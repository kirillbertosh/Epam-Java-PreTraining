package task1;

import task1.triangle.Util;

public class Test3_1 {

    public static void main(String[] args) {
        int x1 = 1;
        int y1 = 1;
        int x2 = 3;
        int y2 = 1;
        int x3 = 3;
        int y3 = 3;
        System.out.println("Coordinates are: " + x1 + " " + y1 + "; " + x2 + " " + y2 + "; " + x3 + " " + y3);
        System.out.println("Is triangle: " + Util.isTriangle(x1, y1, x2, y2, x3, y3));
        System.out.println("Is right triangle: " + Util.isRightTriangle(x1, y1, x2, y2, x3, y3));
    }
}
