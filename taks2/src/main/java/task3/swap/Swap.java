package task3.swap;

public class Swap {

    public static int[] swap(int firstNumber, int secondNumber) {
        firstNumber += secondNumber;
        secondNumber = firstNumber - secondNumber;
        firstNumber = firstNumber - secondNumber;
        int[] result = new int[2];
        result[0] = firstNumber;
        result[1] =  secondNumber;
        return result;
    }
}
