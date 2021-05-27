package kata.six;

import org.testng.annotations.DataProvider;

public class DataProviderForSix {
    @DataProvider(name = "implementationsSix")
    public static Object[] provideData(){
        return new Object[]{
                new kata.implementations.DmytroNahornyy.SixImpl(),
                new kata.implementations.VictoriaBadenko.SixImpl(),
                new kata.implementations.OstapNadiak.SixImpl(),
                new kata.implementations.OrestTorskyi.SixImpl(),
                new kata.implementations.OksanaKalynivska.SixImpl(),
                new kata.implementations.ElviraStepaniuk.SixImpl(),
                new kata.implementations.AlonaLutsenko.Six()
        };
    }
}
