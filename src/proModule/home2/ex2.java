package proModule.home2;

import java.util.Arrays;

public class ex2 {
    public boolean Anagram(String x, String y) {

        char[] xChars = x.toCharArray();
        char[] yChars = y.toCharArray();

        Arrays.sort(xChars);
        Arrays.sort(yChars);

        return Arrays.equals(xChars, yChars);
    }
}
