package kata.seven;

import kata.DataProvider;
import kata.Seven;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WhereIsVasyaTest {


    @Test(dataProvider = "impl7", dataProviderClass = DataProvider.class)
    public void whereIsHeTestForEquals(Seven impl7) {
        int expectedCountPositions = 2;
        Assert.assertEquals(impl7.whereIsHe(10, 8, 3), expectedCountPositions, "Incorrect values!");
    }

    @Test(dataProvider = "impl7", dataProviderClass = DataProvider.class)
    public void whereIsHeTestForFalse(Seven impl7) {
        int expectedCountPositions = 0;
        Assert.assertTrue(impl7.whereIsHe(10, 11, 3) == expectedCountPositions, "Not valid data!");
    }

    @Test(dataProvider = "impl7", dataProviderClass = DataProvider.class)
    public void whereIsHeTestForTrue(Seven impl7) {
        int expectedCountPositions = 3;
        Assert.assertTrue(impl7.whereIsHe(8, 3, 2) == expectedCountPositions, "Not valid data!");
    }
}
