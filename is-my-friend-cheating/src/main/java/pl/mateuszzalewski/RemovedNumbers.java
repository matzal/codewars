package pl.mateuszzalewski;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.LongStream;

public class RemovedNumbers {
    public static List<long[]> removNb(long n) {
        long sum = LongStream.range(1, (n + 1)).sum();
        List<long[]> pairsOfNumbers = new ArrayList<>();
        for (long a = 1; a < n + 1; a++) {
            long b = (sum - a) / (a + 1);
            if ((a * b + a + b) == sum && b < n) {
                pairsOfNumbers.add(new long[]{a, b});
            }
        }
        return pairsOfNumbers.isEmpty() ? Collections.emptyList() : pairsOfNumbers;
    }
}
