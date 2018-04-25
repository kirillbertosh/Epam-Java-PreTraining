package taks1.Test;

public class Test {

    public static void testByte() {
        byte firstNumber = 60;
        byte secondNumber = 3;
        byte result = 0;

        System.out.println("Testing byte");

        System.out.println("firstNumber = " + firstNumber);
        System.out.println("secondNumber = " + secondNumber);
        System.out.println("result = " + result);

        System.out.println("firstNumber++" + firstNumber++);
        System.out.println("++firstNumber" + ++firstNumber);

        System.out.println("firstNumber--" + firstNumber--);
        System.out.println("--firstNumber" + --firstNumber);

        result = (byte)(firstNumber + secondNumber);
        System.out.println("(byte)(firstNumber + secondNumber) = " + result);

        result = (byte)(firstNumber / secondNumber);
        System.out.println("(byte)(firstNumber / secondNumber) = " + result);

        result = (byte)(firstNumber - secondNumber);
        System.out.println("(byte)(firstNumber - secondNumber) = " + result);

        result = (byte)(firstNumber * secondNumber);
        System.out.println("(byte)(firstNumber * secondNumber) = " + result);

        result = (byte)(firstNumber % secondNumber);
        System.out.println("(byte)(firstNumber % secondNumber) = " + result);

        result += firstNumber;
        System.out.println("result += firstNumber = " + result);

        result -= firstNumber;
        System.out.println("result -= firstNumber = " + result);

        result *= firstNumber;
        System.out.println("result *= firstNumber = " + result);

        result /= firstNumber;
        System.out.println("result /= firstNumber = " + result);

        result %= firstNumber;
        System.out.println("result %= firstNumber = " + result);

        result = (byte)(firstNumber << 2);
        System.out.println("(byte)(firstNumber << 2) = " + result);

        result = (byte)(firstNumber >>> 2);
        System.out.println("(byte)(firstNumber >>> 2) = " + result);

        result = (byte)(firstNumber >> 2);
        System.out.println("(byte)(firstNumber >> 2) = " + result);

        result = (byte)~firstNumber;
        System.out.println("(byte)~firstNumber = " + result);

        result = (byte)(firstNumber | secondNumber);
        System.out.println("(byte)(firstNumber | secondNumber) = " + result);

        result = (byte)(firstNumber & secondNumber);
        System.out.println("(byte)(firstNumber & secondNumber) = " + result);

        result = (byte)(firstNumber ^ secondNumber);
        System.out.println("(byte)(firstNumber ^ secondNumber) = " + result);
    }

    public static void testShort() {
        short firstNumber = 60;
        short secondNumber = 3;
        short result = 0;

        System.out.println("Testing short");

        System.out.println("firstNumber = " + firstNumber);
        System.out.println("secondNumber = " + secondNumber);
        System.out.println("result = " + result);

        System.out.println("firstNumber++" + firstNumber++);
        System.out.println("++firstNumber" + ++firstNumber);

        System.out.println("firstNumber--" + firstNumber--);
        System.out.println("--firstNumber" + --firstNumber);

        result = (short)(firstNumber + secondNumber);
        System.out.println("(short)(firstNumber + secondNumber) = " + result);

        result = (short)(firstNumber / secondNumber);
        System.out.println("(short)(firstNumber / secondNumber) = " + result);

        result = (short)(firstNumber - secondNumber);
        System.out.println("(short)(firstNumber - secondNumber) = " + result);

        result = (short)(firstNumber * secondNumber);
        System.out.println("(short)(firstNumber * secondNumber) = " + result);

        result = (short)(firstNumber % secondNumber);
        System.out.println("(short)(firstNumber % secondNumber) = " + result);

        result += firstNumber;
        System.out.println("result += firstNumber = " + result);

        result -= firstNumber;
        System.out.println("result -= firstNumber = " + result);

        result *= firstNumber;
        System.out.println("result *= firstNumber = " + result);

        result /= firstNumber;
        System.out.println("result /= firstNumber = " + result);

        result %= firstNumber;
        System.out.println("result %= firstNumber = " + result);

        result = (short)(firstNumber << 2);
        System.out.println("(short)(firstNumber << 2) = " + result);

        result = (short)(firstNumber >>> 2);
        System.out.println("(short)(firstNumber >>> 2) = " + result);

        result = (short)(firstNumber >> 2);
        System.out.println("(short)(firstNumber >> 2) = " + result);

        result = (short)(firstNumber | secondNumber);
        System.out.println("(short)(firstNumber | secondNumber) = " + result);

        result = (short)(firstNumber & secondNumber);
        System.out.println("(short)(firstNumber & secondNumber) = " + result);

        result = (short)(firstNumber ^ secondNumber);
        System.out.println("(short)(firstNumber ^ secondNumber) = " + result);
    }

    public static void testChar() {
        char firstChar = 'a';
        char secondChar = 'b';
        char result;

        System.out.println("Testing char");

        System.out.println("firstChar = " + firstChar);
        System.out.println("secondChar = " + secondChar);

        System.out.println("firstChar++ = " + firstChar++);
        System.out.println("++firstChar = " + ++firstChar);

        System.out.println("firstChar-- = " + firstChar--);
        System.out.println("--firstChar = " + --firstChar);

        result = (char)(firstChar + secondChar);
        System.out.println("(char)(firstChar + secondChar) = " + result);

        result = (char)(firstChar - secondChar);
        System.out.println("(char)(firstChar - secondChar) = " + result);

        result = (char)(firstChar * secondChar);
        System.out.println("(char)(firstChar * secondChar) = " + result);

        result = (char)(firstChar / secondChar);
        System.out.println("(char)(firstChar / secondChar) = " + result);

        result = (char)(firstChar % secondChar);
        System.out.println("(char)(firstChar % secondChar) = " + result);

        result += firstChar;
        System.out.println("result += firstChar = " + result);

        result -= firstChar;
        System.out.println("result -= firstChar = " + result);

        result *= firstChar;
        System.out.println("result *= firstChar = " + result);

        result /= firstChar;
        System.out.println("result /= firstChar = " + result);

        result %= firstChar;
        System.out.println("result %= firstChar = " + result);

        result = (char)(secondChar << 2);
        System.out.println("(char)(secondChar << 2) = " + result);

        result = (char)(secondChar >> 2);
        System.out.println("(char)(secondChar >> 2) = " + result);

        result = (char)(secondChar >>> 2);
        System.out.println("(char)(secondChar >>> 2) = " + result);

        result = (char)(firstChar ^ secondChar);
        System.out.println("(char)(firstChar ^ secondChar) = " + result);

        result = (char)(firstChar | secondChar);
        System.out.println("(char)(firstChar | secondChar) = " + result);

        result = (char)(firstChar & secondChar);
        System.out.println("(char)(firstChar & secondChar) = " + result);

        result |= firstChar;
        System.out.println("result |= firstChar = " + result);

        result &= firstChar;
        System.out.println("result &= firstChar = " + result);

        result ^= firstChar;
        System.out.println("result ^= firstChar = " + result);
    }

    public static void testInteger() {
        int firstNumber = 146;
        int secondNumber = 31;
        int result = 0;

        System.out.println("Testing integer");

        System.out.println("firstNumber++" + firstNumber++);
        System.out.println("++firstNumber" + ++firstNumber);

        System.out.println("firstNumber--" + firstNumber--);
        System.out.println("--firstNumber" + --firstNumber);

        System.out.printf("%d + %d = %d\n", firstNumber, secondNumber, firstNumber + secondNumber);

        System.out.printf("%d - %d = %d\n", firstNumber, secondNumber, firstNumber - secondNumber);

        System.out.printf("%d * %d = %d\n", firstNumber, secondNumber, firstNumber * secondNumber);

        System.out.printf("%d / %d = %d\n", firstNumber, secondNumber, firstNumber / secondNumber);

        System.out.printf("%d %% %d = %d\n", firstNumber, secondNumber, firstNumber % secondNumber);

        result += firstNumber;
        System.out.println("result += firstNumber = " + result);

        result -= firstNumber;
        System.out.println("result -= firstNumber = " + result);

        result *= firstNumber;
        System.out.println("result *= firstNumber = " + result);

        result /= firstNumber;
        System.out.println("result /= firstNumber = " + result);

        result %= firstNumber;
        System.out.println("result %= firstNumber = " + result);

        result = ~firstNumber;
        System.out.printf("%s = ~%s\n", Integer.toBinaryString(result), Integer.toBinaryString(firstNumber));

        result = firstNumber & secondNumber;
        System.out.printf("%s & %s = %s\n",
                Integer.toBinaryString(result), Integer.toBinaryString(firstNumber), Integer.toBinaryString(secondNumber));

        result = firstNumber ^ secondNumber;
        System.out.printf("%s ^ %s = %s\n",
                Integer.toBinaryString(result), Integer.toBinaryString(firstNumber), Integer.toBinaryString(secondNumber));

        result = firstNumber | secondNumber;
        System.out.printf("%s | %s = %s\n",
                Integer.toBinaryString(result), Integer.toBinaryString(firstNumber), Integer.toBinaryString(secondNumber));

        result = firstNumber << 2;
        System.out.printf("%s << 2 = %s\n", Integer.toBinaryString(firstNumber), Integer.toBinaryString(result));

        result = secondNumber >> 2;
        System.out.printf("%s >> 2 = %s\n", Integer.toBinaryString(secondNumber), Integer.toBinaryString(result));

        result = secondNumber >>> 2;
        System.out.printf("%s >>> 2 = %s\n", Integer.toBinaryString(secondNumber), Integer.toBinaryString(result));
    }

    public static void testLong() {
        long firstNumber = 146;
        long secondNumber = 31;
        long result = 0;

        System.out.println("Testing long");

        System.out.println("firstNumber++" + firstNumber++);
        System.out.println("++firstNumber" + ++firstNumber);

        System.out.println("firstNumber--" + firstNumber--);
        System.out.println("--firstNumber" + --firstNumber);

        System.out.printf("%d + %d = %d\n", firstNumber, secondNumber, firstNumber + secondNumber);

        System.out.printf("%d - %d = %d\n", firstNumber, secondNumber, firstNumber - secondNumber);

        System.out.printf("%d * %d = %d\n", firstNumber, secondNumber, firstNumber * secondNumber);

        System.out.printf("%d / %d = %d\n", firstNumber, secondNumber, firstNumber / secondNumber);

        System.out.printf("%d %% %d = %d\n", firstNumber, secondNumber, firstNumber % secondNumber);

        result += firstNumber;
        System.out.println("result += firstNumber = " + result);

        result -= firstNumber;
        System.out.println("result -= firstNumber = " + result);

        result *= firstNumber;
        System.out.println("result *= firstNumber = " + result);

        result /= firstNumber;
        System.out.println("result /= firstNumber = " + result);

        result %= firstNumber;
        System.out.println("result %= firstNumber = " + result);

        result = ~firstNumber;
        System.out.printf("%s = ~%s\n", Long.toBinaryString(result), Long.toBinaryString(firstNumber));

        result = firstNumber & secondNumber;
        System.out.printf("%s & %s = %s\n",
                Long.toBinaryString(result), Long.toBinaryString(firstNumber), Long.toBinaryString(secondNumber));

        result = firstNumber ^ secondNumber;
        System.out.printf("%s ^ %s = %s\n",
                Long.toBinaryString(result), Long.toBinaryString(firstNumber), Long.toBinaryString(secondNumber));

        result = firstNumber | secondNumber;
        System.out.printf("%s | %s = %s\n",
                Long.toBinaryString(result), Long.toBinaryString(firstNumber), Long.toBinaryString(secondNumber));

        result = firstNumber << 2;
        System.out.printf("%s << 2 = %s\n", Long.toBinaryString(firstNumber), Long.toBinaryString(result));

        result = secondNumber >> 2;
        System.out.printf("%s >> 2 = %s\n", Long.toBinaryString(firstNumber), Long.toBinaryString(result));

        result = secondNumber >>> 2;
        System.out.printf("%s >>> 2 = %s\n", Long.toBinaryString(firstNumber), Long.toBinaryString(result));
    }

    public static void testFloat() {
        float firstNumber = 60.5f;
        float secondNumber = 3.4f;
        float result = 0.f;

        System.out.println("Testing float");

        System.out.println("firstNumber = " + firstNumber);
        System.out.println("secondNumber = " + secondNumber);
        System.out.println("result = " + result);

        System.out.println("firstNumber++" + firstNumber++);
        System.out.println("++firstNumber" + ++firstNumber);

        System.out.println("firstNumber--" + firstNumber--);
        System.out.println("--firstNumber" + --firstNumber);

        result = firstNumber + secondNumber;
        System.out.println("firstNumber + secondNumber = " + result);

        result = firstNumber / secondNumber;
        System.out.println("firstNumber / secondNumber = " + result);

        result = firstNumber - secondNumber;
        System.out.println("firstNumber - secondNumber = " + result);

        result = firstNumber * secondNumber;
        System.out.println("firstNumber * secondNumber = " + result);

        result = firstNumber % secondNumber;
        System.out.println("firstNumber % secondNumber = " + result);

        result += firstNumber;
        System.out.println("result += firstNumber = " + result);

        result -= firstNumber;
        System.out.println("result -= firstNumber = " + result);

        result *= firstNumber;
        System.out.println("result *= firstNumber = " + result);

        result /= firstNumber;
        System.out.println("result /= firstNumber = " + result);

        result %= firstNumber;
        System.out.println("result %= firstNumber = " + result);
    }

    public static void testDouble() {
        double firstNumber = 60.7;
        double secondNumber = 14.88;
        double result = 0.f;

        System.out.println("Testing double");

        System.out.println("firstNumber = " + firstNumber);
        System.out.println("secondNumber = " + secondNumber);
        System.out.println("result = " + result);

        System.out.println("firstNumber++" + firstNumber++);
        System.out.println("++firstNumber" + ++firstNumber);

        System.out.println("firstNumber--" + firstNumber--);
        System.out.println("--firstNumber" + --firstNumber);

        result = firstNumber + secondNumber;
        System.out.println("firstNumber + secondNumber = " + result);

        result = firstNumber / secondNumber;
        System.out.println("firstNumber / secondNumber = " + result);

        result = firstNumber - secondNumber;
        System.out.println("firstNumber - secondNumber = " + result);

        result = firstNumber * secondNumber;
        System.out.println("firstNumber * secondNumber = " + result);

        result = firstNumber % secondNumber;
        System.out.println("firstNumber % secondNumber = " + result);

        result += firstNumber;
        System.out.println("result += firstNumber = " + result);

        result -= firstNumber;
        System.out.println("result -= firstNumber = " + result);

        result *= firstNumber;
        System.out.println("result *= firstNumber = " + result);

        result /= firstNumber;
        System.out.println("result /= firstNumber = " + result);

        result %= firstNumber;
        System.out.println("result %= firstNumber = " + result);
    }

    public static void testBoolean() {
        boolean firstValue = false;
        boolean secondValue = true;
        boolean thirdValue;

        System.out.println("Testing boolean");

        System.out.println("First value = " + firstValue);
        System.out.println("Second value = " + secondValue);

        System.out.println("thirdValue = firstValue = " + (thirdValue = !firstValue));

        System.out.println("!thirdValue = " + !thirdValue);

        System.out.println("thirdValue != firstValue = " + (thirdValue != firstValue));

        System.out.println("firstValue | secondValue = " + (firstValue | secondValue));

        System.out.println("firstValue |= secondValue = " + (firstValue |= secondValue));

        System.out.println("firstValue || secondValue = " + (firstValue || secondValue));

        System.out.println("firstValue ^ secondValue = " + (firstValue ^ secondValue));

        System.out.println("firstValue ^= secondValue = " + (firstValue ^= secondValue));

        System.out.println("firstValue & secondValue = " + (firstValue & secondValue));

        System.out.println("firstValue &= secondValue = " + (firstValue &= secondValue));

        System.out.println("firstValue && secondValue = " + (firstValue && secondValue));

        System.out.println("firstValue = secondValue " + (firstValue = secondValue));

        System.out.println("thirdValue ? firstValue : secondValue " + (thirdValue ? firstValue : secondValue));

    }

}
