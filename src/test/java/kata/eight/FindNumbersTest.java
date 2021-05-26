package kata.eight;

import kata.implementations.OksanaKalynivska.EightImp;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FindNumbersTest {
    EightImp eight=new EightImp();
    @Test
    public void testOne() {
        int[]expResult=new int[] {2,4,6};
        int[] actualResult= eight.divisibleBy(new int[] {1,2,3,4,5,6},2);
        Assert.assertEquals(expResult, actualResult);
    }
    @Test
    public void testTwo() {
        int[]expResult=new int[] {3,6};
        int[] actualResult= eight.divisibleBy(new int[] {1,2,3,4,5,6},3);
        Assert.assertEquals(expResult, actualResult);}
    @Test
    public void testThree() {
        int[]expResult=new int[] {0,4};
        int[] actualResult= eight.divisibleBy(new int[] {0,1,2,3,4,5,6},4);
        Assert.assertEquals(expResult, actualResult);}
}
