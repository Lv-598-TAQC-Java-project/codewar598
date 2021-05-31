package kata.eight;

import kata.DataProvider;
import kata.Eight;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VolumeOfCuboidTest {
    @Test(dataProvider = "impl8", dataProviderClass = DataProvider.class)
    public void volumeofcuboid(Eight impl8) {
        System.out.println(String.format("Checking for implementation: %s", impl8));

        Assert.assertEquals(8.0,impl8.getVolumeOfCuboid(2,2,2),
                String.format("Test %s failed!",impl8.getClass()));
        Assert.assertEquals(-6.0,impl8.getVolumeOfCuboid(-1,2,3),
                String.format("Test %s failed!",impl8.getClass()));
    }
}
