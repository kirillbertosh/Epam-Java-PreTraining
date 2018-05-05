package task5;

import task5.arithmetics.Arithmetic;

public class Test5 {

    public static void main(String[] args) throws Exception {
        int testNumber = 12345;
        System.out.println("Test number = " + testNumber);
        System.out.println("Sum of digits = " + Arithmetic.countFiveDigitNumberSumOfDigits(testNumber));
        System.out.println("Product of digits = " + Arithmetic.countFiveDigitNUmberProductOfDigits(testNumber));
    }
}
