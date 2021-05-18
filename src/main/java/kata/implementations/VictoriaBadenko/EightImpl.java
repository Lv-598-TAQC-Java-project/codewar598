package kata.implementations.VictoriaBadenko;

import kata.Eight;

public class EightImpl implements Eight {

    public int liters(double time) {
        return (int) (time / 2);
    }

    public double getVolumeOfCuboid(double length, double width, double height) {
        double a = length * width * height;
        return a;
    }

    public float mpgToKPM(float mpg) {
        return Math.round(mpg * 1.609344 / 4.54609188 * 100) / 100f;
    }

    public int[] squareOrSquareRoot(int[] array) {
        for (int i = 0; i < array.length; i++) {
            double sqr = Math.sqrt(array[i]);
            if (sqr == Math.round(sqr)) {
                array[i] = (int) sqr;
            } else {
                array[i] = array[i] * array[i];
            }
        }
        return array;
    }

    public int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) {
            return new int[]{};
        } else {
            int count = 0;
            int sum = 0;
            for (int i : input) {
                if (i > 0) {
                    count++;
                }
                if (i < 0) {
                    sum += i;
                }
            }
            return new int[]{count, sum};
        }
    }

    public int stringToNumber(String str) {
        return Integer.valueOf(str);
    }

    public boolean am_i_wilson(double n) {
        return n == 5 || n == 13 || n == 563;
    }

    public double TwoDecimalPlaces(double number) {
        return Math.round(number * 100.0) / 100.0;
    }

    public int[] divisibleBy(int[] numbers, int divider) {
        int count = 0;
        for (int number : numbers) {
            if (number % divider == 0) {
                count++;
            }
        }
        int[] arr = new int[count];
        int i = 0;
        for (int number : numbers) {
            if (number % divider == 0) {
                arr[i] = number;
                i++;
            }
        }
        return arr;
    }
}

