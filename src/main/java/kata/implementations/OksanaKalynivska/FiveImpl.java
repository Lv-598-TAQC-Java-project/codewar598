package kata.implementations.OksanaKalynivska;

import java.math.BigInteger;

import kata.Five;

public class FiveImpl implements Five {

    @Override
    public int artificialRain( final int[] v) {
        if (v.length == 1) {
            return 1;
        }
        int maxSize = 0;
        int[] leftFall = new int[v.length];
        int[] rightFall = new int[v.length];

        for (int i = 1; i < v.length; i++)
            if (v[i - 1] <= v[i])
                leftFall[i] = leftFall[i - 1] + 1;

        for (int i = v.length - 2; i >= 0; i--)
            if (v[i + 1] <= v[i])
                rightFall[i] = rightFall[i + 1] + 1;

        for (int i = 0; i < v.length; i++) {
            int currentSize = leftFall[i] + rightFall[i] + 1;
            if (currentSize > maxSize)
                maxSize = currentSize;
        }
        return maxSize;

    }

    @Override
    public long[] gap(int g, long m, long n) {
        if (g < 2 || m < 3 || n < m) {
            return null;
        }

        long currentCandidate = m;
        long primeOne = 0;
        long primeTwo = 0;

        while (primeTwo - primeOne != g && currentCandidate <= n) {
            if (checkIfPrime(currentCandidate)) {
                if (primeTwo != 0) {
                    primeOne = primeTwo;
                }
                primeTwo = currentCandidate;
            }

            currentCandidate++;
        }

        if (primeOne == 0 || primeTwo == 0 || primeTwo - primeOne != g) {
            return null;
        } else {
            return new long[]{primeOne, primeTwo};
        }
    }

    public static boolean checkIfPrime(long num) {
        boolean isPrime = true;

        for (long i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }

    @Override
    public int zeros(int n) {
        int sum = 0;
        for (int i = 1; i < 13; i++) {
            sum += n / Math.pow(5, i);
        }
        return sum;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        BigInteger prev = new BigInteger("1");
        BigInteger next = new BigInteger("1");
        BigInteger temp = new BigInteger("1");
        BigInteger sum = new BigInteger("2");

        for (int i = 0; i < n.intValue() - 1; i++) {
            temp = prev;
            prev = prev.add(next);
            next = temp;
            sum = sum.add(prev);
        }
        sum = sum.multiply(BigInteger.valueOf(4));
        return sum;
    }

    @Override
    public double solveSum(double m) {
        double s = Math.sqrt(4 * m + 1);
        return (2 * m + 1 - s) / (2 * m);

    }

    @Override
    public long[] smallest(long n) {
        long array[] = {n, 0, 0};

        String s = String.valueOf(n);

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                String newString = s.substring(0, i) + s.substring(i + 1);
                long result = Long.parseLong(newString.substring(0, j) + s.charAt(i) + newString.substring(j));

                if (result < array[0]) {

                    array = new long[]{result, i, j};
                }

            }

        }
        return array;
    }

}
