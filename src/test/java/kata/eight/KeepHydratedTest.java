package kata.eight;

import kata.Eight;

import org.testng.Assert;

import org.testng.annotations.Test;

public class KeepHydratedTest  {

    private Eight eight;

//
//    @DataProvider(name = "test1")
//    public Object[][] dataProviderMethod() {
//        return new Object[][]{
//                {new Double(2.0)},
//                {new Double(0.97)},
//                {new Double(14.64)},
//                {new Double(1600.20)}
//        };
//    }
//
//
//    @Test(dataProvider = "test1")
//    public void testMethod(Double time) {
//        double actualRes = eight.liters(time);
//        System.out.println("test " + actualRes);




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
}
