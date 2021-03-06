package kata.six;

import kata.DataProvider;
import kata.Six;
import org.testng.Assert;
import org.testng.annotations.Test;



public class FindNbTest  {
private Six six;

    @Test(dataProvider =  "impl6",dataProviderClass = DataProvider.class)
    public void testFindNb(Six six) {
        long expectedResult = 2022;
        long actualResult = six.findNb(4183059834009L);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test(dataProvider =  "impl6",dataProviderClass = DataProvider.class)
    public void testFindNb2(Six six) {
        long expectedResult = -1;
        long actualResult = six.findNb(24723578342962L);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test(dataProvider =  "impl6",dataProviderClass = DataProvider.class)
    public void testFindNb3(Six six) {
        long expectedResult = 3568;
        long actualResult = six.findNb(40539911473216L);
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test(dataProvider =  "impl6",dataProviderClass = DataProvider.class)
    public void testFindNb4(Six six) {
        long expectedResult = 0;
        long actualResult = six.findNb(0);
        Assert.assertEquals(expectedResult,actualResult);
    }
}