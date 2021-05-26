package Torskyi;

import kata.implementations.OrestTorskyi.FiveImpl;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class FiveImplTest {

    FiveImpl impl5 = new FiveImpl();

    @Test
    public void gapInPrimesTestForNull() {
        int gap = 78;
        long start = 100;
        long end = 2500;
        Assert.assertNull(impl5.gap(gap, start, end));
    }

    @Test
    public void gapInPrimesTestForEquals() {
        int gap = 16;
        long start = 100;
        long end = 2000;
        long[] expectedPrimes = {1831,1847};
        Assert.assertEquals(Arrays.toString(impl5.gap(gap, start, end)), Arrays.toString(expectedPrimes), "Not the same result!");
    }

    @Test
    public void gapInPrimesTestForFalse() {
        int gap = 2;
        long start = 3;
        long end = 10;
        long[] secondExpectedGapInPrimes = {5,7};
        Assert.assertNotEquals(Arrays.toString(impl5.gap(gap, start, end)), Arrays.toString(secondExpectedGapInPrimes), "The same values!");
    }

}
