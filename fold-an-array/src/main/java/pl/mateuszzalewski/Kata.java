package pl.mateuszzalewski;

import java.util.Arrays;

public class Kata {
    public static int[] foldArray(int[] array, int runs) {
        int arrayLength = array.length;
        int[] outputArray = Arrays.copyOf(array, arrayLength);
        for (int run = 0; run < runs; run++) {
            for (int arrayElement = 0; arrayElement < countTo(arrayLength); arrayElement++) {
                outputArray[arrayElement] = outputArray[arrayElement] + outputArray[arrayLength - 1 - arrayElement];
            }
            arrayLength = nextArrayLength(arrayLength);
        }
        return Arrays.copyOf(outputArray, arrayLength);
    }

    private static int countTo(int length) {
        return length % 2 == 0 ? length / 2 : (length - 1) / 2;
    }

    private static int nextArrayLength(int length) {
        return length % 2 == 0 ? length / 2 : (length + 1) / 2;
    }
}