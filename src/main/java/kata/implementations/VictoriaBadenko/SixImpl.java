package kata.implementations.VictoriaBadenko;

import kata.Six;

import java.util.Arrays;

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
        String[] towns = strng.split("\n");
        Double sum = new Double(0.0);
        for (String townData : towns) {
            if (townData.startsWith(town + ":")) {
                String[] townRainfallByMonth = townData.substring(town.length()).split(",");
                for (String rain : townRainfallByMonth) {
                    String[] monthRain = rain.split(" ");
                    sum += Double.valueOf(monthRain[1]);
                }
                Double result = sum / 12.0;
                return result;
            }
        }
        return -1.0;
    }

    @Override
    public double variance(String town, String strng) {
        String[] towns = strng.split("\n");
        Double sum = new Double(0.0);
        for (String townData : towns) {
            if (townData.startsWith(town + ":")) {
                Double average = mean(town, strng);
                String[] townRainfallByMonth = townData.substring(town.length()).split(",");
                for (String rain : townRainfallByMonth) {
                    String[] monthRain = rain.split(" ");
                    Double diff = Double.valueOf(monthRain[1]) - average;
                    sum += (diff * diff);
                }
                return (sum / 12.0);
            }
        }
        return -1.0;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        int win = 0;
        int draw = 0;
        int lost = 0;
        int total = 0;
        int scoredPoints = 0;
        int concededPoints = 0;
        int rank = 0;

        if (toFind.equals(""))
            return "";

        String[] teamNameWords = toFind.split(" ");
        int teamNameWordsQuantity = teamNameWords.length;
        String teamNameFirstWord = teamNameWords[0];
        String teamNameLastWord = teamNameWords[teamNameWords.length - 1];

        String[] matches = resultSheet.split(",");
        for (String str : matches) {
            if (str.contains(toFind)) {
                String[] oneMatchWords = str.split(" ");

                int teamNameFirstWordIndex = Arrays.asList(oneMatchWords).indexOf(teamNameFirstWord);
                int findTeamPoints;
                int opponentPoints;

                if (str.contains("."))
                    return "Error(float number):" + str;

                if (teamNameFirstWordIndex == 0) {
                    findTeamPoints = Integer.parseInt(oneMatchWords[teamNameWordsQuantity]);
                    opponentPoints = Integer.parseInt(oneMatchWords[oneMatchWords.length - 1]);
                } else {
                    findTeamPoints = Integer.parseInt(oneMatchWords[oneMatchWords.length - 1]);
                    opponentPoints = Integer.parseInt(oneMatchWords[teamNameFirstWordIndex - 1]);
                }

                if (findTeamPoints == opponentPoints)
                    draw += 1;
                else if (findTeamPoints > opponentPoints)
                    win += 1;
                else
                    lost += 1;

                scoredPoints += findTeamPoints;
                concededPoints += opponentPoints;
            }
        }
        total = win + draw + lost;
        rank = 3 * win + 1 * draw;

        if (resultSheet.contains(toFind + " "))
            return toFind + ":W=" + win + ";D=" + draw + ";L=" + lost + ";Scored=" + scoredPoints + ";Conceded=" + concededPoints + ";Points=" + rank;
        else
            return toFind + ":This team didn't play!";
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
