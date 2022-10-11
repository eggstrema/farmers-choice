package de.egga.farmerschoice.toons;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ToonFactory {
    public ToonFactory() {
    }

    @NotNull
    static Toon anyToon() {
        Toon jango = new Toon(new ToonId("JANGOFETT"), List.of(
                "Attacker",
                "Bounty Hunter",
                "Leader",
                "Mandalorian",
                "Scoundrel",
                "Separatist"));
        return jango;
    }
}