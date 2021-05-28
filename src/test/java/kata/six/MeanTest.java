package kata.six;

import kata.Six;
import org.testng.annotations.Test;


public class MeanTest extends DataProviderForSix {
private Six six;

    @Test(dataProvider =  "implementationsSix")
    public void testMean(Six six) {
     //To Do...
    }

}