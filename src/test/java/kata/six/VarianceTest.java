package kata.six;

import kata.DataProvider;
import kata.Six;
import org.testng.annotations.Test;


public class VarianceTest  {
private Six six;

    @Test(dataProvider =  "impl6",dataProviderClass = DataProvider.class)
    public void testVariance(Six six) {
     //To Do...
    }

}