package Impl;

public class DataProvider {
    @org.testng.annotations.DataProvider(name = "impl8")
    public Object[] getDifferentImplementationsEight()
    {
        return new Object[]{new kata.implementations.OrestTorskyi.EightImpl(),
                new kata.implementations.DmytroNahornyy.EightImpl(),
                new kata.implementations.OksanaKalynivska.EightImp(),
                new kata.implementations.VictoriaBadenko.EightImpl(),
                new kata.implementations.AlonaLutsenko.EightImplA(),
                new kata.implementations.ElviraStepaniuk.EightImpl(),
                new kata.implementations.OstapNadiak.EightImpl()};
    }

    @org.testng.annotations.DataProvider(name = "impl7")
    public Object[] getDifferentImplementationsSeven()
    {
        return new Object[]{ new kata.implementations.OrestTorskyi.SevenImpl(),
                new kata.implementations.DmytroNahornyy.SevenImpl(),
                new kata.implementations.OksanaKalynivska.SevenImpl(),
                new kata.implementations.VictoriaBadenko.SevenImpl(),
                new kata.implementations.AlonaLutsenko.SevenImplA(),
                new kata.implementations.ElviraStepaniuk.SevenImpl(),
                new kata.implementations.OstapNadiak.SevenImpl()};
    }
}
