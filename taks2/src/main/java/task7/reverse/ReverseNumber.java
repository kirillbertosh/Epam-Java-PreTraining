package task7.reverse;

public class ReverseNumber {

    public static int reverseSevenDigitNumber(int number) throws Exception {
        if (number < 1_000_000) {
            throw new Exception("Number contains less than seven digits");
        }
        if (number > 9_999_999) {
            throw new Exception("Number contains more than seven digits");
        }
        StringBuilder tempString = new StringBuilder(Integer.toString(number));
        tempString.reverse();
        return new Integer(tempString.toString());
    }
}
