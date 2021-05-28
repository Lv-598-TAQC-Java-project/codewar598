package kata.six;

import kata.Six;
import org.testng.Assert;
import org.testng.annotations.Test;


public class BalanceTest extends DataProviderForSix {
private Six six;

    @Test(dataProvider =  "implementationsSix")
    public void testBalance(Six six) {
     //To Do...
    }

}