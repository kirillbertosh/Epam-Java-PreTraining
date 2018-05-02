package task3;

import task3.character.CharacterUtil;

import java.util.Scanner;

public class Test3_3 {

    public static void main(String[] args) {
        System.out.println("Enter character");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println("Is vowel by first way: " + CharacterUtil.isVowelWay1(line.charAt(0)));
        System.out.println("Is vowel by second way: " + CharacterUtil.isVowelWay2(line.charAt(0)));
        System.out.println("Is vowel by third way: " + CharacterUtil.isVowelWay3(line.charAt(0)));
        System.out.println("Is vowel by fourth way: " + CharacterUtil.isVowelWay4(line.charAt(0)));
        scanner.close();
    }
}
