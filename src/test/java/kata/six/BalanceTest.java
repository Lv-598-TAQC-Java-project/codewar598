package kata.six;

import kata.DataProvider;
import kata.Six;
import org.testng.annotations.Test;


public class BalanceTest  {
private Six six;

    @Test(dataProvider =  "impl6",dataProviderClass = DataProvider.class)
    public void testBalance(Six six) {
     //To Do...
    }

}