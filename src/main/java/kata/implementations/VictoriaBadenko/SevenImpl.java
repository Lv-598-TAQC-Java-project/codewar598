package kata.implementations.VictoriaBadenko;

import kata.Seven;

import java.util.stream.DoubleStream;

public class SevenImpl implements Seven {

    public long newAvg(double[] arr, double navg) {
        double donat = navg * (arr.length + 1) - DoubleStream.of(arr).sum();
        if (donat < 0) {
            throw new IllegalArgumentException("Expected New Average is too low");
        }
        return (long) (Math.ceil(donat));
    }

    public String seriesSum(int n) {
        double sum = 0.0;
        for (int i = 0; i < n; i++)
            sum += 1.0 / (1 + 3 * i);

        return String.format("%.2f", sum);
    }

    public int whereIsHe(int p, int bef, int aft) {
        int count = 0;
        int a = 0; //people in front of him
        int b = 0; //people behind him
        for (int i = 1; i <= p; i++) {
            a = i - 1;
            b = p - i;
            if (a >= bef && b <= aft) {
                count++;
            }
        }
        return count;
    }
}


