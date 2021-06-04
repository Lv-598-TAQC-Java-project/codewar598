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
        long firstPrime;
        if (isPrimeNumber(m)) {
            firstPrime = m;
        } else {
            firstPrime = searchNextPrimeNumber(m);
        }
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
            if (isPrimeNumber(i)) {
                return i;
            } else {
                i++;
            }

        }
    }

    private boolean isPrimeNumber(long currentNumber) {
        boolean result = false;
        for (long j = 2; j <= (currentNumber == 3 ? currentNumber : currentNumber / 2); j++) {
            if (currentNumber % j == 0) {
                return result;
            } else {
                if (j == (currentNumber == 3 ? currentNumber - 1 : currentNumber / 2)) {
                    result = true;
                } else {
                    continue;
                }
            }
        }
        return result;
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
        double d = findDescriminant(m);
        double result = findX(d, m);
        return result;
    }

    private double findDescriminant(double m) {
        double descriminant = Math.pow((m * 2 + 1), 2) - 4 * Math.pow(m, 2);
        return descriminant;
    }

    private double findX(double descriminant, double m) {
        double firstValue = (-((-2) * m - 1) - Math.sqrt(descriminant)) / (2 * m);
        double secondValue = (-((-3) * m) + Math.sqrt(descriminant)) / (2 * m);
        return firstValue > 0 && firstValue < 1 ? firstValue
                : secondValue > 0 && secondValue < 1 ? secondValue : -1;
    }


    @Override
    public long[] smallest(long n) {
        List<Character> numberList = getCharacterList(n);
        List<Long> variantsList = new LinkedList<>();
        List<List<Integer>> indexesOfChange = new LinkedList<>();
        Character digit;
        for (int i = 0; i < numberList.size(); i++) {
            digit = numberList.get(i);
            numberList.remove(i);
            for (int j = 0; j < numberList.size(); j++) {
                List<Integer> index = new LinkedList<>();
                numberList.add(j, digit);
                variantsList.add(getLongNumberFromCharactersArray(numberList));
                index.add(i);
                index.add(j);
                indexesOfChange.add(index);
                numberList.remove(j);
            }
            numberList.add(i, digit);
        }
        return getSmallestNumber(variantsList, indexesOfChange);
    }


    private List<Character> getCharacterList(long n) {
        char[] numberArray = String.valueOf(n).toCharArray();
        List<Character> numberList = new LinkedList<>();
        for (char numberSymbol : numberArray) {
            numberList.add(numberSymbol);
        }
        return numberList;
    }

    private long getLongNumberFromCharactersArray(List<Character> numberList) {
        StringBuffer strNumber = new StringBuffer();
        String regex = "^[0]*";
        long number;
        for (Character symbolNumber : numberList) {
            strNumber.append(symbolNumber);
        }
        number = Long.parseLong(strNumber.toString().replaceAll(regex, ""));
        return number;
    }

    private long[] getSmallestNumber(List<Long> numberList, List<List<Integer>> indexesOfChange) {
        long minValue = numberList.get(0);
        List<Integer> index = indexesOfChange.get(0);
        long[] result = new long[3];
        for (int i = 1; i < numberList.size(); i++) {
            if (minValue > numberList.get(i)) {
                minValue = numberList.get(i);
                index = indexesOfChange.get(i);
            }
        }
        result[0] = minValue;
        result[1] = index.get(0);
        result[2] = index.get(1);
        return result;
    }

}
