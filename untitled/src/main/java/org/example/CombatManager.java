package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CombatManager
{
    public CombatManager()
    {
    }
    public List<String> Tags = new ArrayList<>(); // "Stun", "BuffDamage", "Slow", etc
    public List<UniqueStat> Stats = new ArrayList<>(); // "Health" -> 100, "Mana" -> 200
    public void ChangeStat(UniqueStat Stat, int DeltaValue, StatOperation Operation)
    {
        UniqueStat FoundStat = null;
        for (UniqueStat stat : Stats)
        {
            if (Objects.equals(stat.StatName, Stat.StatName))
            {
                FoundStat = stat;
                break;
            }
        }
        if (FoundStat == null)
        {
            FoundStat = Stat;
            Stats.add(FoundStat);
        }
        switch (Operation)
        {
            case Add -> FoundStat.Value += DeltaValue;
            case Multiply -> FoundStat.Value *= DeltaValue;
            case Override -> FoundStat.Value = DeltaValue;
        }
    }

    public void DebugDisplayStats()
    {
        for (UniqueStat stat : Stats)
        {
            System.out.println(stat);
        }
    }

    void AddTag(String NewTag)
    {
        Tags.add(NewTag);
    }

    void RemoveTag(String Tag)
    {
        Tags.remove(Tag);
    }

    boolean HasTag(String Tag)
    {
        return Tags.contains(Tag);
    }
}