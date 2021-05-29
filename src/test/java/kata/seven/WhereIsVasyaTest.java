package kata.seven;

import kata.DataProvider;
import kata.Seven;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WhereIsVasyaTest {


    @Test(dataProvider = "impl7", dataProviderClass = DataProvider.class)
    public void whereIsHeTestForEquals(Seven impl7) {
        int expectedCountPositions = 2;
        Assert.assertEquals(impl7.whereIsHe(10, 3, 8), expectedCountPositions, "Incorrect values!");
    }

    @Test(dataProvider = "impl7", dataProviderClass = DataProvider.class)
    public void whereIsHeTestForFalse(Seven impl7) {
        int expectedCountPositions = 0;
        Assert.assertTrue(impl7.whereIsHe(10, 3, 11) == expectedCountPositions, "Not valid data!");
    }
}
