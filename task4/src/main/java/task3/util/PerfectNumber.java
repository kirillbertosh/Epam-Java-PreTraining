package task3.util;

public class PerfectNumber {

    public static boolean isNumberPerfect(int number) {
        int dividersSum = 0;
        if (number % 2 != 0) {
            return false;
        }
        for (int divider = 1; divider <= number / 2; divider++) {
            if (number % divider == 0) {
                dividersSum += divider;
            }
        }
        return dividersSum == number;
    }
}
