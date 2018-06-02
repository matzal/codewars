package pl.mateuszzalewski;

import java.util.Arrays;

public class MiddlePermutation {

    public static String findMidPerm(String strng) {
        char[] chars = strng.toCharArray();
        Arrays.sort(chars);
        int length = strng.length();
        int middle = (length - 1) / 2;
        String remainder = new StringBuilder()
                .append(chars)
                .deleteCharAt(middle)
                .toString();
        if (length % 2 == 0) {
            return new StringBuilder()
                    .append(remainder)
                    .append(chars[middle])
                    .reverse()
                    .toString();
        } else {
            return chars[middle] + findMidPerm(remainder);
        }
    }
}
