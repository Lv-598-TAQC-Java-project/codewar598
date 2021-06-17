package kata.implementations.ViktoriaSkikun;

import kata.Six;

import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public class SixImpl implements Six {

    @Override
    public long findNb(long m) {
        long volume = 0;
        long n = 1;

        while (volume < m) {
            volume += Math.pow(n, 3);
            n++;
        }
        if (volume == m) {
            return n - 1;
        } else {
            return -1;
        }
    }

    @Override
    public String balance(String book) {
        String regex = "[^A-Za-z0-9. \n]*";
        book = book.replaceAll(regex, "");
        book = book.replaceAll("[ ]+", " ");
        String formattedBook = getFormattedBook(book, getPrices(book));
        return formattedBook;
    }

    private List<Double> getPrices(String book) {
        String regex = "^[0-9]+\\.[0-9]+$";
        List<Double> costsList = new LinkedList<>();
        String[] costs = book.trim().split(" |\n");
        for (String i : costs) {
            if (i.matches(regex)) {
                costsList.add(Double.parseDouble(i));
            } else {
                continue;
            }
        }
        return costsList;
    }

    private double calculateTotal(List<Double> array) {
        double sum = 0;
        for (Double i : array) {
            sum += i;
        }
        return sum;
    }

    private double calculateAvg(List<Double> array) {
        double sum = calculateTotal(array);
        return sum / array.size();
    }

    private String getFormattedBook(String book, List<Double> valueList) {
        String[] bookRecords = book.split("\n");
        String bookResult = "Original Balance: ";
        double total = valueList.get(0);
        bookResult = bookResult.concat(String.format("%.2f", total)).concat("\r\n");
        for (int i = 1; i < bookRecords.length; i++) {
            total -= valueList.get(i);
            bookResult = bookResult.concat(bookRecords[i]).trim().concat(" Balance ").concat(String.format("%.2f", total)).concat("\r\n");
        }

        valueList.remove(0);
        bookResult = bookResult.concat("Total expense  ").concat(String.format("%.2f", calculateTotal(valueList))).concat("\r\n");
        bookResult = bookResult.concat("Average expense  ").concat(String.format("%.2f", calculateAvg(valueList)));
        return bookResult;
    }

    @Override
    public double f(double x) {
        return x / (1 + Math.sqrt(x + 1));
    }

    @Override
    public double mean(String town, String strng) {
        if (town == null || town.length() == 0 || strng == null || strng.length() == 0) return -1;
        final String s = town + ":";
        final String[] a = strng.split("\n");
        String[] recs = null;
        int l;
        double sum = 0;

        for (String str : a) {
            if (str.startsWith(s)) {
                recs = str.split(":")[1].split(",");
                break;
            }
        }

        if (recs == null || recs.length == 0) return -1;

        l = recs.length;

        for (int i = 0; i < l; i++) {
            sum += Double.parseDouble(recs[i].split(" ")[1]);
        }
        return sum / l;
    }

    @Override
    public double variance(String town, String string) {
        if (town == null || town.length() == 0 || string == null || string.length() == 0) {
            return -1;
        }

        final String s = town + ":";
        final String[] a = string.split("\n");
        String[] recs = null;
        double[] vals = null;
        int l;
        double temp;
        double sum = 0;

        for (String str : a) {
            if (str.startsWith(s)) {
                recs = str.split(":")[1].split(",");
                break;
            }
        }

        if (recs == null || recs.length == 0) return -1;

        l = recs.length;
        vals = new double[l];

        for (int i = 0; i < l; i++) {
            vals[i] = temp = Double.parseDouble(recs[i].split(" ")[1]);
            sum += temp;
        }

        temp = sum / l;
        sum = 0;
        for (int i = 0; i < l; i++) {
            sum += Math.pow(vals[i] - temp, 2);
        }
        temp = Math.sqrt(sum / l);

        return temp * temp;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        if (resultSheet == "") {
            return "";
        }

        String s1 = resultSheet.replaceAll("([0-9.]) ", "$1-");
        s1 = s1.replaceAll(" ([0-9.]*)(-)", "_$1$2");
        String s2 = s1.replaceAll(" ([0-9.]*)(,)", "_$1$2");
        s1 = s2.replaceAll(" ([0-9.]*)$", "_$1");
        String[] p = s1.split(",");
        int wins = 0;
        int draws = 0;
        int lost = 0;
        int scored = 0;
        int conceded = 0;
        int points = 0;
        boolean flag = false;

        if (toFind.equals("")) {
            return "";
        }

        for (int i = 0; i < p.length; i++) {
            String[] match = p[i].split("-");
            String[] left = match[0].split("_");
            String teamLeft = left[0];
            int pointsLeft = 0;
            try {
                pointsLeft = Integer.parseInt(left[1]);
            } catch (NumberFormatException e) {
                return "Error(float number):" + p[i].replaceAll("-", " ").replaceAll("_", " ");
            }
            String[] right = match[1].split("_");
            String teamRight = right[0];
            int pointsRight = 0;
            try {
                pointsRight = Integer.parseInt(right[1]);
            } catch (NumberFormatException e) {
                return "Error(float number):" + p[i].replaceAll("-", " ").replaceAll("_", " ");
            }
            if (teamLeft.equalsIgnoreCase(toFind)) {
                flag = true;
                if (pointsLeft > pointsRight) {
                    wins++;
                    points += 3;
                    scored += pointsLeft;
                    conceded += pointsRight;
                } else if (pointsLeft == pointsRight) {
                    draws++;
                    scored += pointsLeft;
                    conceded += pointsRight;
                    points++;
                } else {
                    lost++;
                    scored += pointsLeft;
                    conceded += pointsRight;
                }
            }
            if (teamRight.equalsIgnoreCase(toFind)) {
                flag = true;
                if (pointsLeft < pointsRight) {
                    wins++;
                    scored += pointsRight;
                    conceded += pointsLeft;
                    points += 3;
                } else if (pointsLeft == pointsRight) {
                    draws++;
                    scored += pointsRight;
                    conceded += pointsLeft;
                    points++;
                } else {
                    lost++;
                    scored += pointsRight;
                    conceded += pointsLeft;
                }
            }

        }
        if (!flag) {
            return toFind + ":This team didn't play!";
        }
        return toFind + ":W=" + wins + ";D=" + draws + ";L=" + lost + ";Scored=" + scored + ";Conceded=" + conceded + ";Points=" + points;
    }


    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0) {
            return "";
        }

        int sum;
        String result = "";

        for (String i : lstOf1stLetter) {
            sum = 0;
            for (String j : lstOfArt) {
                if (j.substring(0, 1).equals(i)) {
                    sum += Integer.parseInt((j.replaceAll("[^0-9]", "")));
                }
            }
            result += " - (" + i + " : " + sum + ")";
        }
        return result;
    }
}
