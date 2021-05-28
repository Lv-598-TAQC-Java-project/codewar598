package kata.eight;

import kata.Eight;
import org.testng.Assert;
import org.testng.annotations.Test;

import kata.DataProvider;

public class ConvertStringToNumberTest {

    @Test(dataProvider = "impl8", dataProviderClass = DataProvider.class)
    public void stringToNumberTest1(Eight impl8) {
        int expectedResult = 123;
        int actualResult = impl8.stringToNumber("123");
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test(dataProvider = "impl8", dataProviderClass = DataProvider.class)
    public void stringToNumberTest2(Eight impl8) {
        int expectedResult = 0;
        int actualResult = impl8.stringToNumber("0");
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test(dataProvider = "impl8", dataProviderClass = DataProvider.class)
    public void stringToNumberTest3(Eight impl8) {
        int expectedResult = 9876543;
        int actualResult = impl8.stringToNumber("9876543");
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test(dataProvider = "impl8", dataProviderClass = DataProvider.class)
    public void stringToNumberTest4(Eight impl8) {
        int expectedResult = -12;
        int actualResult = impl8.stringToNumber("-12");
        Assert.assertEquals(expectedResult, actualResult);
    }
}
