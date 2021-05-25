package kata.implementations.OksanaKalynivska;

import java.math.BigInteger;

import kata.Five;

public class FiveImpl implements Five {

	@Override
	public int artificialRain(int[] v) {
		if (v.length == 1) {
			return 1;
		}
		int maxSize = 0;
		int[] leftFall = new int[v.length];
		int[] rightFall = new int[v.length];

		for (int i = 1; i < v.length; i++)
			if (v[i - 1] <= v[i])
				leftFall[i] = leftFall[i - 1] + 1;

		for (int i = v.length - 2; i >= 0; i--)
			if (v[i + 1] <= v[i])
				rightFall[i] = rightFall[i + 1] + 1;

		for (int i = 0; i < v.length; i++) {
			int currentSize = leftFall[i] + rightFall[i] + 1;
			if (currentSize > maxSize)
				maxSize = currentSize;
		}
		return maxSize;

	}

	@Override
	public long[] gap(int g, long m, long n) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int zeros(int n) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public BigInteger perimeter(BigInteger n) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double solveSum(double m) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long[] smallest(long n) {
		long array[] = { n, 0, 0 };

		String s = String.valueOf(n);

		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < s.length(); j++) {
				String newString = s.substring(0, i) + s.substring(i + 1);
				long result = Long.parseLong(newString.substring(0, j) + s.charAt(i) + newString.substring(j));

				if (result < array[0]) {

					array = new long[] { result, i, j };
				}

			}

		}
		return array;
	}

}
