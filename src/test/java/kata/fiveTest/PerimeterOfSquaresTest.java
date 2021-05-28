package kata.fiveTest;

import kata.Five;
import org.testng.Assert;
import org.testng.annotations.Test;

import kata.DataProvider;
import java.math.BigInteger;

public class PerimeterOfSquaresTest {
    @Test
    public void test1 () {
        Assert.assertTrue(true);
    }

    @Test(dataProvider = "impl5", dataProviderClass = DataProvider.class)
    public void perimeterOfSquaresBasic(Five impl5) {
        BigInteger numb = BigInteger.valueOf(7);
        Assert.assertEquals("216", impl5.perimeter(numb).toString());
    }

    @Test(dataProvider = "impl5", dataProviderClass = DataProvider.class)
    public void perimeterOfSquaresZero(Five impl5) {
        BigInteger numb = BigInteger.valueOf(0);
        Assert.assertEquals("4", impl5.perimeter(numb).toString());
    }

    @Test(dataProvider = "impl5", dataProviderClass = DataProvider.class)
    public void perimeterOfSquaresNegativeValue(Five impl5) {
        BigInteger numb = BigInteger.valueOf(-1);
        Assert.assertEquals("0", impl5.perimeter(numb).toString());
    }
}
