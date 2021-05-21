package kata.implementations.OrestTorskyi;

import kata.Six;

import java.util.ArrayList;
import java.util.List;

public class SixImpl implements Six {
@Override
    public long findNb(long m) {
        long count = 0;
        int i = 1;
        while (count < m) {
            count += Math.pow(i, 3);
            i++;
        }
        return count == m ? i - 1 : -1;
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
