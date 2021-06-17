package kata.eight;

import kata.DataProvider;
import kata.Eight;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FormattingDecimalPlacesTest {

    @Test(dataProvider = "impl8", dataProviderClass = DataProvider.class)
    public void FormattingDecimalPlacesTestOne(Eight impl8) {
        double actualResult = impl8.TwoDecimalPlaces(4.02125356);
        Assert.assertEquals(4.02, actualResult, 0.00);
    }

    @Test(dataProvider = "impl8", dataProviderClass = DataProvider.class)
    public void FormattingDecimalPlacesTestTwo(Eight impl8) {
        double actualResult = impl8.TwoDecimalPlaces(173735326.3783732637948948);
        Assert.assertEquals(173735326.38, actualResult, 0.00);
    }
}
