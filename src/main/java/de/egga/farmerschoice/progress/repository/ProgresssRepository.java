package de.egga.farmerschoice.progress.repository;

import de.egga.farmerschoice.progress.repository.raw.ProgressReader;
import de.egga.farmerschoice.progress.repository.raw.Unit;
import de.egga.farmerschoice.progress.repository.raw.UnitData;
import de.egga.farmerschoice.toons.ToonId;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.OptionalInt;

@Repository
public class ProgresssRepository {

    @Autowired
    ProgressReader progressReader;

    public RosterProgress readToonProgress() throws IOException {
        RosterProgress roster = new RosterProgress();

        for (Unit unit : progressReader.readAllProgress().getUnits()) {
            UnitData data = unit.getData();

            ToonProgress toon = extractToonProgress(data);
            roster.add(toon);
        }

        return roster;
    }

    @NotNull
    private ToonProgress extractToonProgress(UnitData data) {
        Integer lowestAbility = getLowestAbility(data).orElse(1);

        ToonProgress toon = new ToonProgress(
                new ToonId(data.getBaseId()), data.getName(),
                data.getLevel(), 85, 80,
                data.getGearLevel(), 12, 9,
                data.getRarity(), 7, 1,
                data.getPower(), 15000, 10000,
                lowestAbility, 7, 6

        );
        return toon;
    }

    @NotNull
    private OptionalInt getLowestAbility(UnitData data) {
        OptionalInt lowestAbility = data.getAbilityData().stream()
                .map(a -> a.getAbilityTier())
                .mapToInt(l -> l.intValue()).min();
        return lowestAbility;
    }
}