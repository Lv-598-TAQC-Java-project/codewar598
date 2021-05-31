package util;

public class Menu {

    private final Scanner sc = new ConsoleScanner();
    private Runner runner;

    private static Menu instance;

    public static Menu getInstance() {
        if (instance == null) {
            instance = new Menu();
        }
        return instance;
    }

    public void showStudentList() {
        UserNames[] userNames = UserNames.values();
        for (UserNames u: userNames) {
            System.out.println(u.getId()+". "+ u.getStudentName());
        }
    }

    public void showTasks() {
        System.out.println("Tasks: \n" +
                "1. Keep Hydrated!\n" +
                "2. Volume of a cuboid\n" +
                "3. Miles per gallon to kilometers per liter\n" +
                "4. To square root or no to square\n" +
                "5. Count of positives / sum of negatives\n" +
                "6. Convert a String to a Number!\n" +
                "7. Willson primes\n"+
                "8. Formatting decimal places\n"+
                "9. Find numbers which are divisible by given number\n"+
                "10. Looking for a benefactor\n"+
                "11. Sum of the first nth term of Series\n"+
                "12. Where is Vasya?\n"+
                "13. Build a pile of Cubes\n"+
                "14. Easy balance checking\n"+
                "15. Floating-point Approximation (I)\n"+
                "16. Rainfall\n"+
                "17. Ranking NBA\n"+
                "18. Help the bookseller!\n"+
                "19. Artificial Rain\n"+
                "20. Gap in Primes\n"+
                "21. Trailing zeros in factorial\n"+
                "22. Perimeter of squares in a rectangle\n"+
                "23. Which x for that sum?\n"+
                "24. Find the smallest\n");
    }

    public void mainMenu() {
        boolean activeTrue = true;
        while (activeTrue) {
            if (runner != null){
                System.out.println(runner.getUser());
            }
            System.out.println(" 0 - exit\n 1 - show user name\n 2 - set user\n 3 - show task\n 4 - run task");
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
                case 3:
                    showTasks();
                    break;
                case 4:
                    System.out.println("Enter number of task:");
                    int numberOfTask = sc.readInt();
                    runTask(numberOfTask);

            }
        }
    }


    public void runTask(int task) {
        try {
            switch (task) {
                case 1:
                    runner.runTaskOne();
                case 2:
                    runner.runTask2();
                    break;
                case 3:
                    runner.runTask3();
                    break;
                case 4:
                    runner.runTask4();
                    break;
                case 5:
                    runner.runTask5();
                    break;
                case 6:
                    runner.runTask6();
                    break;
                case 7:
                    runner.runTask7();
                    break;
                case 8:
                    runner.runTask8();
                    break;
                case 9:
                    runner.runTask9();
                    break;
                case 10:
                    runner.runTask10();
                    break;
                case 11:
                    runner.runTask11();
                    break;
                case 12:
                    runner.runTask12();
                    break;
                case 13:
                    runner.runTask13();
                    break;
                case 14:
                    runner.runTask14();
                    break;
                case 15:
                    runner.runTask15();
                    break;
                case 16:
                    runner.runTask16();
                    break;
                case 17:
                    runner.runTask17();
                    break;
                case 18:
                    runner.runTask18();
                    break;
                case 19:
                    runner.runTask19();
                    break;
                case 20:
                    runner.runTask20();
                    break;
                case 21:
                    runner.runTask21();
                    break;
                case 22:
                    runner.runTask22();
                    break;
                case 23:
                    runner.runTask23();
                    break;
                case 24:
                    runner.runTask24();
                    break;
                default:
                    System.out.println("Please, enter number of task from 1 to 24!");
                    break;
            }
        } catch (NullPointerException exception) {
            System.out.println("Please, set user first!");
        }
    }
    public void setStudent(int id) {
        runner = new Runner(UserNames.getById(id));

    }
}
