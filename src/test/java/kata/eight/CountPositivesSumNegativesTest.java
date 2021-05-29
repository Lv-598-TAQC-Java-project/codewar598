package kata.eight;

import kata.DataProvider;
import kata.Eight;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CountPositivesSumNegativesTest {

    @Test(dataProvider = "impl8", dataProviderClass = DataProvider.class)
    public void testCountPositivesSumNegativesSimple(Eight impl8) {
        int[] exceptedResult = {10, -65};
        int[] actualResult = impl8.countPositivesSumNegatives(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15});
        Assert.assertEquals(exceptedResult, actualResult);
    }
    @Test(dataProvider = "impl8", dataProviderClass = DataProvider.class)
    public void testCountPositivesSumNegativesNegativeOnly(Eight impl8) {
        int[] exceptedResult = {0, -65};
        int[]actualResult = impl8.countPositivesSumNegatives(new int[]{ -11, -12, -13, -14, -15});
        Assert.assertEquals(exceptedResult, actualResult);
    }
    @Test(dataProvider = "impl8", dataProviderClass = DataProvider.class)
    public void testCountPositivesSumNPositiveOnly(Eight impl8) {
        int[] exceptedResult = {10, 0};
        int[]actualResult = impl8.countPositivesSumNegatives(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        Assert.assertEquals(exceptedResult, actualResult);
    }
    @Test(dataProvider = "impl8", dataProviderClass = DataProvider.class)
    public void testCountPositivesSumNegativesNull(Eight impl8) {
        int[] exceptedResult = {};
        int[]actualResult = impl8.countPositivesSumNegatives(new int[]{});
        Assert.assertEquals(exceptedResult, actualResult);
    }
}
