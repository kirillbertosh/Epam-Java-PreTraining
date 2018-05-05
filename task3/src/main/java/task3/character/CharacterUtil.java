package task3.character;

public class CharacterUtil {

    public static final String VOWEL_STRING = "aeiouy";
    public static final char[] VOWELS = {'a', 'e', 'i', 'o', 'u', 'y'};;

    public static boolean isVowelWay1(char character) {
        return VOWEL_STRING.contains(Character.toString(character));
    }

    public static boolean isVowelWay2(char character) {
        switch (character) {
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
            case 'y' : return true;
        }
        return false;
    }

    public static boolean isVowelWay3(char character) {
        for (char vowel : VOWELS) {
            if (vowel == character) {
                return true;
            }
        }
        return false;
    }

    public static boolean isVowelWay4(char character) {
        int i = 0;
        do {
            if (character == VOWELS[i]) {
                return true;
            }
            i++;
        } while (i < VOWELS.length);
        return false;
    }
}
