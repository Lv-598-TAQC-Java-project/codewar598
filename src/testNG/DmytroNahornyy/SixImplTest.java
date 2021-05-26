package testNG.DmytroNahornyy;
import kata.implementations.DmytroNahornyy.SixImpl;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SixImplTest {
    SixImpl six = new SixImpl();

    @Test
    public void testFindNb() {
    long expectedResult = 2022;
    long actualResult = six.findNb(4183059834009L);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void testFindNb2() {
        long expectedResult = -1;
        long actualResult = six.findNb(24723578342962L);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void testFindNb3() {
        long expectedResult = 3568;
        long actualResult = six.findNb(40539911473216L);
        Assert.assertEquals(expectedResult,actualResult);
    }
//    В тесті не проходить, а в методі працює???
    @Test
    public void testFindNb4() {
        long expectedResult = 0;
        long actualResult = six.findNb(0);
        Assert.assertEquals(expectedResult,actualResult);
    }
}