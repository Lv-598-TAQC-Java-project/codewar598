package kata.six;

import kata.Six;
import org.testng.annotations.Test;


public class FTest extends DataProviderForSix {
private Six six;

    @Test(dataProvider =  "implementationsSix")
    public void testF(Six six) {
     //To Do...
    }

}