package task4;

import task4.check.Check;

public class Test4 {

    public static void main(String[] args) throws Exception {
        int firstTestNumber = 1234;
        int secondTestNumber = 9876;
        System.out.println("First test number = " + firstTestNumber);
        System.out.println("Second test number = " + secondTestNumber);

        System.out.println("Is first number ascending sequence " + Check.isFourDigitNumberAscendingSequence(firstTestNumber));
        System.out.println("Is second number ascending sequence " + Check.isFourDigitNumberAscendingSequence(secondTestNumber));

        System.out.println("Is first number descending sequence " + Check.isFourDigitNumberDescendingSequence(firstTestNumber));
        System.out.println("Is second number descending sequence " + Check.isFourDigitNumberDescendingSequence(secondTestNumber));
    }
}
