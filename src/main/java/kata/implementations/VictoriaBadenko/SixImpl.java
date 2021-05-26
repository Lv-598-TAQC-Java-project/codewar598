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
        String str = book.replaceAll("([^\\n. \\da-zA-Z])", "");
        String[] arr = str.split("[\\n]+");
        double current = Double.parseDouble(arr[0]);
        double total = 0;
        int count = 0;
        StringBuilder result = new StringBuilder();
        result.append("Original Balance: " + arr[0]);
        for (int i = 1; i < arr.length; i++) {
            count++;
            String[] line = arr[i].split("[ ]+");
            current -= Double.parseDouble(line[2]);
            total += Double.parseDouble(line[2]);
            String s = String.format("\\r\\n%s %s %s Balance %.2f", line[0], line[1], line[2], current);
            result.append(s);
        }
        result.append(String.format("\\r\\nTotal expense  %.2f\\r\\nAverage expense  %.2f", total, total / count));
        return result.toString();
    }

    @Override
    public double f(double x) {
        return x / (1 + Math.sqrt(1 + x));
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
        String result = "";
        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0)
            return result;
        for (String letter : lstOf1stLetter) {
            int sum = 0;
            for (String code : lstOfArt) {
                if (letter.contains(code.substring(0, 1))) {
                    code = code.replaceAll("[^\\d.]", "");
                    sum += Integer.parseInt(code);
                }
            }
            result += "(" + letter + " : " + String.valueOf(sum) + ") - ";
        }
        return result.substring(0, result.length() - 3);
    }
}
