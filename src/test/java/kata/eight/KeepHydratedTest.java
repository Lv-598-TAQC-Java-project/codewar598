package kata.eight;

<<<<<<< HEAD
import kata.Eight;

import org.testng.Assert;

import org.testng.annotations.Test;

public class KeepHydratedTest  {

    private Eight eight;



    @Test(dataProvider = "create",dataProviderClass = DataProviderForEight.class)
    public void test_1_KeepHydrated(Eight eight) {
        double actualResult = eight.liters(2.0);
        Assert.assertEquals(1.0, actualResult);

    }
    @Test(dataProvider = "create",dataProviderClass = DataProviderForEight.class)
    public void test_2_KeepHydrated(Eight eight) {
        double actualResult = eight.liters(0.97);
        Assert.assertEquals(0.0, actualResult);
    }
    @Test(dataProvider = "create",dataProviderClass = DataProviderForEight.class)
    public void test_3_KeepHydrated(Eight eight) {
        double actualResult = eight.liters(1600.20);
        Assert.assertEquals(800.0, actualResult);
    }
    @Test(dataProvider = "create",dataProviderClass = DataProviderForEight.class)
    public void test_4_KeepHydrated(Eight eight) {
        double actualResult = eight.liters(80);
        Assert.assertEquals(40.0, actualResult);}
=======
import kata.DataProvider;
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
>>>>>>> main
}
