package kata.implementations.OrestTorskyi;

import kata.Five;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;


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
        int count = 0;
        String numberStr = calculateFactorial(n);
        for (int i = numberStr.length() - 1; i >= 0; i--) {
            if (numberStr.charAt(i) == '0') {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    private String calculateFactorial(int number) {
        if (number == 0) {
            return "1";
        }
        BigInteger factorial = new BigInteger(String.valueOf(number));
        for (int i = number - 1; i >= 1; i--) {
            factorial = factorial.multiply(new BigInteger(String.valueOf(i)));
        }
        return factorial.toString();
    }

    public BigInteger perimeter(BigInteger n) {
        List<BigInteger> squares = getSquaresValue(n);
        BigInteger perimeter = getSquaresPerimeter(squares);
        return perimeter;
    }

    private List<BigInteger> getSquaresValue(BigInteger n) {
        List<BigInteger> squareValues = new LinkedList<>();
        BigInteger square = new BigInteger("0");
        squareValues.add(new BigInteger("1"));
        for (int i = 1; i < n.intValue() + 1; i++) {
            for (int j = i - 1; j >= ((i == 1) ? i - 1 : i - 2); j--) {
                square = square.add(squareValues.get(j));
            }
            squareValues.add(square);
            square = square.subtract(square);
        }
        return squareValues;
    }

    private BigInteger getSquaresPerimeter(List<BigInteger> squares) {
        BigInteger perimeter = new BigInteger("0");
        for (int i = 0; i < squares.size(); i++) {
            perimeter = perimeter.add(squares.get(i));
        }
        perimeter = perimeter.multiply(new BigInteger("4"));
        return perimeter;
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
