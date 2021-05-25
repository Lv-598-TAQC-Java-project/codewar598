package kata.implementations.VictoriaBadenko;

import kata.Five;

import java.math.BigInteger;

public class FiveImpl implements Five {


    @Override
    public int artificialRain(int[] v) {
        int maxLength = 0;
        int left = 0;
        int right = 0;
        int localMin = 0;
        for (right = 1; right < v.length; right++) {
            if (v[right - 1] < v[right]) {
                maxLength = Math.max(maxLength, right - left);
                left = localMin;
            } else if (v[right - 1] > v[right]) {
                localMin = right;
            }
        }
        return Math.max(maxLength, right - left);
    }

    @Override
    public long[] gap(int g, long m, long n) {
        long last = 0;
        for (long num = m; num <= n; num++) {
            if (isPrime(num)) {
                if (num - last == g) {
                    return new long[]{last, num};
                }
                last = num;
            }
        }
        return null;
    }

    private static boolean isPrime(long num) {
        if (num == 0 || num == 1) return false;
        for (long j = 2; j * j <= num; j++) {
            if (num % j == 0) return false;
        }
        return true;

    }

    @Override
    public int zeros(int n) {
        return (n < 5) ? 0 : (n / 5) + zeros(n / 5);
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        BigInteger last = new BigInteger("0");
        BigInteger curr = new BigInteger("1");
        BigInteger total = new BigInteger("1");
        for (long i = 0; i < n.longValue(); i++) {
            BigInteger next = curr.add(last);
            total = total.add(next);
            last = curr;
            curr = next;
        }
        return total.multiply(BigInteger.valueOf(4));
    }

    @Override
    public double solveSum(double m) {
        double normal = (2 * m) + 1;
        double radical = Math.sqrt(4 * m + 1);
        double divisor = 2 * m;
        return (normal - radical)/divisor;
    }

    @Override
    public long[] smallest(long n) {
        return new long[0];
    }
}
