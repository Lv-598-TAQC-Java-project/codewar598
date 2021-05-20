package util;

import com.sun.deploy.uitoolkit.ui.ConsoleController;

import java.math.BigInteger;

public class ConsoleScanner implements Scanner {
    private java.util.Scanner scanner;

    public ConsoleScanner() {
        scanner = new java.util.Scanner(System.in);
    }

    public int readInt() {
        while (true) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Incorrect format(int)! Try again!");
                scanner.next();
            }
        }
    }

    public long readLong() {
        while (true) {
            if (scanner.hasNextLong()) {
                return scanner.nextLong();
            } else {
                System.out.println("Incorrect format(long)! Try again!");
                scanner.next();
            }
        }
    }

    public int[] readArrayInt() {
        System.out.println("Enter size of array(int):");
        int[] array = new int[readInt()];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element №" + (i + 1));
            array[i] = readInt();
        }
        return array;
    }

    public float readFloat() {
        float sc = 0;
        if (scanner.hasNextFloat()) {
            sc = scanner.nextFloat();
        } else {
            scanner.next();
            readFloat();
        }
        return sc;
    }

    public double readDouble() {
        while (true) {
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.out.println("Incorrect format(double)! Try again!");
                scanner.next();
            }
        }
    }

    public double[] readDoubleArray() {
        System.out.println("Enter size of array(double):");
        double[] array = new double[readInt()];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element №" + (i + 1));
            array[i] = readDouble();
        }
        return array;
    }

    public String readString() {
        while (true) {
            if (scanner.hasNextLine()) {
                return scanner.nextLine();
            } else {
                System.out.println("Incorrect format(String)! Try again!");
                scanner.next();
            }
        }
    }

    public String[] readStringArray() {
        System.out.println("Enter size of array(String):");
        String[] array = new String[readInt()];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element №" + (i + 1));
            array[i] = readString();
        }
        return array;
    }

    public BigInteger readBigInteger() {
        while (true) {
            if (scanner.hasNextBigInteger()) {
                return scanner.nextBigInteger();
            } else {
                System.out.println("Incorrect format(BigInteger)! Try again!");
                scanner.next();
            }
        }
    }
}
