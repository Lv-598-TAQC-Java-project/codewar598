package kata.eight;

import kata.implementations.OksanaKalynivska.EightImp;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KeepHydratedTest {
    EightImp eight = new EightImp();
    @Test
    public void test_1_KeepHydrated() {
        double actualResult = eight.liters(2.0);
        Assert.assertEquals(1.0, actualResult);

    }

    @Test
    public void test_2_KeepHydrated() {
        double actualResult = eight.liters(0.97);
        Assert.assertEquals(0.0, actualResult);
    }

    @Test
    public void test_3_KeepHydrated() {
        double actualResult = eight.liters(1600.20);
        Assert.assertEquals(800.0, actualResult);
    }
}
