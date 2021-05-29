package kata.eight;

import kata.Eight;

import org.testng.Assert;

import org.testng.annotations.Test;

import java.util.Arrays;

public class FindNumbersTest extends DataProviderForEight{
    private Eight eight;

//
//@DataProvider(name ="test2")
//public Object[][] dataProviderTest(){
//    return new Object[][]{
//            {new Integer[] {1,2,3,4,5,6},new Integer(2)},
//            {new Integer[] {1,2,3,4,5,6},new Integer(3)},
//            {new Integer[] {0,1,2,3,4,5,6},new Integer(4)}
//    };







@Test(dataProvider = "create", dataProviderClass = DataProviderForEight.class)
    public void testOne(Eight eight) {
        int[]expResult=new int[] {2,4,6};
        int[] actualResult= eight.divisibleBy(new int[] {1,2,3,4,5,6},2);
        Assert.assertEquals(expResult, actualResult);
    }
    @Test(dataProvider = "create", dataProviderClass = DataProviderForEight.class)
    public void testTwo(Eight eight) {
        int[]expResult=new int[] {3,6};
        int[] actualResult= eight.divisibleBy(new int[] {1,2,3,4,5,6},3);
        Assert.assertEquals(expResult, actualResult);}
    @Test(dataProvider = "create", dataProviderClass = DataProviderForEight.class)
    public void testThree(Eight eight) {
        int[]expResult=new int[] {0,4};
        int[] actualResult= eight.divisibleBy(new int[] {0,1,2,3,4,5,6},4);
        Assert.assertEquals(expResult, actualResult);}
}
