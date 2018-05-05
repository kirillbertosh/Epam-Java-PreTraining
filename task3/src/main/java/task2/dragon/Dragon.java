package task2.dragon;

public class Dragon {

    public static final int DEFAULT_HEADS_COUNT = 3;
    public static final int HEADS_PER_YEAR = 3;
    public static final int TWO_HUNDRED_YEAR_HEADS_COUNT = 600;
    public static final int THREE_HUNDRED_YEAR_HEADS_COUNT = 800;
    public static final int MEDIUM_AGE = 200;
    public static final int OLD_AGE = 300;

    public static int getHeadsCount(int age) {

        if (age < MEDIUM_AGE) {
            return age * HEADS_PER_YEAR + DEFAULT_HEADS_COUNT;
        }
        if (age < OLD_AGE) {
            return TWO_HUNDRED_YEAR_HEADS_COUNT + (age - OLD_AGE) * (HEADS_PER_YEAR - 1);
        }
        return THREE_HUNDRED_YEAR_HEADS_COUNT + (age - OLD_AGE);
    }
}
