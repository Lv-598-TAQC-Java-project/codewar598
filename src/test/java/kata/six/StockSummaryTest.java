package kata.six;

import kata.DataProvider;
import kata.Six;
import org.testng.annotations.Test;


public class StockSummaryTest {
private Six six;

    @Test(dataProvider =  "impl6",dataProviderClass = DataProvider.class)
    public void testStockSummary(Six six) {
     //To Do...
    }

}