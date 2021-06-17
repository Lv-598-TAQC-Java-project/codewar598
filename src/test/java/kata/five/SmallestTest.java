package kata.five;

import kata.DataProvider;
import kata.Five;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class SmallestTest {
    private Five impl;

    @Test(dataProvider = "impl5", dataProviderClass = DataProvider.class)
    public void testSmallestOne(Five impl5){
        long[] actualResult = impl5.smallest(261235L);
        long[] expectedResult = {126235, 2, 0};
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test(dataProvider = "impl5", dataProviderClass = DataProvider.class)
    public void testSmallestTwo(Five impl5){
        long[] actualResult = impl5.smallest(196837);
        long[] expectedResult = {139687, 4, 1};
        Assert.assertEquals(expectedResult, actualResult);
    }
}