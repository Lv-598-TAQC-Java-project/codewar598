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
        String list = book.replaceAll("([^\\n. \\da-zA-Z])", "");
        String[] elements = list.split("[\\n]+");
        double current = Double.parseDouble(elements[0]);
        double summary = 0;
        int counter = 0;
        StringBuilder result = new StringBuilder();
        result.append("Original Balance: ").append(elements[0]);

        for (int i = 1; i < elements.length; i++) {
            counter++;
            String[] line = elements[i].split("[ ]+");
            current -= Double.parseDouble(line[2]);
            summary += Double.parseDouble(line[2]);
            String res = String.format("\\r\\n%s %s %s Balance %.2f", line[0], line[1], line[2], current);
            result.append(res);
        }

        result.append(String.format("\\r\\nTotal expense  %.2f\\r\\nAverage expense  %.2f", summary, summary / counter));
        return result.toString();
    }

    @Override
    public double f(double x) {
        return x / (1 + Math.sqrt(x + 1));
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

        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0){
            return "";
        }

        int sum;
        String result = "";

        for (String i : lstOf1stLetter) {
            sum = 0;
            for (String j : lstOfArt) {
                if (j.substring(0,1).equals(i)){
                    sum += Integer.parseInt((j.replaceAll("[^0-9]", "")));
                }
            }
            result += " - (" + i + " : " + sum + ")";
        }
        return result;

    }
}
