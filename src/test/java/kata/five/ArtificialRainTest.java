package kata.five;

import kata.DataProvider;
import kata.Five;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArtificialRainTest {
    private Five impl;

    @Test(dataProvider = "impl5",dataProviderClass = DataProvider.class)
    public void testArtificialRain(Five impl5) {
        int expectedResult = 3 ;
        int actualResult = impl5.artificialRain(new int[]{1,2,1});
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test(dataProvider = "impl5",dataProviderClass = DataProvider.class)
    public void testArtificialRainZero(Five impl5) {
        int expectedResult = 0 ;
        int actualResult = impl5.artificialRain(new int[]{0});
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test(dataProvider = "impl5",dataProviderClass = DataProvider.class)
    public void testArtificialRainNegative(Five impl5) {
        int expectedResult = 3 ;
        int actualResult = impl5.artificialRain(new int[]{-1,-2,-3});
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test(dataProvider = "impl5",dataProviderClass = DataProvider.class)
    public void testArtificialRainBig(Five impl5) {
        int expectedResult = 5 ;
        int actualResult = impl5.artificialRain(new int[]{165465,23543,353453,654345,456466,4646,5465,46546546,465465465,4654,65465,465,4,654,65,46546565});
        Assert.assertEquals(expectedResult,actualResult);
    }


}