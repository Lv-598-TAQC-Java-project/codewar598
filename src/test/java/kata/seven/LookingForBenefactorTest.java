package kata.seven;

import kata.DataProvider;
import kata.Seven;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LookingForBenefactorTest {
    @Test(dataProvider = "impl7", dataProviderClass = DataProvider.class)
    public void newAvg(Seven impl7) {

        System.out.println("Checking for implementation: " + impl7);
        long actual = impl7.newAvg(new double[]{14, 30, 5, 7, 9, 11, 15}, 30);
        long expected = 149;
        Assert.assertEquals(expected, actual, String.format("Test %s failed!", impl7));

        long actual2 = impl7.newAvg(new double[]{14, 30, 5, 7, 9, 11, 15}, 92);
        long expected2 = 645;
        Assert.assertEquals(expected2, actual2, String.format("Test %s failed!", impl7));
    }
}
