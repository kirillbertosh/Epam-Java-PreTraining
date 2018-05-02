package task2.dragon;

public class Dragon {

    public static int getHeadsCount(int age) {
        int defaultHeadsCount = 3;
        if (age < 200) {
            return age * 3 + defaultHeadsCount;
        }
        if (age < 300) {
            return 600 + (age - 200) * 2;
        }
        return 800 + (age - 300);
    }
}
