package kata.five;

import kata.DataProvider;
import kata.Five;
import org.testng.annotations.Test;

public class SolveSumTest {
    private Five impl;

    @Test(dataProvider = "impl5",dataProviderClass = DataProvider.class)
    public void testSolveSum(Five impl) {
        //To Do
    }
}