package task4.mood;

public class Mood {

    public static final String SMILE = ":)";
    public static final String SAD = ":(";
    public static final String NORMAL = ":|";
    public static final String WINK = ";)";

    public static String getMood() {
        int mood = (int)(Math.random() * 4);
        switch (mood) {
            case 0 : return SMILE;
            case 1 : return SAD;
            case 2 : return NORMAL;
        }
        return WINK;
    }
}
