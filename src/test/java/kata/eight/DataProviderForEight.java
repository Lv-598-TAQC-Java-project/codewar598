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

}
