package kata.five;

import org.testng.annotations.DataProvider;

public class DataProviderForFive {
    @DataProvider(name = "create")
    public static Object[] createData() {
        return new Object[]{
                new kata.implementations.DmytroNahornyy.FiveImpl(),
                new kata.implementations.OksanaKalynivska.FiveImpl(),
                new kata.implementations.AlonaLutsenko.FiveImplA(),
                new kata.implementations.ElviraStepaniuk.FiveImpl(),
                new kata.implementations.OrestTorskyi.FiveImpl(),
                new kata.implementations.OstapNadiak.FiveImpl(),
                new kata.implementations.VictoriaBadenko.FiveImpl()};
    }

}
