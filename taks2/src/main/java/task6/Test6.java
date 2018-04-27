package task6;

import task6.avegare.Average;

public class Test6 {

    public static void main(String[] args) throws Exception {
        int testNumber = 123456;
        System.out.println("Test number = " + testNumber);
        System.out.println("Average = " + Average.average(testNumber));
        System.out.println("Geometric = " + Average.geometric(testNumber));
    }
}
