package kata.six;

import kata.DataProvider;
import kata.Six;
import org.testng.annotations.Test;


public class NBACupTest {
private Six six;

    @Test(dataProvider =  "impl6",dataProviderClass = DataProvider.class)
    public void testNBACup(Six six) {
     //To Do...
    }

}