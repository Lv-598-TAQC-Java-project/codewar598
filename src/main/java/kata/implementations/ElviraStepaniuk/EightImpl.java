package kata.implementations.ElviraStepaniuk;

import java.util.Arrays;
import kata.Eight;

public class EightImpl implements Eight {
    @Override
    public int liters(double time) {
        return (int)(time*0.5);
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return length*width*height;
    }

    @Override
    public float mpgToKPM(float mpg) {
        return (float) Math.round(1.609344 / 4.54609188 * 100 * mpg) / 100;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        for (int i = 0; i<array.length; i++){
            int sqrt = (int) Math.sqrt(array[i]);
            if (sqrt * sqrt == array[i]){
                array[i] = sqrt;
            }else{
                array[i] *= array[i];
            }
        }
        return array;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        if (input==null || input.length==0) {
            return new int[]{};
        }else {
            int pos = 0;
            int neg = 0;
            for (int i : input){
                if (i>0){
                    pos++;
                }else {
                    neg+=i;
                }
            }
            return new int[]{pos, neg};
        }
    }

    @Override
    public int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    @Override
    public boolean am_i_wilson(double n) {
        return n==5 || n==13 || n==563;
    }

    @Override
    public double TwoDecimalPlaces(double number) {
        return (Math.round(number*100))/100.0;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        return Arrays.stream(numbers).filter(num -> num % divider == 0).toArray();
    }
}
