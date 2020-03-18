package rocks.zipcode.io.quiz3.arrays;

import java.util.stream.Stream;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
//        String[] result = new String[0];
//
//        String waveString = str.toLowerCase();
//        for (int i = 0; i < waveString.length(); i++) {
//            String newString = waveString.substring(0, i) + waveString.toUpperCase().charAt(i) + waveString.substring(i + 1, waveString.length());
//            System.out.println(newString);
//            String[] second = newString.split(" ");
//            result = newString.split(" ");
//            result[i] = newString;
//        }

        int count = 0;
        for (char c : str.toCharArray()) {
            Character ca = c;
            if (Character.isAlphabetic(ca)) {
                count++;
            }
        }
        String[] capped = new String[count];
        for (int i = 0; i < count; i++) {
            String toAdd = "";
            int index = 0;
            for (char c : str.toCharArray()) {
                Character ca = c;
                if (Character.isAlphabetic(ca)) {
                    if (index == i) {
                        toAdd += Character.toUpperCase(ca);
                    } else {
                        toAdd += Character.toLowerCase(ca);
                    }
                    index++;
                } else {
                    toAdd += ca;
                }
            }
            capped[i] = toAdd;
        }
        return capped;
    }
}
