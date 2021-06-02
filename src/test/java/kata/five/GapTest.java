package kata.five;

import kata.DataProvider;
import kata.Five;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class GapTest {
    private Five impl;

    @Test(dataProvider = "impl5", dataProviderClass = DataProvider.class)
    public void gapTestForNull(Five impl) {
        long startSearch = 10;
        long endSearch = 100;
        int gap = 50;
        Assert.assertNull(impl.gap(gap, startSearch, endSearch), "No such primes with this gap in range [10,100]!");
    }

    @Test(dataProvider = "impl5", dataProviderClass = DataProvider.class)
    public void gapTestForEquals(Five impl) {
        long startSearch = 100;
        long endSearch = 300;
        int gap = 14;
        long[] expected = {113, 127};
        Assert.assertEquals(Arrays.toString(impl.gap(gap, startSearch, endSearch)), Arrays.toString(expected), "Not the same pair of prime numbers!");
    }

    @Test(dataProvider = "impl5", dataProviderClass = DataProvider.class)
    public void gapTestForNotEquals(Five impl) {
        long startSearch = 3;
        long endSearch = 10;
        int gap = 2;
        long[] expected = {5, 7};
        Assert.assertNotEquals(Arrays.toString(impl.gap(gap, startSearch, endSearch)), Arrays.toString(expected), "Not first prime numbers with this gap!");
    }
}