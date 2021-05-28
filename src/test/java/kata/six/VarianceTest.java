package kata.six;

import kata.Six;
import org.testng.annotations.Test;


public class VarianceTest extends DataProviderForSix {
private Six six;

    @Test(dataProvider =  "implementationsSix")
    public void testVariance(Six six) {
     //To Do...
    }

}