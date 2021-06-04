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
        String[] cities = strng.split("\\n");
        double sum = 0.0;
        int counter = 0;
        for (String city : cities) {
            String[] data = city.split(":");
            if (data[0].equals(town)) {
                String[] months = data[1].split(",");
                for (String month : months) {
                    String[] values = month.split(" ");
                    sum += Double.parseDouble(values[1]);
                    counter++;
                }
            }
        }
        return (sum == 0) ? -1 : (sum / (double) counter);
    }

    @Override
    public double variance(String town, String strng) {
        double average = mean(town, strng);
        double variance = 0.0;
        String[] cities = strng.split("\\n");
        double sum = 0.0;
        int counter = 0;
        for (String city : cities) {
            String[] data = city.split(":");
            if (data[0].equals(town)) {
                String[] months = data[1].split(",");
                for (String month : months) {
                    String[] values = month.split(" ");
                    variance += Math.pow((average - Double.parseDouble(values[1])), 2);
                    counter++;
                }
            }
        }
        return (variance == 0) ? -1 : (variance / (double) counter);
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        if(resultSheet == ""){
            return "";
        }
        String s1 = resultSheet.replaceAll("([0-9.]) ","$1-");
        s1 = s1.replaceAll(" ([0-9.]*)(-)","_$1$2");
        String s2 = s1.replaceAll(" ([0-9.]*)(,)","_$1$2");
        s1 = s2.replaceAll(" ([0-9.]*)$","_$1");
        String [] p = s1.split(",");
        int wins = 0;
        int draws = 0;
        int lost = 0;
        int scored =0;
        int conceded =0;
        int points =0;
        boolean flag = false;
        if(toFind.equals("")){
            return "";
        }
        for (int i =0; i<p.length;i++ ) {
            String[] match = p[i].split("-");
            String[]left = match[0].split("_");
            String teamLeft = left[0];
            int pointsLeft =0;
            try {
                pointsLeft=Integer.parseInt(left[1]);
            }catch (NumberFormatException e){
                return "Error(float number):"+p[i].replaceAll("-"," ").replaceAll("_"," ");
            }
            String[] right = match[1].split("_");
            String teamRight = right[0];
            int pointsRight = 0;
            try {
                pointsRight=Integer.parseInt(right[1]);
            }catch (NumberFormatException e){
                return "Error(float number):"+p[i].replaceAll("-"," ").replaceAll("_"," ");
            }
            if(teamLeft.equalsIgnoreCase(toFind)){
                flag=true;
                if(pointsLeft>pointsRight){
                    wins++;
                    points+=3;
                    scored+=pointsLeft;
                    conceded+=pointsRight;
                }else if(pointsLeft==pointsRight){
                    draws++;
                    scored+=pointsLeft;
                    conceded+=pointsRight;
                    points++;
                }else{
                    lost++;
                    scored+=pointsLeft;
                    conceded+=pointsRight;
                }
            }
            if(teamRight.equalsIgnoreCase(toFind)){
                flag=true;
                if(pointsLeft<pointsRight){
                    wins++;
                    scored+=pointsRight;
                    conceded+=pointsLeft;
                    points+=3;
                }else if (pointsLeft==pointsRight){
                    draws++;
                    scored+=pointsRight;
                    conceded+=pointsLeft;
                    points++;
                }else{
                    lost++;
                    scored+=pointsRight;
                    conceded+=pointsLeft;
                }
            }

        }
        if(!flag){
            return toFind+":This team didn't play!";
        }
        return toFind+":W="+wins+";D="+draws+";L="+lost+";Scored="+scored+";Conceded="+conceded+";Points="+points;
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
