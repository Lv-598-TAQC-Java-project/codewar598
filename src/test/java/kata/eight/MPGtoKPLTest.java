package kata.eight;

import kata.DataProvider;
import kata.Eight;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MPGtoKPLTest {
    @Test(dataProvider = "impl8", dataProviderClass = DataProvider.class)
    public void testMPGtoLPL(Eight impl8) {
        float expectedResult = (float) 1.11;
        float actualResult = impl8.mpgToKPM((float) 3.14);
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test(dataProvider = "impl8", dataProviderClass = DataProvider.class)
    public void testMPGtoLPLZero(Eight impl8) {
        float expectedResult = 0;
        float actualResult = impl8.mpgToKPM(0.00F);
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test(dataProvider = "impl8", dataProviderClass = DataProvider.class)
    public void testMPGtoLPLBIG(Eight impl8) {
        float expectedResult = (float) 402549.44;
        float actualResult = impl8.mpgToKPM((float) 1137125.82);
        Assert.assertEquals(expectedResult, actualResult);
    }




}
