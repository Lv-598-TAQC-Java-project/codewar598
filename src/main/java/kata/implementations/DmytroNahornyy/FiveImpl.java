package kata.implementations.DmytroNahornyy;

import kata.Five;

import java.math.BigInteger;

public class FiveImpl implements Five {
    @Override
    public int artificialRain(int[] v) {

        int sections = 0;

        int numberOfSections = v.length;
        int[] leftSide = new int[numberOfSections];
        int[] rightSide = new int[numberOfSections];

        //left side
        for (int i = 1; i < numberOfSections; i++){
            if(v[i] >= v[i-1]){
                leftSide[i] = leftSide[i-1] + 1;
            }
            else {
                leftSide[i] = 0;
            }
        }

        //right side
        for (int i = v.length-2; i >= 0; i-- ){
            if(v[i] >= v[i+1]){
                rightSide[i] = rightSide[i+1]+1;
            }
            else {
                rightSide[i]=0;
            }
        }
        for(int i=0;i<v.length;i++){
            sections = Math.max(sections,leftSide[i]+rightSide[i]);
        }
        return sections+1;

    }

    @Override
    public long[] gap(int g, long m, long n) {

        long[] result = new long[2];
        boolean isPrime = false;
        long first = 0;
        long second = 0;
        if (n < m) {
            return null;
        }
        if (n > 1100000) {
            return null;
        }
        if (g < 2) {
            return null;
        }
        if (m <= 2 || m == n) {
            return null;
        }

        for (long i = m; i <= n; i = i + 1) {
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = true;
                    break;
                }
            }
            if (!isPrime) {
                if (first == 0) {
                    first = i;
                } else {
                    if (i - first == g) {
                        second = i;
                        break;
                    } else {
                        first = i;
                    }
                }
            }
            isPrime = false;
        }
        if (second - first == g) {
            result[0] = first;
            result[1] = second;
            return result;
        } else {
            return null;
        }

    }

    @Override

    public int zeros(int n) {
        int result = 0;
        while (n > 0) {
            n /= 5;
            result += n;
        }
        return result;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {

        int n0 = 0;
        int n1 = 1;
        int n2 = n0 + n1;
        int sum = 0;
        for (int i = 0; i <= n.intValue(); i++) {
            sum += n2;
            n2 += n0;
            n0 = n1;
            n1 = n2;
        }
        return BigInteger.valueOf(sum * 4);

    }

    @Override
    public double solveSum(double m) {

        double result;
        result = (1-Math.sqrt(4*m+1))/(2*m)+1;
        return result;

    }

    @Override
    public long[] smallest(long n) {
        if(n < 0) return new long[] {-1,-1,-1};

        long[] arr = new long[3];
        long min = n;
        String str = n + "";
        boolean check = false;

        for(int i = 0; i < str.length(); i++){
            if (str.charAt(0) == str.charAt(i)) {
                check = true;
            } else {
                check = false;
            }

            for(int j = 0; j < str.length(); j++){
                StringBuffer s = new StringBuffer(str);
                char ch = s.charAt(i);
                s.deleteCharAt(i);
                s.insert(j, ch);
                long num = Long.valueOf(s.toString());

                if(num < min){
                    min = num;
                    arr[0] = min;
                    arr[1] = i;
                    arr[2] = j;
                }
            }
        }
        if (check == true) {
            long[] arr1 = {n, 0, 0};
            return arr1;
        }
        return arr;
    }
}
