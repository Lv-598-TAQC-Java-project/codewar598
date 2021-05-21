package kata.implementations.VictoriaBadenko;

import kata.Six;

public class SixImpl implements Six {
    @Override
    public long findNb(long m) {
        for (int i = 1; i <= m; i++) {
            m -= (long) Math.pow(i, 3);
            if (m == 0) return (int) i;
        }
        return -1;
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
