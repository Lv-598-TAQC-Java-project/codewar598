package kata.implementations.DmytroNahornyy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EightImplTest {
    EightImpl eight = new EightImpl();
    @Test
    public void testCountPositivesSumNegativesSimple() {
        int[] exceptedResult = {10, -65};
        int[] actualResult = eight.countPositivesSumNegatives(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15});
        Assert.assertEquals(exceptedResult, actualResult);
    }
    @Test
    public void testCountPositivesSumNegativesNegativeOnly() {
        int[] exceptedResult = {0, -65};
        int[]actualResult = eight.countPositivesSumNegatives(new int[]{ -11, -12, -13, -14, -15});
        Assert.assertEquals(exceptedResult, actualResult);
    }
    @Test
    public void testCountPositivesSumNPositiveOnly() {
        int[] exceptedResult = {10, 0};
        int[]actualResult = eight.countPositivesSumNegatives(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        Assert.assertEquals(exceptedResult, actualResult);
    }
    @Test
    public void testCountPositivesSumNegativesNull() {
        int[] exceptedResult = {};
        int[]actualResult = eight.countPositivesSumNegatives(new int[]{});
        Assert.assertEquals(exceptedResult, actualResult);
    }
}