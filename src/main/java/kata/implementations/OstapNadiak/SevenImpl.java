package kata.implementations.OstapNadiak;

import kata.Seven;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        for (int i = 0; i<arr.length;i++){
            if (arr[i]<= navg)
                continue;
            else {
                return -1;
            }
        }
        int sum = 0;
        for (int i = 0; i<arr.length; i++){
            sum += navg - arr[i];
        }
        sum += navg;
        return sum;
    }

    @Override
    public String seriesSum(int n) {
        double sum = 0;
        for (double i=1;i<=n; i++) {
            if (n==0){
                sum = 0;
            }
            else {
                sum += 1/(1+(i-1)*3d);
            }
        }
        BigDecimal result = new BigDecimal(sum);
        result = result.setScale(2, RoundingMode.HALF_UP);
        return result.toString();
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        int result = 0;
        if(bef + aft >= p) {
            result = p - bef;
        }
        else if (bef + aft < p){
            result = aft + 1;
        }
        return result;
    }
}
