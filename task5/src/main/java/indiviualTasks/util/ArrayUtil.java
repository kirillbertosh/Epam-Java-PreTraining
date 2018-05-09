package indiviualTasks.util;

public class ArrayUtil {

    public static double getMaxElement(double[] array) {
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int getLastPositiveNumberIndex(double[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                index = i;
            }
        }
        return index;
    }

    public static double getSumOfElementsLocatedBeforeLastPositiveNumber(double[] array) {
        int index = getLastPositiveNumberIndex(array);
        double sum = 0;
        for (int i = 0; i < index; i++) {
            sum += array[i];
        }
        return sum;
    }
}
