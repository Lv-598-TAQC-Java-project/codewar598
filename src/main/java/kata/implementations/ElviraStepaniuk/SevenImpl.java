package kata.implementations.ElviraStepaniuk;

import kata.Seven;

import java.util.Arrays;

public class SevenImpl implements Seven {

    @Override
    public long newAvg(double[] arr, double navg) {
        double sum = Arrays.stream(arr).sum();
        int result = (int) Math.ceil(navg * (arr.length + 1) - sum);
        if(result <= 0)
            throw new IllegalArgumentException();
        return result;
    }

    @Override
    public String seriesSum(int n) {
        double sum = 0.0;
        for(int i=0; i<n; i++){
            sum += 1.0/(1+3*i);
        }
        return String.format("%.2f", sum);
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return Math.min(p-bef, ++aft);
    }
}
