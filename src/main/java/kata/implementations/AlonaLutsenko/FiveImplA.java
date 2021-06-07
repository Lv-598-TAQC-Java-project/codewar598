package kata.implementations.AlonaLutsenko;

import kata.Five;

import java.math.BigInteger;

public class FiveImplA implements Five {
    @Override
    public int artificialRain(int[] v) {
        int height = 0;
        int size = 1;
        int low = 0;
        for (int i = 1; i < v.length; i++) {
            int k = v[i];
            if (k > v[i - 1]) {
                height = Math.max(height, size);
                size = i - low;
            }
            if (k < v[i - 1]) {
                low = i;
            }
            size++;
        }
        return Math.max(height, size);
    }

    @Override
    public long[] gap(int g, long m, long n) {
        if (n > 1100000) {
            return null;
        }
        long num1 = 0;
        long num2 = 0;
        boolean found = false;
        boolean check;
        for (long i = m; i < n; i++) {
            check = false;
            for (long j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    check = true;
                    break;
                }
            }

            if (check == false) {
                if (num1 == 0) {
                    num1 = i;
                } else {
                    if (i - num1 == g) {
                        num2 = i;
                        found = true;
                        break;
                    } else {
                        num1 = i;
                    }
                }

            }
        }

        if (found == true) {
            long[] result = {num1, num2};
            return result;
        }
        return null;
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
        BigInteger last = new BigInteger("0");
        BigInteger curr = new BigInteger("1");
        BigInteger total = new BigInteger("1");
        for (long i = 0; i < n.longValue(); i++) {
            BigInteger next = curr.add(last);
            total = total.add(next);
            last = curr;
            curr = next;
        }
        return total.multiply(BigInteger.valueOf(4));
    }

    @Override
    public double solveSum(double m) {
        double result;
        result = (1 - Math.sqrt(4 * m + 1)) / (2 * m) + 1;
        return result;
    }

    @Override
    public long[] smallest(long n) {
        long[] arr = new long[3];
        long min = n;
        String str = n + "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                StringBuffer sb = new StringBuffer(str);
                char ch = sb.charAt(i);
                sb.deleteCharAt(i);
                sb.insert(j, ch);
                long num = Long.valueOf(sb.toString());
                if (num < min) {
                    min = num;
                    arr[0] = min;
                    arr[1] = i;
                    arr[2] = j;
                }
            }
        }
        return arr;
    }
}
