package rocks.zipcode.io.quiz3.fundamentals;

import static rocks.zipcode.io.quiz3.fundamentals.VowelUtils.isVowel;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {
//        VowelUtils vowel = new VowelUtils();
        String[] strArray = str.split(" ");
        if (VowelUtils.startsWithVowel(str) == true) {
            return str + "way";
        }
        for (int i = 0; i < str.length(); i++) {
            if (isVowel(str.toCharArray()[i])) {

                return str.substring(i, str.length()) + str.substring(0, i) + "ay";
            }
        }
        return str + "ay";
    }
}
