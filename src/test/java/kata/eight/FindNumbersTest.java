package kata.eight;

import kata.DataProvider;
import kata.Eight;

import org.testng.Assert;

import org.testng.annotations.Test;


public class FindNumbersTest {


    @Test(dataProvider = "impl8", dataProviderClass = DataProvider.class)
    public void testOne(Eight eight) {
        int[] expResult = new int[]{2, 4, 6};
        int[] actualResult = eight.divisibleBy(new int[]{1, 2, 3, 4, 5, 6}, 2);
        Assert.assertEquals(expResult, actualResult);
    }

    @Test(dataProvider = "impl8", dataProviderClass = DataProvider.class)
    public void testTwo(Eight eight) {
        int[] expResult = new int[]{3, 6};
        int[] actualResult = eight.divisibleBy(new int[]{1, 2, 3, 4, 5, 6}, 3);
        Assert.assertEquals(expResult, actualResult);
    }

    @Test(dataProvider = "impl8", dataProviderClass = DataProvider.class)
    public void testThree(Eight eight) {
        int[] expResult = new int[]{0, 4};
        int[] actualResult = eight.divisibleBy(new int[]{0, 1, 2, 3, 4, 5, 6}, 4);
        Assert.assertEquals(expResult, actualResult);
    }
}
