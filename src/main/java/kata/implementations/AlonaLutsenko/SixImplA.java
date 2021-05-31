package kata.implementations.AlonaLutsenko;

import kata.Six;

import java.util.HashMap;
import java.util.Map;

public class SixImplA implements Six {

    @Override
    public long findNb(long m) {
        long n = 1;
        long volume = 0;
        while (volume < m) {
            volume += n * n * n;
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
        String s = book.replaceAll("([^\\n. \\da-zA-Z])", "");
        String[] array = s.split("[\\n]+");
        double current = Double.parseDouble(array[0]);
        double ttl = 0;
        int counter = 0;
        StringBuilder result = new StringBuilder();
        result.append("Original Balance: ").append(array[0]);

        for (int i = 1; i < array.length; i++) {
            counter++;
            String[] line = array[i].split("[ ]+");
            current -= Double.parseDouble(line[2]);
            ttl += Double.parseDouble(line[2]);
            String res = String.format("\\r\\n%s %s %s Balance %.2f", line[0], line[1], line[2], current);
            result.append(res);
        }

        result.append(String.format("\\r\\nTotal expense  %.2f\\r\\nAverage expense  %.2f", ttl, ttl / counter));
        return result.toString();
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
        String[] str1 = null;
        int l;
        double sum = 0;

        for (String str : a) {
            if (str.startsWith(s)) {
                str1 = str.split(":")[1].split(",");
                break;
            }
        }
        if (str1 == null || str1.length == 0) return -1;

        l = str1.length;
        for (int i = 0; i < l; i++) {
            sum += Double.parseDouble(str1[i].split(" ")[1]);
        }

        return sum / l;
    }

    @Override
    public double variance(String town, String strng) {
        if (town == null || town.length() == 0 || strng == null || strng.length() == 0) return -1;
        final String s = town + ":";
        final String[] a = strng.split("\n");
        String[] str1 = null;
        double[] vals;
        int l;
        double temp;
        double sum = 0;

        for (String str : a) {
            if (str.startsWith(s)) {
                str1 = str.split(":")[1].split(",");
                break;
            }
        }
        if (str1 == null || str1.length == 0) return -1;

        l = str1.length;
        vals = new double[l];
        for (int i = 0; i < l; i++) {
            vals[i] = temp = Double.parseDouble(str1[i].split(" ")[1]);
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
        int won = 0;
        int draw = 0;
        int lose = 0;
        int pt = 0;
        int pl = 0;
        int mk = 0;

        if (toFind.equals("")) {
            return "";
        }
        boolean found = false;
        String s = resultSheet.replaceAll("([0-9.]) ", "$1-");
        s = s.replaceAll(" ([0-9.]*)(-)", "_$1$2").replaceAll(" ([0-9.]*)(,)", "_$1$2").replaceAll(" ([0-9.]*)$", "_$1");
        String[] p = s.split(",");

        for (int i = 0; i < p.length; i++) {
            String[] match = p[i].split("-");
            String[] matchA = match[0].split("_");
            String teamA = matchA[0];
            int pointsA = -1;

            try {
                pointsA = Integer.parseInt(matchA[1]);
            } catch (Exception e) {
                return "Error (float number):" + p[i].replaceAll("-", " ").replaceAll("_", " ");
            }

            String[] matchB = match[1].split("_");
            String teamB = matchB[0];
            int pointsB = -1;

            try {
                pointsB = Integer.parseInt(matchB[1]);
            } catch (Exception e) {
                return "Error(float number):" + p[i].replaceAll("-", " ").replaceAll("_", " ");
            }

            if (teamA.equals(toFind)) {
                found = true;
                if (pointsA > pointsB) {
                    won++;
                    mk += 3;
                } else if (pointsA == pointsB) {
                    draw++;
                    mk += 1;
                } else {
                    lose++;
                }
                pt += pointsA;
                pl += pointsB;
            }

            if (teamB.equals(toFind)) {
                found = true;
                if (pointsB > pointsA) {
                    won++;
                    mk += 3;
                } else if (pointsA == pointsB) {
                    draw++;
                    mk += 1;
                } else {
                    lose++;
                }
                pt += pointsB;
                pl += pointsA;
            }
        }

        if (!found) {
            return toFind + ":This team didn't play!";
        }
        return toFind + ":W=" + won + ";D=" + draw + ";L=" + lose + ";Scored=" + pt + ";Conceded=" + pl + ";Points=" + mk;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0) {
            return "";
        }
        String result = "";
        Map<String, Integer> dictionary = new HashMap<String, Integer>();
        for (String category : lstOf1stLetter) {
            dictionary.put(category, 0);
        }
        for (String art : lstOfArt) {
            String key = Character.toString(art.charAt(0));
            if (dictionary.containsKey(key)) {
                int value = dictionary.get(key);
                int smth = Integer.parseInt(art.substring(art.indexOf(" ") + 1));
                dictionary.put(key, value + smth);
            }
        }
        for (Map.Entry<String, Integer> item : dictionary.entrySet()) {
            result += String.format("(%s : %d) - ", item.getKey(), item.getValue());
        }
        return result.substring(0, result.length() - 3);
    }
}
