package kata.eight;


import kata.DataProvider;
import kata.Eight;

import org.testng.Assert;

import org.testng.annotations.Test;

public class KeepHydratedTest {


    @Test(dataProvider = "impl8", dataProviderClass = DataProvider.class)
    public void test_1_KeepHydrated(Eight eight) {
        double actualResult = eight.liters(2.0);
        Assert.assertEquals(1.0, actualResult);

    }

    @Test(dataProvider = "impl8", dataProviderClass = DataProvider.class)
    public void test_2_KeepHydrated(Eight eight) {
        double actualResult = eight.liters(0.97);
        Assert.assertEquals(0.0, actualResult);
    }

    @Test(dataProvider = "impl8", dataProviderClass = DataProvider.class)
    public void test_3_KeepHydrated(Eight eight) {
        double actualResult = eight.liters(1600.20);
        Assert.assertEquals(800.0, actualResult);
    }

    @Test(dataProvider = "impl8", dataProviderClass = DataProvider.class)
    public void test_4_KeepHydrated(Eight eight) {
        double actualResult = eight.liters(80);
        Assert.assertEquals(40.0, actualResult);
    }
}


