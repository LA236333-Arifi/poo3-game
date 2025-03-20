package org.example;

public class UniqueStat
{
    public UniqueStat(String NewStatName, int NewValue)
    {
        StatName = NewStatName;
        Value = NewValue;
    }
    String StatName;
    int Value;

    @Override
    public String toString()
    {
        return StatName + ": " + Value;
    }
}
