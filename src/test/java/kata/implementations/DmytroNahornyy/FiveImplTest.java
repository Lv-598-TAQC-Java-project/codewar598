package kata.implementations.DmytroNahornyy;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FiveImplTest {
    FiveImpl five = new FiveImpl();
    @Test
    public void testZeros() {
        int expectedResult = 0;
        int actualResult = five.zeros(0);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void testZeros2() {
        int expectedResult = 1;
        int actualResult = five.zeros(6);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void testZeros3() {
        int expectedResult = 2;
        int actualResult = five.zeros(14);
        Assert.assertEquals(expectedResult,actualResult);
    }
}