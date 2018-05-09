package commonTasks.util;

public class ArraysUtil {

    public static double getMax(double[] array) {
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static double getMin(double[] array) {
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static double getAverage(double[] array) {
        double sum = 0;
        for (double element : array) {
            sum += element;
        }
        return (sum / array.length);
    }

    public static double getGeometric(double[] array) {
        double product = 1;
        for (double element : array) {
            product *= element;
        }
        return Math.pow(product, (1 / array.length));
    }

    public static boolean isAscendingOrderSorted(double[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isDescendingOrderSorted(double[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static int getFirstLocalMaximumIndex(double[] array) {
        int index = -1;
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static int getFirstLocalMinimumIndex(double[] array) {
        int index = -1;
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] < array[i - 1] && array[i] < array[i + 1]) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static double[] reverse(double[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            array[i] += array[array.length - 1 - i];
            array[array.length - 1 - i] = array[i] - array[array.length - 1 - i];
            array[i] = array[i] - array[array.length - 1 - i];
        }
        return array;
    }
}
