package kata.implementations.AlonaLutsenko;

import kata.Eight;

public class EightImpl implements Eight {
    public int liters(double time) {
        double liters = 0.5f;
        liters=(liters*time) - (liters*time)%1;
        int result=(int)liters;
        return result;
    }

    public double getVolumeOfCuboid(double length, double width, double height) {
        double volumeofcuboid = length *width *height;
        return volumeofcuboid;
    }

    public float mpgToKPM(float mpg) {
        return 0;
    }

    public int[] squareOrSquareRoot(int[] array) {
        return new int[0];
    }

    public int[] countPositivesSumNegatives(int[] input) {
        return new int[0];
    }

    public int stringToNumber(String str) {
        return 0;
    }

    public boolean am_i_wilson(double n) {
        return false;
    }

    public double TwoDecimalPlaces(double number) {
        return 0;
    }

    public int[] divisibleBy(int[] numbers, int divider) {
        return new int[0];
    }
}
