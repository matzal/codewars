package pl.mateuszzalewski;

import java.util.ArrayList;
import java.util.List;

public class CaesarCipher {


    public static List<String> movingShift(String s, int shift) {
        StringBuilder stringBuilder = new StringBuilder();
        List<String> outputList = new ArrayList<>();
        char[] charsArray = s.toCharArray();
        int substringLength = s.length() % 5 == 0 ? s.length() / 5 : (s.length() / 5 + 1);
        for (int i = 0; i < s.length(); i++) {
            int code = Character.codePointAt(charsArray, i);
            code = getCodeAfterShift(code, shift, i);
            stringBuilder.appendCodePoint(code);
            if ((i + 1) % substringLength == 0) {
                outputList.add(stringBuilder.toString());
                stringBuilder.setLength(0);
            }
        }
        if (outputList.size() < 5){
            outputList.add(stringBuilder.toString());
        }
        return outputList;
    }

    private static int getCodeAfterShift(int code, int shift, int indexOfChar) {
        int finalShift;
        if (code > 96 && code < 123) {
            finalShift = (code - 97 + indexOfChar + shift) % 26;
            code = finalShift >= 0 ? (97 + finalShift) : (123 + finalShift);
        } else if (code > 64 && code < 91) {
            finalShift = (code - 65 + indexOfChar + shift) % 26;
            code = finalShift >= 0 ? (65 + finalShift) : (91 + finalShift);
        }
        return code;
    }

    public static String demovingShift(List<String> s, int shift) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            stringBuilder.append(s.get(i));
        }
        String textToDecipher = stringBuilder.toString();
        stringBuilder.setLength(0);
        char[] charsArray = textToDecipher.toCharArray();
        for (int i = 0; i < textToDecipher.length(); i++) {
            int code = Character.codePointAt(charsArray, i);
            code = getCodeAfterShift(code, -shift, -i);
            stringBuilder.appendCodePoint(code);
        }
        textToDecipher = stringBuilder.toString();
        return textToDecipher;
    }
}