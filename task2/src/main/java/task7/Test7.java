package task7;

import task7.reverse.ReverseNumber;

public class Test7 {

    public static void main(String[] args) throws Exception {
        int number = 1234567;
        System.out.println("Number = " + number);
        System.out.println("Reverse number = " + ReverseNumber.reverseSevenDigitNumber(number));
    }
}
