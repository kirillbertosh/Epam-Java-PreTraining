package task5.arithmetics;

public class Arithmetic {

    public static int countFiveDigitNumberSumOfDigits(int number) throws Exception {
        if (number < 10000) {
            throw new Exception("Number contains less than five digits");
        }
        if (number > 99999) {
            throw new Exception("Number contains more than five digits");
        }
        return Integer.toString(number).chars().map(c -> Character.digit(c, 10)).sum();
    }

    public static int countFiveDigitNUmberProductOfDigits(int number) throws Exception {
        if (number < 10000) {
            throw new Exception("Number contains less than five digits");
        }
        if (number > 99999) {
            throw new Exception("Number contains more than five digits");
        }
        return Integer.toString(number)
                .chars()
                .map(c -> Character.digit(c, 10))
                .reduce((n1, n2) -> n1 * n2)
                .orElse(0);
    }
}
