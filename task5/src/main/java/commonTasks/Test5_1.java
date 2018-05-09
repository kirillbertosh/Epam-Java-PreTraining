package commonTasks;

import commonTasks.util.ArraysUtil;

public class Test5_1 {

    public static void main(String[] args) {
        double[] array = {2, 4.5, -0.67, 5.5, 2.1, 34, -9};
        System.out.println(ArraysUtil.getMax(array));
        System.out.println(ArraysUtil.getMin(array));
        System.out.println(ArraysUtil.getAverage(array));
        System.out.println(ArraysUtil.getGeometric(array));
    }
}
