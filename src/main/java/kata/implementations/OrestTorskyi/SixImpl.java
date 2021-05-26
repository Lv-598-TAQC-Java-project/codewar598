package kata.implementations.OrestTorskyi;

import kata.Six;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

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


    public double f(double x) {
        BigDecimal a = new BigDecimal(Math.sqrt(x + 1));
        BigDecimal c = a.subtract(BigDecimal.valueOf(1));
        double resultNumber = c.doubleValue();
        return resultNumber;
    }


    public double mean(String town, String strng) {
        double[] values = getValues(town, strng);
        return values == null ? -1 : calculateAvg(values);
    }

    private double[] getValues(String town, String strng) {
        String townData;
        String regex = "[A-Z]*[a-z]*[,]*[:]*";
        double sum = 0;
        int indexOfTown = strng.indexOf(town);
        if (indexOfTown == -1) {
            return null;
        }
        int i = indexOfTown;
        while (strng.charAt(i) != '\n') {
            i++;
        }
        townData = strng.substring(indexOfTown, i);
        townData = townData.replaceAll(regex, "");
        String[] values = townData.trim().split(" ");
        double[] arrayResult = new double[values.length];
        for (int j = 0; j < arrayResult.length; j++) {
            arrayResult[j] = Double.parseDouble(values[j]);
        }
        return arrayResult;
    }

    private double calculateAvg(double[] values) {
        double sum = 0;
        for (double i : values) {
            sum += i;
        }
        return sum / values.length;
    }

    private double calculateDispersion(double[] values) {
        double sum = 0;
        double valueAvg = calculateAvg(values);
        for (double i : values) {
            sum += Math.pow(i - valueAvg, 2);
        }
        return sum / values.length;
    }

    public double variance(String town, String strng) {
        double[] values = getValues(town, strng);
        return values == null ? -1 : calculateDispersion(values);
    }


    public String nbaCup(String resultSheet, String toFind) {
        if (toFind == "") {
            return "";
        }
        List<String> teamMatches = getTeamMatches(resultSheet, toFind);
        if (teamMatches.size() == 0) {
            return toFind + ":This team didn't play!";
        }
        List<Integer> teamResults = getTeamResults(teamMatches, toFind);
        if (teamResults.size() == 1) {
            return "Error(float number):" + teamMatches.get(teamResults.get(0));
        }
        String results = toFind + ":W=" + teamResults.get(0) + ";D=" + teamResults.get(1) + ";L=" + teamResults.get(2)
                + ";Scored=" + teamResults.get(3) + ";Conceded=" + teamResults.get(4) + ";Points=" + teamResults.get(5);
        return results;
    }

    private List<String> getTeamMatches(String resultSheet, String team) {
        String[] allMatches = resultSheet.split(",");
        List<String> teamMatches = new LinkedList<>();
        for (String match : allMatches) {
            if (match.matches("(.*)" + team + "(.*)")) {
                teamMatches.add(match);
            } else {
                continue;
            }
        }
        return teamMatches;
    }

    private List<Integer> getTeamResults(List<String> teamMatches, String team) {
        int wins = 0, draws = 0, loses = 0, scoreCounter = 0, concededCounter = 0, points = 0, requestedTeam = 0, anotherTeam = 0;
        String[] strScores;
        String regex = "[^0-9 .]+";
        int[] teamScores;
        List<Integer> resultList = new LinkedList<>();

        for (int i = 0; i < teamMatches.size(); i++) {
            strScores = teamMatches.get(i).replaceAll(regex, "").replaceAll("[ ]+", " ").trim().split(" ");
            teamScores = convertStringToIntArray(strScores);
            if (teamScores == null) {
                resultList.add(i);
                return resultList;
            }
            if (teamMatches.get(i).indexOf(team) == 0) {
                anotherTeam = 1;
            } else {
                requestedTeam = 1;
            }
            scoreCounter += teamScores[requestedTeam];
            concededCounter += teamScores[anotherTeam];
            if (teamScores[requestedTeam] == teamScores[anotherTeam]) {
                draws++;
            } else if (teamScores[requestedTeam] > teamScores[anotherTeam]) {
                wins++;
            } else {
                loses++;
            }
            requestedTeam = 0;
            anotherTeam = 0;
        }
        points = wins * 3 + draws * 1;
        resultList.add(wins);
        resultList.add(draws);
        resultList.add(loses);
        resultList.add(scoreCounter);
        resultList.add(concededCounter);
        resultList.add(points);

        return resultList;
    }

    private int[] convertStringToIntArray(String[] str) {
        int[] arrayResult = new int[str.length];
        for (int i = 0; i < arrayResult.length; i++) {
            if (Double.parseDouble(str[i]) % 1 == 0) {
                arrayResult[i] = Integer.parseInt(str[i]);
            } else {
                return null;
            }
        }
        return arrayResult;
    }

    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if(lstOfArt.length == 0 || lstOf1stLetter.length == 0) { return ""; }
        Map<String, Integer> bookList = getBookList(lstOfArt);
        return getNumberOfBooks(bookList, lstOf1stLetter);
    }

    private Map<String, Integer> getBookList(String[] lstOfArt) {
        Map<String, Integer> bookList = new HashMap<>();
        String[] str;
        for (String book : lstOfArt) {
            str = book.split(" ");
            bookList.put(str[0], Integer.parseInt(str[1]));
        }
        return bookList;
    }

    private String getNumberOfBooks(Map<String, Integer> bookList, String[] lstOf1stLetter) {
        Map<String, Integer> mapResult = new HashMap<>();
        int count = 0;
        for (String category : lstOf1stLetter) {
            for (Map.Entry<String, Integer> entry : bookList.entrySet()) {
                if (category.charAt(0) == entry.getKey().charAt(0)) {
                    count += entry.getValue();
                }
            }
            mapResult.put(category, count);
            count = 0;
        }
        return printNumberOfBooks(mapResult);
    }

    private String printNumberOfBooks(Map<String, Integer> mapResult) {
        StringBuffer str = new StringBuffer();
        int i = 0;
        for (Map.Entry<String, Integer> entry : mapResult.entrySet()) {
            str = str.append("(" + entry.getKey() + " : " + entry.getValue() + ")");
            if (i < mapResult.size() - 1) {
                str.append(" - ");
                i++;
            } else {
                break;
            }
        }
        return str.toString();
    }
}
