package kata.implementations.OrestTorskyi;

import kata.Eight;
import util.ConsoleScanner;
import java.util.LinkedList;
import java.util.List;

public class EightImpl implements Eight {

    private ConsoleScanner consoleScanner = new ConsoleScanner();

    public int liters(double time) {
        return (int) (Math.floor(time * 0.5));
    }

    public double getVolumeOfCuboid(double length, double width, double height) {
        return length * width * height;
    }

    public float mpgToKPM(float mpg) {
        float kpl = mpg * (float)0.354006;
        String secondDecimal = String.valueOf(kpl);
        float multiplier = secondDecimal.charAt(secondDecimal.indexOf(".") + 2) == '0' ? 10 : 100;
        float result = Math.round(kpl * multiplier);
        result = result / multiplier;
        return result;
    }

    public int[] squareOrSquareRoot(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = Math.abs(array[i]);
            }
            if (Math.sqrt(array[i]) % 1 == 0) {
                array[i] = (int) Math.sqrt(array[i]);
            } else {
                array[i] = (int) Math.pow(array[i], 2);
            }
        }
        return array;
    }

    public int[] countPositivesSumNegatives(int[] input) {

        if (input == null || input.length == 0) {
            int[] emptyArr = {};
            return emptyArr;
        } else {
            int[] positiveNegativeSum = new int[2];
            for (int i = 0; i < input.length; i++) {
                if (input[i] > 0) {
                    positiveNegativeSum[0]++;
                } else {
                    positiveNegativeSum[1] += input[i];
                }
            }
            return positiveNegativeSum;
        }
    }

    public int stringToNumber(String str) {
        char[] numberSymbols = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '-'};
        char[] strChar = str.toCharArray();
        for (int i = 0; i < strChar.length; i++) {
            for (int j = 0; j < numberSymbols.length; j++) {
                if (strChar[i] == numberSymbols[j]) {
                    break;
                } else {
                    if (j == numberSymbols.length - 1) {
                        return -1;
                    } else {
                        continue;
                    }
                }
            }
        }
        return Integer.parseInt(str);
    }

    public boolean am_i_wilson(double n) {
        int currentPrimeNumber = 7;
        double wilsonPrime = wilsonPrime(currentPrimeNumber);
        while (currentPrimeNumber <= n) {
            if (wilsonPrime % 1 == 0 && currentPrimeNumber == n) {
                return true;
            } else {
                currentPrimeNumber = searchNextPrimeNumber(currentPrimeNumber);
                wilsonPrime = wilsonPrime(currentPrimeNumber);
            }
        }
        return false;
    }

    private int searchNextPrimeNumber(int fromNumber) {
        int i = fromNumber + 1;
        while (true) {
            for (int j = i - 1; j > 1; j--) {
                if (i % j == 0) {
                    break;
                } else {
                    if (j == 2) {
                        return i;
                    } else {
                        continue;
                    }
                }
            }
            i++;
        }
    }

    private double wilsonPrime(int primeNumber) {
        return ((double) (calculateFactorial(primeNumber - 1) + 1) / (primeNumber * primeNumber));
    }

    private int calculateFactorial(int number) {
        int factorial = number;
        for (int i = number - 1; i >= 1; i--) {
            factorial *= i;
        }
        return factorial;
    }

    public double TwoDecimalPlaces(double number) {
        return Math.round(number * 100) / 100.0;
    }

    public int[] divisibleBy(int[] numbers, int divider) {
        List<Integer> resultList = new LinkedList<Integer>();
        for (int i : numbers) {
            if (i % divider == 0) {
                resultList.add(i);
            }
        }
        int[] arrayResult = new int[resultList.size()];
        for (int i = 0; i < arrayResult.length; i++) {
            arrayResult[i] = resultList.get(i);
        }
        return arrayResult;
    }
}
