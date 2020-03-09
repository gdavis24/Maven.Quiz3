package rocks.zipcode.io.quiz3.arrays;

import java.util.stream.Stream;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        String[] result = new String[0];

        String waveString = str.toLowerCase();
        for (int i = 0; i < waveString.length(); i++) {
            String newString = waveString.substring(0, i) + waveString.toUpperCase().charAt(i) + waveString.substring(i + 1, waveString.length());
            System.out.println(newString);
            String[] second = newString.split(" ");
            result = newString.split(" ");
        }
        return result;
    }
}
