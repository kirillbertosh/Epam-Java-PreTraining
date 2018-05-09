package indiviualTasks;

import indiviualTasks.util.ArrayUtil;

public class Test5_2_1 {

    public static void main(String[] args) {
        double[] array = {2, 4.5, -0.67, 5.5, 2.1, 34, -9, -8.88};
        System.out.println(ArrayUtil.getMaxElement(array));
        System.out.println(ArrayUtil.getLastPositiveNumberIndex(array));
        System.out.println(ArrayUtil.getSumOfElementsLocatedBeforeLastPositiveNumber(array));
    }
}
