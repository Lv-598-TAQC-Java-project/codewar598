package kata.five;

import kata.Five;
import org.testng.annotations.Test;

public class SmallestTest extends DataProviderForFive{
    private Five impl;

    @Test(dataProvider = "create",dataProviderClass = DataProviderForFive.class)
    public void testSmallest(Five impl) {
        //To Do
    }
}