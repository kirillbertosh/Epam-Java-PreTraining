package individual.matrix;

public class Matrix {

    public static int getMinProductColumnNumber(double[][] matrix) {
        int columnNumber = 0;
        double minProduct = 1;
        int k = 0;
        for (int i = 0; i < matrix[k].length; i++) {
            minProduct *= matrix[i][k];
        }

        for (int j = 1; j < matrix.length; j++) {
            double product = 1;
            for (int i = 0; i < matrix[j].length; i++) {
                product *= matrix[i][j];
            }
            if (product < minProduct) {
                minProduct = product;
                columnNumber = j;
            }
        }
        return columnNumber;
    }
}
