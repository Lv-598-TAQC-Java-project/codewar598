package kata.five;

import kata.Five;
import org.testng.Assert;
import org.testng.IResultMap;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ZerosTest extends DataProviderForFive{
    private Five impl;

    @Test(dataProvider = "create",dataProviderClass = DataProviderForFive.class)
    public void testZeros(Five impl) {
            int expectedResult = 2;
            int actualResult = impl.zeros(14);
        Assert.assertEquals(expectedResult,actualResult);
    }
}