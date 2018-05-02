package task4.mood;

public class Mood {

    private static String smile = ":)";
    private static String sad = ":(";
    private static String normal = ":|";
    private static String wink = ";)";

    public static String getMood() {
        int mood = (int)(Math.random() * 4);
        switch (mood) {
            case 0 : return smile;
            case 1 : return sad;
            case 2 : return normal;
        }
        return wink;
    }
}
