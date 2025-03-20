package org.example;

import org.example.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main
{
    public static void main(String[] args)
    {
        UniqueStat Stat = new UniqueStat("Health", 100);
        CombatManager CM = new CombatManager();
        CM.ChangeStat(Stat, 50, StatOperation.Multiply);
        CM.DebugDisplayStats();

        JsonHandle.ReadJson();
    }
}