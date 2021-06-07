package kata.five;

import kata.DataProvider;
import kata.Five;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ZerosTest {
    private Five impl;

    @Test(dataProvider = "impl5",dataProviderClass = DataProvider.class)
    public void testZeros(Five impl) {
            int expectedResult = 2;
            int actualResult = impl.zeros(14);
        Assert.assertEquals(actualResult,expectedResult);
    }
}