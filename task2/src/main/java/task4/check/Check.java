package task4.check;

public class Check {

    public static boolean isAscendingSequence(int number) throws Exception {
        if (number < 1000) {
            throw new Exception("Number contains less than four digits");
        }
        if (number > 9999) {
            throw new Exception("Number contains more than four digits");
        }
        int result =  Integer.toString(number)
                .chars()
                .reduce((n1, n2) -> n1 < n2 ? n2 : -1)
                .orElse(-1);
        return result != -1;
    }

    public static boolean isDescendingSequence(int number) throws Exception {
        if (number < 1000) {
            throw new Exception("Number contains less than four digits");
        }
        if (number > 9999) {
            throw new Exception("Number contains more than four digits");
        }
        int result =  Integer.toString(number)
                .chars()
                .reduce((n1, n2) -> n1 > n2 ? n1 : -1)
                .orElse(-1);
        return result != -1;
    }
}
