package common;

import common.matrix.Matrix;

public class Test6_1 {

    public static void showMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String... args) {
        double[][] testMatrix = {
                {6, 6, 2.2, 0.3},
                {0, 2, 5.5, 1},
                {-3.3, -3.5, 2.1, 4},
                {1, 2, 3, 3}
        };

        System.out.println(Matrix.getMaxElement(testMatrix));
        System.out.println(Matrix.getMinElement(testMatrix));
        System.out.println(Matrix.average(testMatrix));
        System.out.println(Matrix.geometric(testMatrix));
        System.out.println(Matrix.getFirstLocalMaximumIndex(testMatrix)[0] + " "
                + Matrix.getFirstLocalMaximumIndex(testMatrix)[1]);
        System.out.println(Matrix.getFirstLocalMinimumIndex(testMatrix)[0] + " "
                + Matrix.getFirstLocalMinimumIndex(testMatrix)[1]);
        showMatrix(testMatrix);
        testMatrix = Matrix.transpose(testMatrix);
        System.out.println("");
        showMatrix(testMatrix);
    }
}
