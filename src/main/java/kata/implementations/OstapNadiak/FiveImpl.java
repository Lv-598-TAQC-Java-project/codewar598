package kata.implementations.OstapNadiak;

import kata.Five;

import java.math.BigInteger;
import java.util.ArrayList;

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
        long[] primes = new long[2];
        BigInteger integer = new BigInteger(String.valueOf(m));
        boolean probablePrime;
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        for (int i ; m<n;m++){
            integer = BigInteger.valueOf(m);
            probablePrime = integer.isProbablePrime((int)m);
            if ( probablePrime ){
                primeNumbers.add((int)m);
            }
        }
        for (int i=0; i<(primeNumbers.size()-1); i++){
            if (primeNumbers.get(i+1) - primeNumbers.get(i) == g){
                primes[0] = primeNumbers.get(i);
                primes[1] = primeNumbers.get(i+1);
                break;
            }
        }
        return primes;
    }
    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }

    public static int getCountsOfDigits(long number) {
        return String.valueOf(Math.abs(number)).length();
    }

    static int[] fib(int n)
    {

        int f[] = new int[n+2];
        int i;
        f[0] = 0;
        f[1] = 1;
        for (i = 2; i <= n+1; i++)
        {
            f[i] = f[i-1] + f[i-2];
        }
        return f;
    }

    @Override
    public int zeros(int n) {
        int count=0;
        long number;
        number = getFactorial(n);
        for (int i = 0; i<getCountsOfDigits(number); i++){
            if (number%10 == 0){
                count++;
                number = number/10;
            }
            else {
                break;
            }
        }
        return count;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        int[] fibonaciNumbers =  fib(n.intValue());
        int sumOfPerimetres = 0;
        for (int i =0; i< (n.intValue()+2);i++){
            sumOfPerimetres += fibonaciNumbers[i]*4;
        }
        n = BigInteger.valueOf(sumOfPerimetres);
        return n;
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
