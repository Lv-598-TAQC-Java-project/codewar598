package kata.five;

import kata.DataProvider;
import kata.Five;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SolveSumTest {
    private Five impl;

    @Test(dataProvider = "impl5", dataProviderClass = DataProvider.class)
    public void testSolveSum(Five impl) {
        System.out.println(String.format("Checking for implementation: %s", impl));

        Assert.assertEquals(0.5,impl.solveSum(2.0),1e-12,
                String.format("Test %s failed!",impl.getClass()));
        Assert.assertEquals(0.7034648345913732,impl.solveSum(8.0),1e-12,
                String.format("Test %s failed!",impl.getClass()));
        Assert.assertEquals(6.096117967978e-01,impl.solveSum(4.0),1e-12,
                String.format("Test %s failed!",impl.getClass()));
    }
}