package kata.implementations.AlonaLutsenko;

import kata.Seven;

public class SevenImplA implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        if (navg < 0) {
            throw new IllegalArgumentException();
        }
        double sum = 0;
        long result;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) throw new IllegalArgumentException();
            sum += arr[i];
        }
        result = (long) Math.ceil(navg * (arr.length + 1) - sum);
        if (result <= 0) {
            throw new IllegalArgumentException();
        }
        return result;
    }

    @Override
    public String seriesSum(int n) {
        double sum = 0;
        for (int i = 0; i < n; i++)
            sum += 1.0 / (1 + 3 * i);

        return String.format("%.2f", sum);
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        int result = 0;
        for (int i = 1; i <= p; i++) {
            if ((bef < i) && ((p - aft) <= i)) {
                result++;
            }
        }
        return result;
    }
}
