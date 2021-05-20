package util;

import kata.Eight;


public class Runner {
    private Eight impl8;
    private Scanner sc;

    public Runner(UserNames user) {
        sc = new ConsoleScanner();
        switch(user)
        {
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
    }

    public void runTask3() {
    }

    public void runTask4() {
    }

    public void runTask5() {
    }

    public void runTask6() {
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
