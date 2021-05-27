package Impl.Eight;

import Impl.DataProvider;
import kata.Eight;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KeepHydratedTest {

    @Test(dataProvider = "impl8", dataProviderClass = DataProvider.class)
    public void testLiters(Eight impl8) {
        int expectedResult = 3;
        int actualResult = impl8.liters(6.7);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test(dataProvider = "impl8", dataProviderClass = DataProvider.class)
    public void testLitersZero(Eight impl8) {
        int expectedResult = 0;
        int actualResult = impl8.liters(0);
        Assert.assertEquals(expectedResult,actualResult);
    }
}
