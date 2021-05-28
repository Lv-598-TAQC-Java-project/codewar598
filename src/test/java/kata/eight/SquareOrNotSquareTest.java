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
}
