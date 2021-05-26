package kata.implementations.DmytroNahornyy;

import kata.Eight;

public class EightImpl implements Eight {


    @Override
    public int liters(double time) {
        double a = time * 0.5;
        int b = (int) a;
        return b;
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return length * width * height;
    }

    @Override
    public float mpgToKPM(float mpg) {
        float consta = (float) Math.round(1.609344 / 4.54609188 * 100 * mpg) / 100;
        return consta;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (Math.sqrt(array[i]) % 1 == 0) {
                array[i] = (int) Math.sqrt(array[i]);

            } else {
                array[i] = array[i] * array[i];

            }

        }
        return array;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) {
            return new int[0];
        } else {
            int[] result = new int[2];
            int pos = 0;
            int neg = 0;
            for (int i = 0; i < input.length; i++) {
                if (input[i] > 0) {
                    pos++;
                } else {
                    neg = neg + input[i];
                }
            }
            result[0] = pos;
            result[1] = neg;

            return result;
        }
    }

    @Override
    public int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    @Override
    public boolean am_i_wilson(double n) {
        int result = 1;
        for (int i = 1; i <= (n-1); i++) {
            result = result * i;
        }

        double numb = (result + 1) / (n * n);

        if(numb == (int)numb && (n > 1)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public double TwoDecimalPlaces(double number) {
        return (double) (Math.round(number * 100)) / 100;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        int count = 0;
        for (int i : numbers) {
            if (i % divider == 0)
                count++;
        }
        int[] n = new int[count];
        int count1 = 0;
        for (int i : numbers) {
            if (i % divider == 0) {
                n[count1] = i;
                count1++;
            }
        }
        return n;
    }


}
