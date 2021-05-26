package Torskyi;

import kata.implementations.OrestTorskyi.EightImpl;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;


public class EightImplTest {

    EightImpl impl8 = new EightImpl();

    @Test
    public void squareOrSquareRootTestForEquals() {
        int[] initialValues = {5, 6, 1, 9, 15, 25};
        int[] expectedValues = {25, 36, 1, 3, 225, 5};
        Assert.assertEquals(Arrays.toString(impl8.squareOrSquareRoot(initialValues)), Arrays.toString(expectedValues));
    }

    @Test
    public void squareOrSquareRootTestFalse() {
        int[] initialValues = {5, 6, 1, 9, 15, 25};
        int[] expectedValues = {5, 36, 1, 3, 25, 7};
        Assert.assertFalse(Arrays.toString(impl8.squareOrSquareRoot(initialValues)).equals(Arrays.toString(expectedValues)), "The same result!");
    }

}
