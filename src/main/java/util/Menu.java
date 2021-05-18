package util;

import kata.Eight;
import kata.implementations.OrestTorskyi.EightImpl;
import util.ConsoleScanner;
import util.Runner;
import util.Scanner;
import util.UserNames;

public class Menu {

    private Scanner sc = new ConsoleScanner();
    private Runner runner;

    public void showStudentList() {
        System.out.println("List of students: \n" +
                "1. Victoria Badenko\n" +
                "2. Oksana Kalynivska\n" +
                "3. Alyona Lutsenko\n" +
                "4. Ostap Nadiak\n" +
                "5. Dmytro Nahornyy\n" +
                "6. Elvira Stepaniuk\n" +
                "7. Orest Torskyi");
    }

    public void showTasks() {
        System.out.println("Tasks: \n" +
                "1. Keep Hydrated!\n" +
                "2. Volume of a cuboid\n" +
                "3. Miles per gallon to kilometers per liter\n" +
                "4. To square root or no to square\n" +
                "5. Count of positives / sum of negatives\n" +
                "6. Convert a String to a Number!\n" +
                "7. Willson primes");
    }

    public void mainMenu() {
        boolean activeTrue = true;
        while (activeTrue) {
            switch (sc.readInt()) {
                case 1:
                    showStudentList();
                    break;
                case 0:
                    activeTrue = false;
                case 2:
                    System.out.println("Enter id of user:");
                    int idStudent = sc.readInt();
                    setStudent(idStudent);
            }
        }
    }

    public void setTask() {
        int numberOfTask;
        switch (sc.readInt())
        {
            case 1:
                runner.runTaskOne();


        }
    }

    public Eight setStudent(int id) {

        switch (id) {
            case 1:
                runner = new Runner(UserNames.OREST);
        }
    }
}
