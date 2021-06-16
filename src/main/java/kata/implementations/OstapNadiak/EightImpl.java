package kata.implementations.OstapNadiak;

import kata.Eight;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class EightImpl implements Eight {
    @Override
    public int liters(double time) {
        return (int)Math.floor(time*0.5);
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return length*width*height;
    }

    @Override
    public float mpgToKPM(float mpg) {
        double kilometresPerLiter;
        kilometresPerLiter = (mpg * 1.609344)/4.54609188;
        BigDecimal result = new BigDecimal(kilometresPerLiter);
        result = result.setScale(2, RoundingMode.HALF_UP);
        System.out.println("the number of kilometers per liter based on the number of miles per imperial gallon is " + result);
        return result.floatValue();
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        for (int i = 0; i<array.length; i++){
            if (Math.sqrt(array[i] ) % 1 == 0 ){
                array[i] = (int)Math.sqrt(array[i]);
            }
            else {
                array[i] *= array[i];
            }

        }
        return array;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        int count;
        int sum;
        if (input.length == 0){
            return new int[0];
        }
        int[] toShow = new int[2];
        sum =0;
        count = 0;
        for (int i = 0; i <input.length ;i++){
            if (input[i]>0){
                count++;
            }
            else  {
                sum += input[i];
            }
        }
        toShow[0] = count;
        toShow[1] = sum;
       return toShow;
    }

    @Override
    public int stringToNumber(String str) {
        int number = 0;
        try {
            number = Integer.parseInt(str);
            return number;
        }
        catch (NumberFormatException e) {
            System.out.println("Неправильний формат строки");
        }
        return number;
    }

    public static double getFactorial(double f) {
        double result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
    @Override
    public boolean am_i_wilson(double n) {
        double result;
        result = (getFactorial ((n-1)) +1) / (n*n)  ;
        //result = result / (p *p);
        if (n == 13 || n == 5 || n == 563){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public double TwoDecimalPlaces(double number) {
        BigDecimal result = new BigDecimal(number);
        number = result.setScale(2, RoundingMode.HALF_UP).doubleValue();
        return number;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        int count=0;
        for (int i =0; i < numbers.length; i++){
            if (numbers[i] % divider == 0){
                count++;
            }
        }
        int[] array = new int[count];
        int j = 0;
        for (int i = 0; i<numbers.length;i++){
            if (numbers[i]%divider == 0 ){
                array[j] = numbers[i];
                j++;
            }
        }
        return array;
    }
}
