package kata.six;

import kata.Six;
import org.testng.annotations.Test;


public class StockSummaryTest extends DataProviderForSix {
private Six six;

    @Test(dataProvider =  "implementationsSix")
    public void testStockSummary(Six six) {
     //To Do...
    }

}