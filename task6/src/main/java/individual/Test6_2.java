package individual;

import individual.matrix.Matrix;

public class Test6_2 {

    public static void main(String... args) {
        double[][] testMatrix = {
                {6, 6, 2.2, 0.3},
                {1, 2, 5.5, 1},
                {-3.3, 3.5, 2.1, 4},
                {1, 2, 3, 3}
        };
        System.out.println(Matrix.getMinProductColumnNumber(testMatrix));
    }
}
