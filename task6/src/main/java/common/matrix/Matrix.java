package common.matrix;

public class Matrix {

    public static double getMaxElement(double[][] matrix) {
        double max = 0;
        for (double[] row : matrix) {
            for (double element : row) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }

    public static double getMinElement(double[][] matrix) {
        double min = 0;
        for (double[] row : matrix) {
            for (double element : row) {
                if (element < min) {
                    min = element;
                }
            }
        }
        return min;
    }

    public static double average(double[][] matrix) {
        double sum = 0;
        int elementCount = 0;
        for (double[] row : matrix) {
            for (double element : row) {
                elementCount++;
                sum += element;
            }
        }
        return sum / elementCount;
    }

    public static double geometric(double[][] matrix) {
        double product = 0;
        int elementCount = 0;
        for (double[] row : matrix) {
            for (double element : row) {
                elementCount++;
                product += element;
            }
        }
        return Math.pow(product, (1/elementCount));
    }

    public static int[] getFirstLocalMaximumIndex(double[][] matrix) {
        int[] localMaximumIndex = {-1, -1};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == 0) {
                    if (j == 0) {
                        // check top left cornet
                        if (matrix[i][j] > matrix[i][j + 1]
                                && matrix[i][j] > matrix[i + 1][j]
                                && matrix[i][j] > matrix[i + 1][j + 1]) {
                            localMaximumIndex[0] = i;
                            localMaximumIndex[1] = j;
                            return localMaximumIndex;
                        }
                    }
                    // check top right corner
                    if (j == matrix[i].length - 1) {
                        if (matrix[i][j] > matrix[i][j - 1]
                                && matrix[i][j] > matrix[i + 1][j - 1]
                                && matrix[i][j] > matrix[i + 1][j]) {
                            localMaximumIndex[0] = i;
                            localMaximumIndex[1] = j;
                            return localMaximumIndex;
                        }
                    } else {
                        // check top row without corners
                        if (matrix[i][j] > matrix[i][j + 1]
                                && matrix[i][j] > matrix[i + 1][j + 1]
                                && matrix[i][j] > matrix[i + 1][j]
                                && matrix[i][j] > matrix[i + 1][j - 1]
                                && matrix[i][j] > matrix[i][j - 1]) {
                            localMaximumIndex[0] = i;
                            localMaximumIndex[1] = j;
                            return localMaximumIndex;
                        }
                    }
                }
                if (i == matrix.length - 1) {
                    //check bottom left corner
                    if (j == 0) {
                        if (matrix[i][j] > matrix[i - 1][j]
                                && matrix[i][j] > matrix[i - 1][j + 1]
                                && matrix[i][j] > matrix[i][j + 1]) {
                            localMaximumIndex[0] = i;
                            localMaximumIndex[1] = j;
                            return localMaximumIndex;
                        }
                    } else
                    //check bottom right corner
                    if (j == matrix[i].length - 1) {
                        if (matrix[i][j] > matrix[i - 1][j]
                                && matrix[i][j] > matrix[i - 1][j - 1]
                                && matrix[i][j] > matrix[i][j - 1]) {
                            localMaximumIndex[0] = i;
                            localMaximumIndex[1] = j;
                            return localMaximumIndex;
                        }
                    } else {
                        //check bottom row without corners
                        if (matrix[i][j] > matrix[i][j - 1]
                                && matrix[i][j] > matrix[i - 1][j - 1]
                                && matrix[i][j] > matrix[i - 1][j]
                                && matrix[i][j] > matrix[i - 1][j + 1]
                                && matrix[i][j] > matrix[i][j + 1]) {
                            localMaximumIndex[0] = i;
                            localMaximumIndex[1] = j;
                            return localMaximumIndex;
                        }
                    }
                }
                //check left side without corners
                if (j == 0 && i != 0 && i != matrix.length - 1) {
                    if (matrix[i][j] > matrix[i - 1][j]
                            && matrix[i][j] > matrix[i - 1][j + 1]
                            && matrix[i][j] > matrix[i][j + 1]
                            && matrix[i][j] > matrix[i + 1][j + 1]
                            && matrix[i][j] > matrix[i + 1][j]) {
                        localMaximumIndex[0] = i;
                        localMaximumIndex[1] = j;
                        return localMaximumIndex;
                    }
                }
                //check right side without corners
                if (j == matrix[i].length - 1 && i != 0 && i != matrix.length - 1) {
                    if (matrix[i][j] > matrix[i - 1][j]
                            && matrix[i][j] > matrix[i - 1][j - 1]
                            && matrix[i][j] > matrix[i][j - 1]
                            && matrix[i][j] > matrix[i + 1][j - 1]
                            && matrix[i][j] > matrix[i + 1][j]) {
                        localMaximumIndex[0] = i;
                        localMaximumIndex[1] = j;
                        return localMaximumIndex;
                    }
                }
                //check the rest
                if (i != 0 && j != 0 && i != matrix.length - 1 && j != matrix[i].length - 1) {
                    if (matrix[i][j] > matrix[i - 1][j - 1]
                            && matrix[i][j] > matrix[i - 1][j]
                            && matrix[i][j] > matrix[i - 1][j + 1]
                            && matrix[i][j] > matrix[i][j + 1]
                            && matrix[i][j] > matrix[i + 1][j + 1]
                            && matrix[i][j] > matrix[i + 1][j]
                            && matrix[i][j] > matrix[i + 1][j - 1]
                            && matrix[i][j] > matrix[i][j - 1]) {
                        localMaximumIndex[0] = i;
                        localMaximumIndex[1] = j;
                        return localMaximumIndex;
                    }
                }
            }
        }
        return localMaximumIndex;
    }

    public static int[] getFirstLocalMinimumIndex(double[][] matrix) {
        int[] localMaximumIndex = {-1, -1};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == 0) {
                    if (j == 0) {
                        // check top left cornet
                        if (matrix[i][j] < matrix[i][j + 1]
                                && matrix[i][j] < matrix[i + 1][j]
                                && matrix[i][j] < matrix[i + 1][j + 1]) {
                            localMaximumIndex[0] = i;
                            localMaximumIndex[1] = j;
                            return localMaximumIndex;
                        }
                    }
                    // check top right corner
                    if (j == matrix[i].length - 1) {
                        if (matrix[i][j] < matrix[i][j - 1]
                                && matrix[i][j] < matrix[i + 1][j - 1]
                                && matrix[i][j] < matrix[i + 1][j]) {
                            localMaximumIndex[0] = i;
                            localMaximumIndex[1] = j;
                            return localMaximumIndex;
                        }
                    } else {
                        // check top row without corners
                        if (matrix[i][j] < matrix[i][j + 1]
                                && matrix[i][j] < matrix[i + 1][j + 1]
                                && matrix[i][j] < matrix[i + 1][j]
                                && matrix[i][j] < matrix[i + 1][j - 1]
                                && matrix[i][j] < matrix[i][j - 1]) {
                            localMaximumIndex[0] = i;
                            localMaximumIndex[1] = j;
                            return localMaximumIndex;
                        }
                    }
                }
                if (i == matrix.length - 1) {
                    //check bottom left corner
                    if (j == 0) {
                        if (matrix[i][j] < matrix[i - 1][j]
                                && matrix[i][j] < matrix[i - 1][j + 1]
                                && matrix[i][j] < matrix[i][j + 1]) {
                            localMaximumIndex[0] = i;
                            localMaximumIndex[1] = j;
                            return localMaximumIndex;
                        }
                    } else
                        //check bottom right corner
                        if (j == matrix[i].length - 1) {
                            if (matrix[i][j] < matrix[i - 1][j]
                                    && matrix[i][j] < matrix[i - 1][j - 1]
                                    && matrix[i][j] < matrix[i][j - 1]) {
                                localMaximumIndex[0] = i;
                                localMaximumIndex[1] = j;
                                return localMaximumIndex;
                            }
                        } else {
                            //check bottom row without corners
                            if (matrix[i][j] < matrix[i][j - 1]
                                    && matrix[i][j] < matrix[i - 1][j - 1]
                                    && matrix[i][j] < matrix[i - 1][j]
                                    && matrix[i][j] < matrix[i - 1][j + 1]
                                    && matrix[i][j] < matrix[i][j + 1]) {
                                localMaximumIndex[0] = i;
                                localMaximumIndex[1] = j;
                                return localMaximumIndex;
                            }
                        }
                }
                //check left side without corners
                if (j == 0 && i != 0 && i != matrix.length - 1) {
                    if (matrix[i][j] < matrix[i - 1][j]
                            && matrix[i][j] < matrix[i - 1][j + 1]
                            && matrix[i][j] < matrix[i][j + 1]
                            && matrix[i][j] < matrix[i + 1][j + 1]
                            && matrix[i][j] < matrix[i + 1][j]) {
                        localMaximumIndex[0] = i;
                        localMaximumIndex[1] = j;
                        return localMaximumIndex;
                    }
                }
                //check right side without corners
                if (j == matrix[i].length - 1 && i != 0 && i != matrix.length - 1) {
                    if (matrix[i][j] < matrix[i - 1][j]
                            && matrix[i][j] < matrix[i - 1][j - 1]
                            && matrix[i][j] < matrix[i][j - 1]
                            && matrix[i][j] < matrix[i + 1][j - 1]
                            && matrix[i][j] < matrix[i + 1][j]) {
                        localMaximumIndex[0] = i;
                        localMaximumIndex[1] = j;
                        return localMaximumIndex;
                    }
                }
                //check the rest
                if (i != 0 && j != 0 && i != matrix.length - 1 && j != matrix[i].length - 1) {
                    if (matrix[i][j] < matrix[i - 1][j - 1]
                            && matrix[i][j] < matrix[i - 1][j]
                            && matrix[i][j] < matrix[i - 1][j + 1]
                            && matrix[i][j] < matrix[i][j + 1]
                            && matrix[i][j] < matrix[i + 1][j + 1]
                            && matrix[i][j] < matrix[i + 1][j]
                            && matrix[i][j] < matrix[i + 1][j - 1]
                            && matrix[i][j] < matrix[i][j - 1]) {
                        localMaximumIndex[0] = i;
                        localMaximumIndex[1] = j;
                        return localMaximumIndex;
                    }
                }
            }
        }
        return localMaximumIndex;
    }

    public static double[][] transpose(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                matrix[i][j] += matrix[j][i];
                matrix[j][i] = matrix[i][j] - matrix[j][i];
                matrix[i][j] = matrix[i][j] - matrix[j][i];
            }
        }
        return matrix;
    }
}
