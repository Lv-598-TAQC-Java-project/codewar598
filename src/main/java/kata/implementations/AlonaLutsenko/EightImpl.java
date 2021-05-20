package kata.implementations.AlonaLutsenko;

import kata.Eight;

public class EightImpl implements Eight {
    public int liters(double time) {
        double liters = 0.5f;
        liters = (liters * time) - (liters * time) % 1;
        int result = (int) liters;
        return result;
    }

    public double getVolumeOfCuboid(double length, double width, double height) {
        double volumeofcuboid = length * width * height;
        return volumeofcuboid;
    }

    public float mpgToKPM(float mpg) {
        if (mpg >= 0) {
            float kpl = (float) Math.round(100 * 1.609344 / (float) 4.54609188 * mpg) / 100;
            return kpl;
        }
        return -1;
    }

    public int[] squareOrSquareRoot(int[] array) {
        int[] response = array;
        for (int i = 0; i < response.length; i++) {
            int root = (int) Math.sqrt(response[i]);
            int square = root * root;
            if (square == response[i]) {
                response[i] = root;
            } else {
                response[i] *= response[i];
            }
        }
        return response;
    }

    public int[] countPositivesSumNegatives(int[] input) {
        int[] output = new int[2];
        if (input == null || input.length == 0) {
            int[] empty = {};
            return empty;
        }
        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) output[0]++;
            else output[1] += input[i];
        }
        return output;
    }

    public int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    public boolean am_i_wilson(double n) {
        return n == 5.0 || n == 13.0 || n == 563.0;
    }

    public double TwoDecimalPlaces(double number) {
        return (double) Math.round(number * 100) / 100;
    }

    public int[] divisibleBy(int[] numbers, int divider) {
        int count = 0;
        int j = 0;
        for (int i = 0; i <= numbers.length - 1; i++) {
            if (numbers[i] % divider == 0) {
                count++;
            }
        }
        int[] array = new int[count];
        for (int i = 0; i <= numbers.length - 1; i++) {
            if (numbers[i] % divider == 0) {
                array[j] = numbers[i];
                j++;
            }
        }
        return array;
    }
}
