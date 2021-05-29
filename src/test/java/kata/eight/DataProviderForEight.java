package kata.eight;


import org.testng.annotations.DataProvider;


public class DataProviderForEight {
    @DataProvider(name = "create")
    public static Object[] createData() {
        return new Object[]{
                new kata.implementations.DmytroNahornyy.EightImpl(),
                new kata.implementations.OksanaKalynivska.EightImp(),
                new kata.implementations.AlonaLutsenko.EightImpl(),
                new kata.implementations.ElviraStepaniuk.EightImpl(),
                new kata.implementations.OrestTorskyi.EightImpl(),
                new kata.implementations.OstapNadiak.EightImpl(),
                new kata.implementations.VictoriaBadenko.EightImpl()};
    }




//
//    @Test(dataProvider="create")
//    public void test_1_KeepHydrated(Eight eight) {
//        double actualResult = eight.liters(2.0);
//        Assert.assertEquals(1.0, actualResult);
//
//    }
//
//    @Test (dataProvider="create")
//   public void test_2_KeepHydrated(Eight eight) {
//       double actualResult = eight.liters(0.97);
//        Assert.assertEquals(0.0, actualResult);
//    }
//    @Test(dataProvider="create")
//  public void test_3_KeepHydrated(Eight eight) {
//        double actualResult = eight.liters(1600.20);
//        Assert.assertEquals(800.0, actualResult);
}


