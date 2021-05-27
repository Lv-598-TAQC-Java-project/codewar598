package kata.eight;

import kata.Eight;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CountOfPositivesTest {

  private Eight impl ;



  @Test(dataProvider = "create", dataProviderClass = DataProviderForEight.class)
  public void countPositivesSumNegatives(Eight impl ) {
    int[] values ={1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
    int[] expectedResult = {10,-65};
    Assert.assertEquals(expectedResult, impl.countPositivesSumNegatives(values));
  }
  @Test(dataProvider = "create", dataProviderClass = DataProviderForEight.class)
  public void testCountPositivesSumNegativesSimple(Eight impl ) {
    int[] exceptedResult = {10, -65};
    int[] actualResult = impl.countPositivesSumNegatives(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15});
    Assert.assertEquals(exceptedResult, actualResult);
  }
  @Test(dataProvider = "create", dataProviderClass = DataProviderForEight.class)
  public void testCountPositivesSumNegativesNegativeOnly(Eight impl ) {
    int[] exceptedResult = {0, -65};
    int[]actualResult = impl.countPositivesSumNegatives(new int[]{ -11, -12, -13, -14, -15});
    Assert.assertEquals(exceptedResult, actualResult);
  }
  @Test(dataProvider = "create")
  public void testCountPositivesSumNPositiveOnly(Eight impl ) {
    int[] exceptedResult = {10, 0};
    int[]actualResult = impl.countPositivesSumNegatives(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
    Assert.assertEquals(exceptedResult, actualResult);
  }
  @Test(dataProvider = "create")
  public void testCountPositivesSumNegativesNull(Eight impl ) {
    int[] exceptedResult = {};
    int[]actualResult = impl.countPositivesSumNegatives(new int[]{});
    Assert.assertEquals(exceptedResult, actualResult);
  }

}
