package task1.triangle;

public class Util {

    public static boolean isTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        double lineA = getLineLength(x1, y1, x2, y2);
        double lineB = getLineLength(x1, y1, x3, y3);
        double lineC = getLineLength(x2, y2, x3, y3);
        return lineA < lineB + lineC && lineB < lineA + lineC && lineC < lineA + lineB;
    }

    private static double getLineLength(int x1, int y1, int x2, int y2) {
        int xLength = Math.abs(x1 - x2);
        int yLength = Math.abs(y1 - y2);
        return Math.pow(xLength * xLength + yLength * yLength, 0.5);
    }

    public static boolean isRightTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        double lineA = getLineLength(x1, y1, x2, y2);
        double lineB = getLineLength(x1, y1, x3, y3);
        double lineC = getLineLength(x2, y2, x3, y3);
        if (lineA == lineB) {
            return lineC == Math.pow(lineA * lineA + lineB * lineB, 0.5);
        }
        if (lineA == lineC) {
            return lineB == Math.pow(lineA * lineA + lineC * lineC, 0.5);
        }
        return lineA == Math.pow(lineC * lineC + lineB * lineB, 0.5);
    }
}
