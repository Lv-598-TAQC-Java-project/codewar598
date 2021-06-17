package kata.implementations.OksanaKalynivska;

import java.util.Arrays;

import kata.Eight;

public class EightImp implements Eight {
	@Override
	public int liters(double time) {
		return (int) Math.floor(time / 2);
	}

	@Override
	public double getVolumeOfCuboid(double length, double width, double height) {
		double v = length * width * height;
		return v;
	}

	@Override
	public float mpgToKPM(float mpg) {
		float change = (float) (mpg * (1.609344 / 4.54609188));
		return (float) (Math.round(change * 100) / 100.0);
	}

	@Override
	public int[] squareOrSquareRoot(int[] array) {
		for (int i = 0; i < array.length; i++) {
			double s = Math.sqrt(array[i]);
			if (s == Math.round(s))

			{
				array[i] = (int) s;
			} else {
				array[i] = (int) Math.pow(array[i], 2);
			}

		}
		return array;
	}

	@Override
	public int[] countPositivesSumNegatives(int[] input) {
		int count = 0;
		int sum = 0;
		if (input == null || input.length == 0) {
			return new int[] {};

		}
		for (int i = 0; i < input.length; i++) {
			if (input[i] > 0) {
				count++;
			} else {
				sum = sum + input[i];
			}

		}
		int[] array = new int[] { count, sum };
		return array;

	}

	@Override
	public int stringToNumber(String str) {
		return Integer.parseInt(str);
	}

	@Override
	public boolean am_i_wilson(double n) {
		return n == 5 || n == 13 || n == 563;
	}

	@Override
	public double TwoDecimalPlaces(double number) {
		return Math.round(number * 100) / 100.00;
	}

	@Override
	public int[] divisibleBy(int[] numbers, int divider) {
		int[] newArray = new int[numbers.length];
		int k = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % divider == 0) {
				newArray[k] = numbers[i];
				k++;
			}
		}

		return Arrays.copyOf(newArray, k);

	}
}
