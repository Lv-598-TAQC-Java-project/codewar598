package kata.five;

import kata.Five;
import org.testng.annotations.Test;

public class SolveSumTest extends DataProviderForFive{
    private Five impl;

    @Test(dataProvider = "create",dataProviderClass = DataProviderForFive.class)
    public void testSolveSum(Five impl) {
        //To Do
    }
}