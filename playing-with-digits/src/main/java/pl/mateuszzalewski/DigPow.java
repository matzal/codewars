package pl.mateuszzalewski;

public class DigPow {
    public static long digPow(int n, int p) {
        int length = (int) (Math.log10(n) + 1);
        int tmp = n;
        int sum = 0;
        int currentPower;
        for (int i = 0; i < length; i++) {
            currentPower = (p + length - i - 1);
            sum = sum + (int) Math.pow(tmp % 10, currentPower);
            tmp /= 10;
        }
        return sum % n == 0 ? sum / n : -1;
    }
}
