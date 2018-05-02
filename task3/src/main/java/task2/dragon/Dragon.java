package task2.dragon;

public class Dragon {

    public static int howManyHeads(int age) {
        if (age < 200) {
            return age * 3;
        }
        if (age < 300) {
            return 600 + (age - 200) * 2;
        }
        return 800 + (age - 300);
    }
}
