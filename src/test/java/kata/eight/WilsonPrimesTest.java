package kata.eight;

import kata.DataProvider;
import kata.Eight;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WilsonPrimesTest {


    @Test(dataProvider = "impl8", dataProviderClass = DataProvider.class)
    public void amIVilsonTest1(Eight impl8) {
        boolean exp = false;
        boolean actual = impl8.am_i_wilson(0);
        Assert.assertEquals(exp, actual);
    }

    @Test(dataProvider = "impl8", dataProviderClass = DataProvider.class)
    public void amIVilsonTest2(Eight impl8) {
        boolean exp = true;
        boolean actual = impl8.am_i_wilson(5);
        Assert.assertEquals(actual, exp);

    }

    @Test(dataProvider = "impl8", dataProviderClass = DataProvider.class)
    public void amIVilsonTest3(Eight impl8) {
        boolean exp = false;
        boolean actual = impl8.am_i_wilson(0);
        Assert.assertEquals(actual, exp);
    }

}
