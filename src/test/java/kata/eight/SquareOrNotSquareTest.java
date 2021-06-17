package kata.eight;

import kata.DataProvider;
import kata.Eight;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class SquareOrNotSquareTest {

    @Test(dataProvider = "impl8", dataProviderClass = DataProvider.class)
    public void squareOrSquareRootTestForEquals(Eight impl8) {
        int[] initialValues = {5, 6, 1, 9, 15, 25};
        int[] expectedValues = {25, 36, 1, 3, 225, 5};
        Assert.assertEquals(Arrays.toString(impl8.squareOrSquareRoot(initialValues)), Arrays.toString(expectedValues));
    }

    @Test(dataProvider = "impl8", dataProviderClass = DataProvider.class)
    public void squareOrSquareRootTestFalse(Eight impl8) {
        int[] initialValues = {5, 6, 1, 9, 15, 25};
        int[] expectedValues = {5, 36, 1, 3, 25, 7};
        Assert.assertFalse(Arrays.toString(impl8.squareOrSquareRoot(initialValues)).equals(Arrays.toString(expectedValues)), "The same result!");
    }

    @Test(dataProvider = "impl8", dataProviderClass = DataProvider.class)
    public void squareOrSquareRootTestForNegativeArray(Eight impl8) {
        int[] initialValues = {-1, -4, -9, -3, 10};
        int[] expectedValues = {1, 2, 3, 9, 100};
        Assert.assertTrue( Arrays.toString(impl8.squareOrSquareRoot(initialValues)).equals(Arrays.toString(expectedValues))
                          | Arrays.toString(impl8.squareOrSquareRoot(initialValues)) == null
                          | Arrays.toString(impl8.squareOrSquareRoot(initialValues)).equals(Arrays.toString(new int[0])));
    }

}
