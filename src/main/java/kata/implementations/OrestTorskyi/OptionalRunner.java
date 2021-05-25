package kata.implementations.OrestTorskyi;

import kata.Five;
import kata.Seven;
import kata.Six;
import util.ConsoleScanner;
import util.Scanner;

import java.math.BigInteger;
import java.util.Arrays;

public class OptionalRunner {
    public static void main(String[] args) {
        Scanner sc = new ConsoleScanner();
        Seven impl7 = new SevenImpl();
        Six impl6 = new SixImpl();
        Five impl5 = new FiveImpl();
//        System.out.println("Enter info:");
//        System.out.println(impl7.whereIsHe(sc.readInt(), sc.readInt(), sc.readInt()));
//        System.out.println("Enter total volume:");
//        System.out.println(impl6.findNb(sc.readLong()));

        String data =
                "Rome:Jan 81.2,Feb 63.2,Mar 70.3,Apr 55.7,May 53.0,Jun 36.4,Jul 17.5,Aug 27.5,Sep 60.9,Oct 117.7,Nov 111.0,Dec 97.9" +
                        "\n" +
                        "London:Jan 48.0,Feb 38.9,Mar 39.9,Apr 42.2,May 47.3,Jun 52.1,Jul 59.5,Aug 57.2,Sep 55.4,Oct 62.0,Nov 59.0,Dec 52.9" +
                        "\n" +
                        "Paris:Jan 182.3,Feb 120.6,Mar 158.1,Apr 204.9,May 323.1,Jun 300.5,Jul 236.8,Aug 192.9,Sep 66.3,Oct 63.3,Nov 83.2,Dec 154.7" +
                        "\n" +
                        "NY:Jan 108.7,Feb 101.8,Mar 131.9,Apr 93.5,May 98.8,Jun 93.6,Jul 102.2,Aug 131.8,Sep 92.0,Oct 82.3,Nov 107.8,Dec 94.2" +
                        "\n" +
                        "Vancouver:Jan 145.7,Feb 121.4,Mar 102.3,Apr 69.2,May 55.8,Jun 47.1,Jul 31.3,Aug 37.0,Sep 59.6,Oct 116.3,Nov 154.6,Dec 171.5" +
                        "\n" +
                        "Sydney:Jan 103.4,Feb 111.0,Mar 131.3,Apr 129.7,May 123.0,Jun 129.2,Jul 102.8,Aug 80.3,Sep 69.3,Oct 82.6,Nov 81.4,Dec 78.2" +
                        "\n" +
                        "Bangkok:Jan 10.6,Feb 28.2,Mar 30.7,Apr 71.8,May 189.4,Jun 151.7,Jul 158.2,Aug 187.0,Sep 319.9,Oct 230.8,Nov 57.3,Dec 9.4" +
                        "\n" +
                        "Tokyo:Jan 49.9,Feb 71.5,Mar 106.4,Apr 129.2,May 144.0,Jun 176.0,Jul 135.6,Aug 148.5,Sep 216.4,Oct 194.1,Nov 95.6,Dec 54.4" +
                        "\n" +
                        "Beijing:Jan 3.9,Feb 4.7,Mar 8.2,Apr 18.4,May 33.0,Jun 78.1,Jul 224.3,Aug 170.0,Sep 58.4,Oct 18.0,Nov 9.3,Dec 2.7" +
                        "\n" +
                        "Lima:Jan 1.2,Feb 0.9,Mar 0.7,Apr 0.4,May 0.6,Jun 1.8,Jul 4.4,Aug 3.1,Sep 3.3,Oct 1.7,Nov 0.5,Dec 0.7";

        String data1 =
                "Rome:Jan 90.2,Feb 73.2,Mar 80.3,Apr 55.7,May 53.0,Jun 36.4,Jul 17.5,Aug 27.5,Sep 60.9,Oct 147.7,Nov 121.0,Dec 97.9" +
                        "\n" +
                        "London:Jan 58.0,Feb 38.9,Mar 49.9,Apr 42.2,May 67.3,Jun 52.1,Jul 59.5,Aug 77.2,Sep 55.4,Oct 62.0,Nov 69.0,Dec 52.9" +
                        "\n" +
                        "Paris:Jan 182.3,Feb 120.6,Mar 188.1,Apr 204.9,May 323.1,Jun 350.5,Jul 336.8,Aug 192.9,Sep 66.3,Oct 63.3,Nov 83.2,Dec 154.7" +
                        "\n" +
                        "NY:Jan 128.7,Feb 121.8,Mar 151.9,Apr 93.5,May 98.8,Jun 93.6,Jul 142.2,Aug 131.8,Sep 92.0,Oct 82.3,Nov 107.8,Dec 94.2" +
                        "\n" +
                        "Vancouver:Jan 155.7,Feb 121.4,Mar 132.3,Apr 69.2,May 85.8,Jun 47.1,Jul 31.3,Aug 37.0,Sep 69.6,Oct 116.3,Nov 154.6,Dec 171.5" +
                        "\n" +
                        "Sydney:Jan 123.4,Feb 111.0,Mar 151.3,Apr 129.7,May 123.0,Jun 159.2,Jul 102.8,Aug 90.3,Sep 69.3,Oct 82.6,Nov 81.4,Dec 78.2" +
                        "\n" +
                        "Bangkok:Jan 20.6,Feb 28.2,Mar 40.7,Apr 81.8,May 189.4,Jun 151.7,Jul 198.2,Aug 197.0,Sep 319.9,Oct 230.8,Nov 57.3,Dec 9.4" +
                        "\n" +
                        "Tokyo:Jan 59.9,Feb 81.5,Mar 106.4,Apr 139.2,May 144.0,Jun 186.0,Jul 155.6,Aug 148.5,Sep 216.4,Oct 194.1,Nov 95.6,Dec 54.4" +
                        "\n" +
                        "Beijing:Jan 13.9,Feb 14.7,Mar 18.2,Apr 18.4,May 43.0,Jun 88.1,Jul 224.3,Aug 170.0,Sep 58.4,Oct 38.0,Nov 19.3,Dec 2.7" +
                        "\n" +
                        "Lima:Jan 11.2,Feb 10.9,Mar 10.7,Apr 10.4,May 10.6,Jun 11.8,Jul 14.4,Aug 13.1,Sep 23.3,Oct 1.7,Nov 0.5,Dec 10.7";

//        System.out.println(impl6.mean("London", data));
//        System.out.println(impl6.variance("London", data));

//        String b1 = "1000.00!=\n125 Market    !=:125.45  \n126  Hardware  =34.95\n127 Video!  7.45\n128 Book  :14.32\n129 Gasoline ::16.10";
//        System.out.println(impl6.balance(b1));


//        String resultSheet1 = "Los Angeles Clippers 104 Dallas Mavericks 88,New York Knicks 101 Atlanta Hawks 112,Indiana Pacers 103 Memphis Grizzlies 112,"
//                + "Los Angeles Lakers 111 Minnesota Timberwolves 112,Phoenix Suns 95 Dallas Mavericks 111,Portland Trail Blazers 112 New Orleans Pelicans 94,"
//                + "Sacramento Kings 104 Los Angeles Clippers 111,Houston Rockets 85 Denver Nuggets 105,Memphis Grizzlies 76 Cleveland Cavaliers 106,"
//                + "Milwaukee Bucks 97 New York Knicks 122,Oklahoma City Thunder 112 San Antonio Spurs 106,Boston Celtics 112 Philadelphia 76ers 95,"
//                + "Brooklyn Nets 100 Chicago Bulls 115,Detroit Pistons 92 Utah Jazz 87,Miami Heat 104 Charlotte Hornets 94,"
//                + "Toronto Raptors 106 Indiana Pacers 99,Orlando Magic 87 Washington Wizards 88,Golden State Warriors 111 New Orleans Pelicans 95,"
//                + "Atlanta Hawks 94 Detroit Pistons 106,Chicago Bulls 97 Cleveland Cavaliers 95,";
//
//        String resultSheet2 = "San Antonio Spurs 111 Houston Rockets 86,Chicago Bulls 103 Dallas Mavericks 102,Minnesota Timberwolves 112 Milwaukee Bucks 108,"
//                + "New Orleans Pelicans 93 Miami Heat 90,Boston Celtics 81 Philadelphia 76ers 65,Detroit Pistons 115 Atlanta Hawks 87,"
//                + "Toronto Raptors 92 Washington Wizards 82,Orlando Magic 86 Memphis Grizzlies 76,Los Angeles Clippers 115 Portland Trail Blazers 109,"
//                + "Los Angeles Lakers 97 Golden State Warriors 136,Utah Jazz 98 Denver Nuggets 78,Boston Celtics 99 New York Knicks 85,"
//                + "Indiana Pacers 98 Charlotte Hornets 86,Dallas Mavericks 87 Phoenix Suns 99,Atlanta Hawks 81 Memphis Grizzlies 82,"
//                + "Miami Heat 110 Washington Wizards 105,Detroit Pistons 94 Charlotte Hornets 99,Orlando Magic 110 New Orleans Pelicans 107,"
//                + "Los Angeles Clippers 130 Golden State Warriors 95,Utah Jazz 102 Oklahoma City Thunder 113,San Antonio Spurs 84 Phoenix Suns 104,"
//                + "Chicago Bulls 103 Indiana Pacers 94,Milwaukee Bucks 106 Minnesota Timberwolves 88,Los Angeles Lakers 104 Portland Trail Blazers 102,"
//                + "Houston Rockets 120 New Orleans Pelicans 100,Boston Celtics 111 Brooklyn Nets 105,Charlotte Hornets 94 Chicago Bulls 86,Cleveland Cavaliers 103 Dallas Mavericks 97";
//        String resultSheet3 = resultSheet1 + resultSheet2;
//        System.out.println(impl6.nbaCup(resultSheet3, "Boston Celtics"));



//        String art[] = new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
//        String cd[] = new String[] {"A", "B"};
//        System.out.println(impl6.stockSummary(art,cd));


//        int[] value = new int[]{2};
//        System.out.println(impl5.artificialRain(value));

//       System.out.println(Arrays.toString(impl5.gap(10,100,200)));
//       System.out.println(impl5.zeros(1000));

        System.out.println(impl5.perimeter(new BigInteger("51085")));
    }

}
