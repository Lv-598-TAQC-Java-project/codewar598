package kata.implementations.OrestTorskyi;

import kata.Five;

import java.math.BigInteger;


public class FiveImpl implements Five {


    public int artificialRain(int[] v) {
        int[] wateredSections = new int[v.length];
        for (int i = 0; i < v.length; i++) {
            wateredSections[i] = 1;
            for (int j = i; j < v.length - 1; j++) {
                if (v[j] >= v[j + 1]) {
                    wateredSections[i]++;
                } else {
                    break;
                }
            }
            for (int k = i; k > 0; k--) {
                if (v[k] >= v[k - 1]) {
                    wateredSections[i]++;
                } else {
                    break;
                }
            }
        }
        return getMaxValue(wateredSections);
    }

    private int getMaxValue(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public long[] gap(int g, long m, long n) {
        long firstPrime = searchNextPrimeNumber(m);
        long nextPrime = searchNextPrimeNumber(firstPrime);
        long primeSubtraction = 0;
        long[] pairPrime = null;
        while (nextPrime <= n) {
            primeSubtraction = nextPrime - firstPrime;
            if (primeSubtraction != g) {
                firstPrime = nextPrime;
                nextPrime = searchNextPrimeNumber(firstPrime);
            } else {
                pairPrime = new long[2];
                pairPrime[0] = firstPrime;
                pairPrime[1] = nextPrime;
                break;
            }
        }
        return pairPrime;
    }

    private long searchNextPrimeNumber(long fromNumber) {
        long i = fromNumber + 1;
        while (true) {
            for (long j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    break;
                } else {
                    if (j == i / 2) {
                        return i;
                    } else {
                        continue;
                    }
                }
            }
            i++;
        }
    }

    public int zeros(int n) {
        long number = calculateFactorial(n);
        int count = 0;
        while(number % 10 == 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    private int calculateFactorial(int number) {
        int factorial = number;
        for (int i = number - 1; i >= 1; i--) {
            factorial *= i;
        }
        return factorial;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        return null;
    }

    @Override
    public double solveSum(double m) {
        return 0;
    }

    @Override
    public long[] smallest(long n) {
        return new long[0];
    }
}
