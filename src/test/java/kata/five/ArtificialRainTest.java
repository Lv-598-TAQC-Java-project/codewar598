package kata.five;

import kata.Five;
import org.testng.annotations.Test;

public class ArtificialRainTest extends DataProviderForFive{
    private Five impl;

    @Test(dataProvider = "create",dataProviderClass = DataProviderForFive.class)
    public void testArtificialRain(Five impl) {
        //To Do
    }
}