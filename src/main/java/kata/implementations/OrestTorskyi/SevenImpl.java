package kata.implementations.OrestTorskyi;

import kata.Seven;

public class SevenImpl implements Seven {


    public long newAvg(double[] arr, double navg) {
        double nextDonation = navg * (arr.length + 1);

        for (int i = 0; i < arr.length; i++) {
            nextDonation -= arr[i];
        }
        if (nextDonation <= 0) {
            throw new IllegalArgumentException("Value too big (" + navg + ")");
        }
        return (long) Math.ceil(nextDonation);
    }

    public String seriesSum(int n) {
        double sum = 0;
        double following = 1;
        for (int i = 0; i < n; i++) {
            sum += 1 / following;
            following += 3;
        }
        return String.format("%.2f", sum);
    }

    public int whereIsHe(int p, int bef, int aft) {
        int count = 0;
        while (bef >= 0 && aft <= (p - 1)) {
            if (bef + aft > (p - 1)) {
                bef--;
            } else if (bef + aft < (p - 1)) {
                aft++;
            } else {
                count++;
                bef--;
                aft++;
            }
        }
        return count;
    }



}
