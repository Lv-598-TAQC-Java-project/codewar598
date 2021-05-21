package util;

import kata.Eight;


public class Runner {
    ConsoleScanner scanner = new ConsoleScanner();
    private Eight impl8;
    private final Scanner sc;

    public Runner(UserNames user) {
        sc = new ConsoleScanner();
        switch (user) {
            case OREST:
                impl8 = new kata.implementations.OrestTorskyi.EightImpl();
            case ALONA:
                impl8 = new kata.implementations.AlonaLutsenko.EightImpl();
            case OKSANA:

            case OSTAP:

            case DMYTRO:
                impl8 = new kata.implementations.DmytroNahornyy.EightImpl();
            case VIKTORIA:
                impl8 = new kata.implementations.VictoriaBadenko.EightImpl();
            case ELVIRA:
                impl8 = new kata.implementations.ElviraStepaniuk.EightImpl();
            case VIKTORIASKIKUN:


        }

    }

    public String runTaskOne() {
        System.out.println("Run task keep hydrated: ");
        System.out.println("Enter double: ");
        double input = sc.readDouble();
        String res = String.valueOf(impl8.liters(input));
        System.out.println("Result: " + res);
        return res;
    }

    public void runTask2() {
        System.out.println("Running Volume of cuboid:");
        System.out.println("Enter double number length:");
        double length = scanner.readDouble();
        System.out.println("Enter double number width:");
        double width = scanner.readDouble();
        System.out.println("Enter double number high:");
        double high = scanner.readDouble();
        String res = String.valueOf(impl8.getVolumeOfCuboid(length, width, high));
        System.out.println(res);
    }

    public void runTask3() {
        System.out.println("Running Miles per gallon to kilometers per liter:");
        System.out.println("Enter float number:");
        float input = scanner.readFloat();
        String res = String.valueOf(impl8.mpgToKPM(input));
        System.out.println(res);
    }

    public void runTask4() {
        System.out.println("To Square Root Or Not To Square Root:");
        System.out.println("Enter array of integers:");
        int[] input = scanner.readIntArray();
        String res = String.valueOf(impl8.squareOrSquareRoot(input));
        System.out.println(res);
    }

    public void runTask5() {
        System.out.println("Count Of Positives Sum Of Negatives :");
        System.out.println("Enter array of integers:");
        int[] input = scanner.readIntArray();
        String res = String.valueOf(impl8.countPositivesSumNegatives(input));
        System.out.println(res);
    }

    public void runTask6() {
        System.out.println("Convert A String To A Number");
        System.out.println("Enter a string which can parse to int: ");
        String input = scanner.readString();
        while (true) {
            try {
                Integer.valueOf(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Enter a string which can parse to int: ");
                input = scanner.readString();
            }
        }
        String res = String.valueOf(impl8.stringToNumber(input));
        System.out.println(res);
    }

    public void runTask7() {
    }

    public void runTask8() {
    }

    public void runTask9() {
    }

    public void runTask10() {
    }

    public void runTask11() {
    }

    public void runTask12() {
    }

    public void runTask13() {
    }

    public void runTask14() {
    }

    public void runTask15() {
    }

    public void runTask16() {
    }

    public void runTask17() {
    }

    public void runTask18() {
    }

    public void runTask19() {
    }

    public void runTask20() {
    }

    public void runTask21() {
    }

    public void runTask22() {
    }

    public void runTask23() {
    }

    public void runTask24() {
    }
}
