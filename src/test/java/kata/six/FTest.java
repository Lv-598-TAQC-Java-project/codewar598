package kata.six;

import kata.DataProvider;
import kata.Six;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.DecimalFormat;


public class FTest  {
private Six six;

    @Test(dataProvider =  "impl6",dataProviderClass = DataProvider.class)
    public void testF(Six six) {
        double expectedData = 2.499996875007812e-06;
        double actualData = six.f(5.0e-06);
        boolean isInRange;
        double limit = 1e-12;
        if (expectedData == 0.0)
            isInRange = Math.abs(six.f(5.0e-06)) <= limit;
        else {
            double e = Math.abs((actualData - expectedData) / expectedData);
            isInRange = e <= 1e-12;
        }
        if (isInRange == false) {
            DecimalFormat df = new DecimalFormat("#.0000000000000000");
            System.out.println("Expected must be near " + expectedData +", but got " + actualData);
        }
        Assert.assertEquals(true, isInRange);
    }

}