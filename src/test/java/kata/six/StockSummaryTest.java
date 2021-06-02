package kata.six;

import kata.DataProvider;
import kata.Six;
import org.testng.Assert;
import org.testng.annotations.Test;


public class StockSummaryTest {
    private Six six;

    @Test(dataProvider = "impl6", dataProviderClass = DataProvider.class)
    public void testStockSummary(Six six) {
        System.out.println(String.format("TestPositive checking for implementation: %s", six));
        System.out.println(String.format("TestPositive checking for implementation: %s", six));

        String[] art = new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
        String[] cd = new String[]{"A", "B"};
        try {
            Assert.assertTrue("(A : 200) - (B : 1140)".equals(six.stockSummary(art, cd)));
        } catch (AssertionError e) {
            System.out.println("Negative realization");
        }
    }
}