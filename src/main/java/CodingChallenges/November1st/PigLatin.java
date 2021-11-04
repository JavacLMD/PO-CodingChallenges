package CodingChallenges.November1st;

import java.util.Scanner;

public class PigLatin {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String pig = sc.nextLine();
        System.out.println("Pig Latin: " + piglatin(pig));
    }


    static String piglatin(String text) {

        StringBuilder sb = new StringBuilder();

        String[] array = text.split(" ");
        for (int i = 0; i < array.length; i++) {
            array[i] = convert(array[i]);

            sb.append(array[i]);
            if (i < array.length - 1)
                sb.append(" ");
        }

        return sb.toString();

    }

    static String convert(String text) {

        int length = text.length();

        char firstLetter = text.substring(0, 1).charAt(0);
        boolean isUpperCased = Character.isUpperCase(firstLetter);
        boolean isVowel = isVowel(firstLetter);
        char punctuation = text.charAt(length - 1);
        boolean hasPunctuation = false;

        if ((int) punctuation < 65) {
            hasPunctuation = true;
            text = text.substring(0, length - 1);
            length = text.length();
        }

        firstLetter = Character.toLowerCase(firstLetter);

        text = text.substring(1, length) + firstLetter + (isVowel ? "way" : "ay") + (hasPunctuation ? punctuation : "");
        String output = text;
        if (isUpperCased) {
            output = text.substring(0, 1).toUpperCase() + text.substring(1);
        }

        return output;
    }



    static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }

}
