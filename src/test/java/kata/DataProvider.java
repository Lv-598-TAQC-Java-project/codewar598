package kata;

public class DataProvider {
    @org.testng.annotations.DataProvider(name = "impl8")
    public Object[] getDifferentImplementationsEight() {
        return new Object[]{
                new kata.implementations.OrestTorskyi.EightImpl(),
                new kata.implementations.DmytroNahornyy.EightImpl(),
                new kata.implementations.OksanaKalynivska.EightImp(),
                new kata.implementations.VictoriaBadenko.EightImpl(),
                new kata.implementations.AlonaLutsenko.EightImplA(),
                new kata.implementations.ElviraStepaniuk.EightImpl(),
                new kata.implementations.OstapNadiak.EightImpl()};
    }

    @org.testng.annotations.DataProvider(name = "impl7")
    public Object[] getDifferentImplementationsSeven() {
        return new Object[]{
                new kata.implementations.OrestTorskyi.SevenImpl(),
                new kata.implementations.DmytroNahornyy.SevenImpl(),
                new kata.implementations.OksanaKalynivska.SevenImpl(),
                new kata.implementations.VictoriaBadenko.SevenImpl(),
                new kata.implementations.AlonaLutsenko.SevenImplA(),
                new kata.implementations.ElviraStepaniuk.SevenImpl(),
                new kata.implementations.OstapNadiak.SevenImpl()};
    }

    @org.testng.annotations.DataProvider(name = "impl6")
    public Object[] getDifferentImplementationsSix() {
        return new Object[]{
                new kata.implementations.OrestTorskyi.SixImpl(),
                new kata.implementations.DmytroNahornyy.SixImpl(),
                new kata.implementations.OksanaKalynivska.SixImpl(),
                new kata.implementations.VictoriaBadenko.SixImpl(),
                new kata.implementations.AlonaLutsenko.SixImplA(),
                new kata.implementations.ElviraStepaniuk.SixImpl(),
                new kata.implementations.OstapNadiak.SixImpl()};
    }

    @org.testng.annotations.DataProvider(name = "impl5")
    public Object[] getDifferentImplementationsFive() {
        return new Object[]{
                new kata.implementations.OrestTorskyi.FiveImpl(),
                new kata.implementations.DmytroNahornyy.FiveImpl(),
                new kata.implementations.OksanaKalynivska.FiveImpl(),
                new kata.implementations.VictoriaBadenko.FiveImpl(),
                new kata.implementations.AlonaLutsenko.FiveImplA(),
                new kata.implementations.ElviraStepaniuk.FiveImpl(),
                new kata.implementations.OstapNadiak.FiveImpl()};
    }
}
