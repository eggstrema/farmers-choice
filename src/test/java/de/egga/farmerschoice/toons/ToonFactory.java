package de.egga.farmerschoice.toons;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import static de.egga.farmerschoice.toons.repository.ToonCategory.*;

public class ToonFactory {

    @NotNull
    public static Toon jango() {
        Toon jango = new Toon(new ToonId("JANGOFETT"), List.of(
                Attacker,
                BountyHunter,
                Leader,
                Mandalorian,
                Scoundrel,
                Separatist));
        return jango;
    }

    @NotNull
    public static Toon rey() {
        Toon rey = new Toon(new ToonId("GLREY"), List.of(
                Attacker,
                GalacticLegend,
                Leader,
                Resistance,
                UnalignedForceUser));
        return rey;
    }
}