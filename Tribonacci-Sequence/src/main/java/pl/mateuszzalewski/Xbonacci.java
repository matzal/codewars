package pl.mateuszzalewski;

import java.util.Arrays;

public class Xbonacci {
    public double[] tribonacci(double[] s, int n) {
        double[] outputArray = Arrays.copyOf(s, n);
        for(int i = 3; i < n; i++){
            outputArray[i] = outputArray[i-1] + outputArray[i-2] + outputArray[i-3];
        }
        return outputArray;
    }
}
