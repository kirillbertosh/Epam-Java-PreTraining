package task3.character;

public class CharacterUtil {

    public static boolean isVowelWay1(char character) {
        String vowelString = "aeiouy";
        return vowelString.contains(Character.toString(character));
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
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};
        for (char vowel : vowels) {
            if (vowel == character) {
                return true;
            }
        }
        return false;
    }

    public static boolean isVowelWay4(char character) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};
        int i = 0;
        do {
            if (character == vowels[i]) {
                return true;
            }
            i++;
        } while (i < vowels.length);
        return false;
    }
}
