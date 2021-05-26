package kata.implementations.Torskyi;

import kata.implementations.OrestTorskyi.SevenImpl;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SevenImplTest {
    SevenImpl impl7 = new SevenImpl();

    @Test
    public void whereIsHeTestForEquals() {
        int expectedCountPositions = 2;
        Assert.assertEquals(impl7.whereIsHe(10, 3, 8), expectedCountPositions, "Incorrect values!");
    }

    @Test
    public void whereIsHeTestForFalse() {
        int expectedCountPositions = 0;
        Assert.assertTrue(impl7.whereIsHe(10, 3, 11) == expectedCountPositions, "Not valid data!");
    }
}
