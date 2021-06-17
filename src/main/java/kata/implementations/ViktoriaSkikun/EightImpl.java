package kata.implementations.ViktoriaSkikun;

import kata.Eight;
import util.ConsoleScanner;

public class EightImpl implements Eight {

    private ConsoleScanner consoleScanner = new ConsoleScanner();

    public int liters(final double time) {
        return (int) Math.floor(time * 0.5);
    }

    public double getVolumeOfCuboid (double length, double width, double height){
        return length * width * height;
    }

    public float mpgToKPM(float mpg) {
        float kpl = (float) Math.round(0.354006 * 100 * mpg) / 100;
        return kpl;
    }

    public int[] squareOrSquareRoot(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (Math.sqrt(array[i]) % 1 == 0) {
                array[i] = (int) Math.sqrt(array[i]);
            } else {
                array[i] *= array[i];
            }
        }
        return array;
    }

    public int[] countPositivesSumNegatives(int[] input) {

        if (input == null || input.length == 0) {
            int[] emptyArray = new int[0];
            return emptyArray;
        } else {
            int[] positiveNegativeSum = new int[2];
            int sumPositive = 0;
            int sumNegative = 0;

            for (int i = 0; i < input.length; i++) {
                if (input[i] > 0) {
                    sumPositive += input[i];
                } else {
                    sumNegative += input[i];
                }
            }
            positiveNegativeSum[0] = sumPositive;
            positiveNegativeSum[1] = sumNegative;

            return positiveNegativeSum;
        }
    }

    public int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    public boolean am_i_wilson(double n) {
        double nNew = n - 1;
        double result = 1;

        for (int i = 1; i <= nNew; i++) {
            result = result * i;
        }

        if ((result + 1) / (n * n) % 10 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //public double TwoDecimalPlaces(double number) { return Math.floor(number * 100) / 100; }

    public double TwoDecimalPlaces(double number) {
        return Math.round(number * 100) / 100.00;
    }

    public int[] divisibleBy(int[] numbers, int divider) {

        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % divider == 0) {
                count++;
            }
        }

        int[] array = new int[count];
        int j = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % divider == 0) {
                array[j] += numbers[i];
                j++;
            }
        }
        return array;
    }
}
