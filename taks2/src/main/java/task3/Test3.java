package task3;

import task3.swap.Swap;

public class Test3 {

    public static void main(String[] args) {
        int firstNumber = 2;
        int secondNumber = 3;

        System.out.println("firstNumber = " + firstNumber);
        System.out.println("secondNumber = " + secondNumber);

        int[] result = Swap.swap(firstNumber, secondNumber);

        System.out.println("firstNumber = " + result[0]);
        System.out.println("secondNumber = " + result[1]);
    }
}
