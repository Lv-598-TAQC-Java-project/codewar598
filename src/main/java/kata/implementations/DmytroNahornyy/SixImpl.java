package kata.implementations.DmytroNahornyy;

import kata.Six;

public class SixImpl implements Six {
    @Override
    public long findNb(long m) {
        long count = 0;
        long volume = 0;
        while (volume < m) {
            count++;
            volume += count * count * count;
        }
        if (volume == m) {
            return count;
        }
        return -1;
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
        if (town == null || town.length() == 0 || string == null || string.length() == 0) return -1;
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
                sum += j.substring(0,1).equals(i) ? Integer.parseInt(j.replaceAll("[^0-9]","")) : 0;
            }
            result += " - (" + i + " : " + sum + ")";
        }

        return result.substring(3);
    }
}
