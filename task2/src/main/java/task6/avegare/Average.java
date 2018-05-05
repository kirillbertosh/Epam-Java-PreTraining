package task6.avegare;

public class Average {

    public static double getSixDigitNumberAverage(int number) throws Exception {
        if (number < 100000) {
            throw new Exception("Number contains less than five digits");
        }
        if (number > 999999) {
            throw new Exception("Number contains more than five digits");
        }
        return Integer.toString(number)
                .chars()
                .map(c -> Character.digit(c, 10))
                .average()
                .orElse(0);
    }

    public static double getSixDigitNumberGeometric(int number) throws Exception {
        if (number < 100000) {
            throw new Exception("Number contains less than six digits");
        }
        if (number > 999999) {
            throw new Exception("Number contains more than six digits");
        }
        int productOfDigits = Integer.toString(number)
                .chars()
                .map(c -> Character.digit(c, 10))
                .reduce((n1, n2) -> n1 * n2)
                .orElse(0);
        return Math.pow(productOfDigits, 1.0 / 6);
    }
}
