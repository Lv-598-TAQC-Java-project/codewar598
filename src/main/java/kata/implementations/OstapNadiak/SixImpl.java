package kata.implementations.OstapNadiak;

import kata.Six;

import java.math.BigDecimal;
import java.math.BigInteger;

public class SixImpl implements Six {
    @Override
    public long findNb(long m) {
        int n = 0;
        double sum = 0;
        while (sum<m){
            n++;
            sum += Math.pow(n,3);
        }

        return n;
    }

    @Override
    public String balance(String book) {
        return null;
    }

    @Override
    public double f(double x) {
        return 0;
    }

    @Override
    public double mean(String town, String strng) {
        return 0;
    }

    @Override
    public double variance(String town, String strng) {
        return 0;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        return null;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        return null;
    }
}
