package kata.implementations.ViktoriaSkikun;

import kata.Five;

import java.math.BigInteger;
import java.util.ArrayList;

public class FiveImpl implements Five {

    @Override
    public int artificialRain(int[] v) {

        int sections = 0;

        int numberOfSections = v.length;
        int[] leftSide = new int[numberOfSections];
        int[] rightSide = new int[numberOfSections];

        //left side
        for (int i = 1; i < numberOfSections; i++) {
            if (v[i] >= v[i - 1]) {
                leftSide[i] = leftSide[i - 1] + 1;
            } else {
                leftSide[i] = 0;
            }
        }

        //right side
        for (int i = v.length - 2; i >= 0; i--) {
            if (v[i] >= v[i + 1]) {
                rightSide[i] = rightSide[i + 1] + 1;
            } else {
                rightSide[i] = 0;
            }
        }
        for (int i = 0; i < v.length; i++) {
            sections = Math.max(sections, leftSide[i] + rightSide[i]);
        }
        return sections + 1;
    }

    @Override
    public long[] gap(int g, long m, long n) {

        long[] result = new long[2];
        boolean isPrime = false;
        long first = 0;
        long second = 0;

        if (n < m) {
            return null;
        }
        if (n > 1100000) {
            return null;
        }
        if (g < 2) {
            return null;
        }
        if (m <= 2 || m == n) {
            return null;
        }

        for (long i = m; i <= n; i = i + 1) {
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = true;
                    break;
                }
            }
            if (!isPrime) {
                if (first == 0) {
                    first = i;
                } else {
                    if (i - first == g) {
                        second = i;
                        break;
                    } else {
                        first = i;
                    }
                }
            }
            isPrime = false;
        }
        if (second - first == g) {
            result[0] = first;
            result[1] = second;
            return result;
        } else {
            return null;
        }

    }

    @Override
    public int zeros(int n) {
        int count = 0;
        long number;
        number = factorial(n);
        int j = getCountsOfDigits(number);
        for (int i = 0; i < j; i++) {
            if (number % 10 == 0) {
                count++;
                number = number / 10;
            } else {
                break;
            }
        }
        return count;
    }

    private static int getCountsOfDigits(long number) {
        return String.valueOf(Math.abs(number)).length();
    }

    private static long factorial(int num) {
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        if (n.intValue() < 0) {
            return n = BigInteger.valueOf(0);

        }
        int[] fibonachiNumbers = fib(n.intValue());
        int sumOfPerimeters = 0;
        for (int i = 0; i < (n.intValue() + 2); i++) {
            sumOfPerimeters += fibonachiNumbers[i] * 4;
        }
        n = BigInteger.valueOf(sumOfPerimeters);
        return n;
    }

    private static int[] fib(int n) {

        int f[] = new int[n + 2];
        int i;
        f[0] = 0;
        f[1] = 1;
        for (i = 2; i <= n + 1; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f;
    }

    @Override
    public double solveSum(double m) {

        double result;
        result = (1 - Math.sqrt(4 * m + 1)) / (2 * m) + 1;
        return result;
    }

    @Override
    public long[] smallest(long n) {

        char first;
        long toCompare;
        long min = n;
        int index = 0;
        int secondIndex = 0;
        char[] a = String.valueOf(n).toCharArray();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                StringBuffer buff = new StringBuffer(String.valueOf(n));
                first = buff.charAt(i);
                buff.delete(i, i + 1);
                buff.insert(j, first);

                toCompare = Integer.parseInt(new String(buff));

                if (toCompare < min) {
                    min = toCompare;
                    index = i;
                    secondIndex = j;
                }
            }
        }
        return new long[]{min, index, secondIndex};
    }
}
