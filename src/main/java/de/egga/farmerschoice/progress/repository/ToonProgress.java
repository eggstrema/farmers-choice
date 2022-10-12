package de.egga.farmerschoice.progress.repository;

import de.egga.farmerschoice.toons.ToonId;

public record ToonProgress(
        ToonId id, String name,

        Long actualLevel, Integer perfectLevel, Integer minimumLevel,

        Long actualGear, Integer perfectGear, Integer minimumGear,

        Long actualRarity, Integer perfectRarity, Integer minimumRarity,

        Long actualPower, Integer perfectPower, Integer minimumPower,

        Integer actualAbility, Integer perfectAbility, Integer minimumAbility

) {
}
