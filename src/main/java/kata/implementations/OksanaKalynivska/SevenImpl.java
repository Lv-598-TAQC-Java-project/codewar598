package kata.implementations.OksanaKalynivska;

import kata.Seven;

public class SevenImpl implements Seven {

	@Override
	public long newAvg(double[] arr, double navg) {
		int count = 0;
		double sum = 0.0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			count++;

		}
		int e = (int) Math.ceil((navg * (count + 1) - sum));
		if (e < 0) {
			throw new IllegalArgumentException("It's not good donation");
		} else {
			return e;
		}
	}

	@Override
	public String seriesSum(int n) {
		double sum = 0.0;

		for (int i = 0; i < n; i++) {
			sum += Double.valueOf(1) / Double.valueOf(i * 3 + 1);
		}

		return String.format("%.2f", sum);
	}

	@Override
	public int whereIsHe(int p, int bef, int aft) {
		return (bef + aft < p) ? aft + 1 : p - bef;

	}

}
