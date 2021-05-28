package testNG.DmytroNahornyy;
import kata.implementations.DmytroNahornyy.EightImpl;
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

    @Test
    public void testLiters() {
        int expectedResult = 3;
        int actualResult = eight.liters(6.7);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void testLitersZero() {
        int expectedResult = 0;
        int actualResult = eight.liters(0);
        Assert.assertEquals(expectedResult,actualResult);
    }
//    @Test
//    public void testLitersNegative(){
//        int expectedResult = 0;
//        int actualResult = eight.liters(-10.5);
//        Assert.assertEquals(actualResult,expectedResult);
//    }
}