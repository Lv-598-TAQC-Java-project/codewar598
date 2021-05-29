package util;

import kata.Eight;
import kata.Five;
import kata.Seven;
import kata.Six;

import java.math.BigInteger;
import java.util.Arrays;

public class Runner {
    private Eight impl8;
    private Seven impl7;
    private Six impl6;
    private Five impl5;

    private Scanner sc;

    public UserNames getUser() {
        return user;
    }

    private UserNames user;


    public Runner(UserNames user) {
        sc = new ConsoleScanner();
        this.user = user;
        switch (user) {
            case OREST:
                impl8 = new kata.implementations.OrestTorskyi.EightImpl();
                impl7 = new kata.implementations.OrestTorskyi.SevenImpl();
                impl6 = new kata.implementations.OrestTorskyi.SixImpl();
                impl5 = new kata.implementations.OrestTorskyi.FiveImpl();
                break;
            case ALONA:
                impl8 = new kata.implementations.AlonaLutsenko.EightImplA();
                impl7 = new kata.implementations.AlonaLutsenko.SevenImplA();
                break;

            case OKSANA:
                impl8 = new kata.implementations.OksanaKalynivska.EightImp();
                impl7 = new kata.implementations.OksanaKalynivska.SevenImpl();
                impl6 = new kata.implementations.OksanaKalynivska.SixImpl();
                impl5 = new kata.implementations.OksanaKalynivska.FiveImpl();
                break;

            case OSTAP:
                break;
            case DMYTRO:
                impl8 = new kata.implementations.DmytroNahornyy.EightImpl();
                impl7 = new kata.implementations.DmytroNahornyy.SevenImpl();
                impl6 = new kata.implementations.DmytroNahornyy.SixImpl();
                impl5 = new kata.implementations.DmytroNahornyy.FiveImpl();
                break;

            case VIKTORIA:
                impl8 = new kata.implementations.VictoriaBadenko.EightImpl();
                impl7 = new kata.implementations.VictoriaBadenko.SevenImpl();
                impl6 = new kata.implementations.VictoriaBadenko.SixImpl();
                impl5 = new kata.implementations.VictoriaBadenko.FiveImpl();
                break;
            case ELVIRA:
                impl8 = new kata.implementations.ElviraStepaniuk.EightImpl();
                break;
            case VIKTORIASKIKUN:
                break;

        }

    }

    public void runTaskOne() {
        System.out.println("Run task keep hydrated: ");
        System.out.println("Enter double: ");
        double input = sc.readDouble();
        String res = String.valueOf(impl8.liters(input));
        System.out.println("Result: " + res);

    }

    public void runTask2() {
        System.out.println("Volume of a cuboid.");
        System.out.println("Please enter width of cuboid:");
        double width = sc.readDouble();
        System.out.println("Please enter length of cuboid:");
        double length = sc.readDouble();
        System.out.println("Please enter height of cuboid:");
        double height = sc.readDouble();
        String result = String.valueOf(impl8.getVolumeOfCuboid(length, width, height));
        System.out.println("Volume of cuboid = " + result);
    }

    public void runTask3() {
        System.out.println("Miles per gallon to kilometers per liter.\nEnter number of miles per gallon.");
        float mpg = sc.readFloat();
        String result = String.valueOf(impl8.mpgToKPM(mpg));
        System.out.println("It will be " + result + " kilometers per liter.");
    }

    public void runTask4() {
        System.out.println("To square root or no to square.\nEnter array of integers:");
        int[] numbersArray = sc.readArrayInt();
        int[] result = impl8.squareOrSquareRoot(numbersArray);
        System.out.println("Result: " + Arrays.toString(result));
    }

    public void runTask5() {
        System.out.println("Count of positives / sum of negatives");
        System.out.println("Enter array of integers:");
        int[] input = sc.readArrayInt();
        String result = Arrays.toString(impl8.countPositivesSumNegatives(input));
        System.out.println("Result: " + result);
    }

    public void runTask6() {
        System.out.println("Convert a String to a Number!\nEnter numbers please!");
        String line = sc.readString();
        int result = impl8.stringToNumber(line);
        System.out.println("Result: " + result);
    }

    public void runTask7() {
        System.out.println("Wilson primes.\nEnter a number to see if it's a Wilson prime: ");
        double number = sc.readDouble();
        boolean result = impl8.am_i_wilson(number);
        if (result) {
            System.out.println(number + " is Wilson prime.");
        } else System.out.println(number + " isn't Wilson prime.");
    }

    public void runTask8() {
        System.out.println("Formatting decimal places #0\nEnter a double value:");
        double value = sc.readDouble();
        double result = impl8.TwoDecimalPlaces(value);
        System.out.println("Result of rounding: " + result);
    }

    public void runTask9() {
        System.out.println("Find numbers which are divisible by given number\n");
        int[] numbers = sc.readArrayInt();
        System.out.println("Enter divisor:");
        int divisor = sc.readInt();
        int[] result = impl8.divisibleBy(numbers, divisor);
        System.out.println("Result: " + Arrays.toString(result));
    }

    public void runTask10() {
        System.out.println("Looking for a benefactor\nEnter what donations were made:");
        double[] donations = sc.readDoubleArray();
        System.out.println("Enter wanted average donation:");
        double averageDonation = sc.readDouble();
        long result = impl7.newAvg(donations, averageDonation);
        System.out.println("Result: " + result);
    }

    public void runTask11() {
        System.out.println("Sum of the first nth term of Series\nEnter a number:");
        int number = sc.readInt();
        String result = impl7.seriesSum(number);
        System.out.println("Result: " + result);

    }

    public void runTask12() {
        System.out.println("Where is Vasya?\nEnter how many people are in the line:");
        int numberOfPeople = sc.readInt();
        System.out.println("Enter number of people before Vasya:");
        int before = sc.readInt();
        System.out.println("Enter number of people after Vasya:");
        int after = sc.readInt();
        int result = impl7.whereIsHe(numberOfPeople, before, after);
        System.out.println("Number of possible positions: " + result);
    }

    public void runTask13() {
        System.out.println("Build a pile of Cubes.\nEnter volume of building:");
        long number = sc.readLong();
        String result = String.valueOf(impl6.findNb(number));
        System.out.println("Result: " + result);
    }

    public void runTask14() {

    }

    public void runTask15() {
        System.out.println("Floating-point Approximation (I)\nEnter double value:");
        double value = sc.readDouble();
        double result = impl6.f(value);
        System.out.println("Result: " + result);
    }

    public void runTask16() {


    }

    public void runTask17() {
        System.out.println("Ranking NBA.\nEnter a string with results of NBA teams:");
        String resultsOfNBA = sc.readString();
        System.out.println("Enter team name:");
        String teamToFind = sc.readString();
        String result = impl6.nbaCup(resultsOfNBA, teamToFind);

        System.out.println(result);
    }

    public void runTask18() {
        System.out.println("Help the bookseller !\nEnter an extract of a stocklist:");
        String[] stocklist = sc.readStringArray();
        System.out.println("Enter a list of categories in capital letters:");
        String[] categories = sc.readStringArray();
        System.out.println(impl6.stockSummary(stocklist, categories));
    }

    public void runTask19() {
    }

    public void runTask20() {
    }

    // Не відпрацьовує, хоча тести проходить.
    public void runTask21() {
        System.out.println("Please enter a number to calculate the number of trailing zeros \n" +
                "in a factorial of an entered number.");
        int number = sc.readInt();
        String result = String.valueOf(impl5.zeros(number));
        System.out.println("Result: " + result);
    }

    public void runTask22() {

    }

    public void runTask23() {
    }

    public void runTask24() {
    }
}
