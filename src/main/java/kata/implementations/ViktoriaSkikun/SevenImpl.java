package kata.implementations.ViktoriaSkikun;

import kata.Seven;

public class SevenImpl implements Seven {

    public long newAvg(double[] arr, double navg) {

        double temp = navg * (arr.length + 1);
        if (temp <= 0) {
            throw new IllegalArgumentException();
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] < 0) {
                throw new IllegalArgumentException();
            }
        }

        long nextDonation = (long) (temp - sum);
        return nextDonation;
    }

    public String seriesSum(int n) {
        double sum = 0;
        double denominator = 1;

        if (n == 0) {
            return String.valueOf(0.00);
        }

        for (int i = 0; i < n; i++) {
            sum += 1 / denominator;
            denominator += 3;
        }
        return String.format("%.2f", sum);
    }

    public int whereIsHe(int p, int bef, int aft) {

        int count = 0;

        for (int i = 0; i < p; i++) {
            if ((bef < i) && ((p - aft) <= i)) {
                count++;
            }
        }
        return count;
    }


}
