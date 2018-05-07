package task1.randomizer;

public class Randomizer {

    public static final int ITERATION_COUNT = 1000;
    public static final int DIAPASON = 10;
    private static int headsCount = 0;
    private static int tailsCount = 0;
    private static boolean isCalculated = false;

    public static int getHeadsCount() {
        random();
        return headsCount;
    }

    public static int getTailsCount() {
        random();
        return tailsCount;
    }

    private static void random() {
        if (!isCalculated) {
            int i = 0;
            while (i < ITERATION_COUNT) {
                int result = (int) (Math.random() * DIAPASON);
                if (result < 5) {
                    headsCount++;
                } else {
                    tailsCount++;
                }
                i++;
            }
            isCalculated = true;
        }
    }

    public static void reset() {
        isCalculated = false;
    }
}
