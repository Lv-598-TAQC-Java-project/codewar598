package kata.implementations.OstapNadiak;

import kata.Five;

import java.math.BigInteger;

public class FiveImpl implements Five {



    @Override
    public int artificialRain(int[] v) {

        if (v.length == 1) {
            return 1;
        }
        else if (v.length == 0) {
            return 0;
        }

        int max = 0;
        int count;

        for (int i = 0; i<v.length; i++) {
            count = 1;

            for (int j = i-1; j>=0; j--){
                if (v[j] > v[j+1]){
                    break;
                }
                else {
                    count += 1;
                }
            }

            for (int j = i; j < v.length-1;j++){
                if (v[j+1]>v[j]){
                    break;
                }
                else {
                    count+=1;
                }
            }

            if (max<count) {
                max = count;
            }
        }
        return max;
    }

    @Override
    public long[] gap(int g, long m, long n) {
        return new long[0];
    }

    @Override
    public int zeros(int n) {
        return 0;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        return null;
    }

    @Override
    public double solveSum(double m) {
        return 0;
    }

    @Override
    public long[] smallest(long n) {
        return new long[0];
    }
}
