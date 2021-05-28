package kata.five;

import kata.Five;
import org.testng.annotations.Test;

public class PerimeterTest extends DataProviderForFive{
    private Five impl;

    @Test(dataProvider = "create",dataProviderClass = DataProviderForFive.class)
    public void testPerimeter(Five impl) {
        //To Do
    }
}