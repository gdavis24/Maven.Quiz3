package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        return null;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        return null;
    }


    public static Boolean startsWithVowel(String word) {
        if (isVowel(word.charAt(0))){
            return true;
        }
        return false;
    }

    public static Boolean isVowel(Character character) {
        if (character == 'a' || character == 'A' || character == 'e' || character == 'E' || character == 'i' || character == 'I' ||
                character == 'o' || character == 'O' || character == 'U' || character == 'U'){
            return true;
        }
        return false;
    }
}
