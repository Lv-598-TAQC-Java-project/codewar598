package util;

import kata.Eight;
import kata.implementations.OrestTorskyi.EightImpl;

public class Runner {
    private Eight impl8;
    private Scanner sc;

    public Runner(UserNames user) {
        sc = new ConsoleScanner();
        switch(user)
        {
            case OREST:
                impl8 = new EightImpl();
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
}
