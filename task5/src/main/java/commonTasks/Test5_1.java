package commonTasks;

import commonTasks.util.ArraysUtil;

public class Test5_1 {

    public static void main(String[] args) {
        double[] array = {2, 4.5, -0.67, 5.5, 2.1, 34, -9};
        double[] sortedArray = {1, 2, 3, 4.5, 6, 8};
        double[] descendingSortedArray = {8, 6, 4, 2, 1.1};
        System.out.println(ArraysUtil.getMax(array));
        System.out.println(ArraysUtil.getMin(array));
        System.out.println(ArraysUtil.getAverage(array));
        System.out.println(ArraysUtil.getGeometric(array));
        System.out.println(ArraysUtil.isAscendingOrderSorted(sortedArray));
        System.out.println(ArraysUtil.isAscendingOrderSorted(array));
        System.out.println(ArraysUtil.isDescendingOrderSorted(descendingSortedArray));
        System.out.println(ArraysUtil.getFirstLocalMaximumIndex(array));
        System.out.println(ArraysUtil.getFirstLocalMinimumIndex(array));
        array = ArraysUtil.reverse(array);
        for (double anArray : array) {
            System.out.println(anArray);
        }
    }
}
