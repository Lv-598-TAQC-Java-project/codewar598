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
        return null;
    }
}
