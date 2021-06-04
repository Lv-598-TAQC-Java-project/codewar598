package kata.seven;

import kata.DataProvider;
import kata.Seven;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeriesSumTest {
    @Test(dataProvider = "impl7", dataProviderClass = DataProvider.class)
    public void SeriesSum(Seven impl7) {

        String expectedResult ="1.61";
        String actualResult = impl7.seriesSum(4);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test(dataProvider = "impl7", dataProviderClass = DataProvider.class)
    public void SeriesSumZero(Seven impl7) {

        String expectedResult ="0.00";
        String actualResult = impl7.seriesSum(0);
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test(dataProvider = "impl7", dataProviderClass = DataProvider.class)
    public void SeriesSumNegative(Seven impl7) {

        String expectedResult ="0.00";
        String actualResult = impl7.seriesSum(-5);
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test(dataProvider = "impl7", dataProviderClass = DataProvider.class)
    public void SeriesSumBig(Seven impl7) {

        String expectedResult ="7.96";
        String actualResult = impl7.seriesSum(654546546);
        Assert.assertEquals(expectedResult, actualResult);
    }


}
