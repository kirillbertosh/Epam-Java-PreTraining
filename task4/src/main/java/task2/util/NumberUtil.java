package task2.util;

import java.util.*;

public class NumberUtil {

    public static final String[] DIGITS = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

    public static boolean isNumberPalindrome(int number) {
        StringBuilder stringNumber = new StringBuilder(Integer.toString(number));
        stringNumber.reverse();
        return new Integer(stringNumber.toString()).equals(number);
    }

    public static boolean isNumberPrime(int number) {
        for (int i = 2; i < Math.ceil(Math.pow(number, 0.5)); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static List<Integer> getPrimeDividers(int number) {
        List<Integer> resultList = new ArrayList<>();
        int divider = 2;
        while (number != 1) {
            if (number % divider == 0) {
                number /= divider;
                resultList.add(divider);
            } else {
                divider++;
            }
        }
        return resultList;
    }

    public static int getDifferentNumberCount(int number) {
        int result = 0;
        String stringNumber = Integer.toString(number);
        for (String digit : DIGITS) {
            if (stringNumber.contains(digit)) {
                result++;
                stringNumber = stringNumber.replaceAll(digit, "");
            }
            if (Objects.equals(stringNumber, "")) {
                break;
            }
        }
        return result;
    }

    public static int getLargestDigitOfNumber(int number) {
        int result = 0;
        String stringNumber = Integer.toString(number);
        for (String digit : DIGITS) {
            if (stringNumber.contains(digit)) {
                result = Integer.valueOf(digit);
            }
        }
        return result;
    }

    public static int getGreatestCommonDivisor(int firstNumber, int secondNumber) {
        while (firstNumber != 0 && secondNumber != 0) {
            if (firstNumber > secondNumber) {
                firstNumber %= secondNumber;
            } else {
                secondNumber %= firstNumber;
            }
        }
        return firstNumber + secondNumber;
    }

    public static int getLeastCommonMultiple(int firstNumber, int secondNumber) {
        return firstNumber / getGreatestCommonDivisor(firstNumber, secondNumber) * secondNumber;
    }
}
