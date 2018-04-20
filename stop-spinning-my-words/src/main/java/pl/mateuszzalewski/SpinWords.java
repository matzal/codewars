package pl.mateuszzalewski;


import java.util.Arrays;
import java.util.stream.Collectors;

public class SpinWords {

    public String spinWords(String sentence) {
        return Arrays.stream(sentence.split(" "))
                .map(s -> s.length() > 4 ? new StringBuilder(s).reverse().toString() : s)
                .collect(Collectors.joining(" "));
    }
}
