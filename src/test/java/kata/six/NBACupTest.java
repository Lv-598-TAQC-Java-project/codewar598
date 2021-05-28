package kata.six;

import kata.Six;
import org.testng.annotations.Test;


public class NBACupTest extends DataProviderForSix {
private Six six;

    @Test(dataProvider =  "implementationsSix")
    public void testNBACup(Six six) {
     //To Do...
    }

}