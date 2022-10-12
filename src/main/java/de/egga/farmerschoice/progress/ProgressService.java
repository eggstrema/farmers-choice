package de.egga.farmerschoice.progress;

import de.egga.farmerschoice.progress.repository.ProgresssRepository;
import de.egga.farmerschoice.progress.repository.RosterProgress;
import de.egga.farmerschoice.progress.repository.ToonProgress;
import de.egga.farmerschoice.progress.view.EarlySquad;
import de.egga.farmerschoice.progress.view.EarlySquads;
import de.egga.farmerschoice.toons.repository.ToonCategories;
import de.egga.farmerschoice.toons.repository.ToonCategory;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

import static de.egga.farmerschoice.toons.repository.ToonCategory.*;

@Service
public class ProgressService {

    @Autowired
    ProgresssRepository repository;

    public EarlySquads getMyEarlySquads(ToonCategories categories) throws IOException {
        List<EarlySquad> earlySquads = defineEarlySquads();

        RosterProgress rosterProgress = repository.readToonProgress();

        for (ToonProgress toon : rosterProgress.getToons()) {

            List<ToonCategory> list = categories.of(toon.id());

            if (list != null) {
                for (EarlySquad squad : earlySquads) {
                    if (list.contains(squad.getCategory())) {
                        squad.add(toon);
                    }
                }
            }
        }

        EarlySquads squads = new EarlySquads();
        for (EarlySquad squad : earlySquads) {
            squads.add(squad);
        }

        return squads;
    }

    @NotNull
    private List<EarlySquad> defineEarlySquads() {
        List<EarlySquad> earlySquads = List.of(
                new EarlySquad(Phoenix),
                new EarlySquad(Empire),
                new EarlySquad(Jedi),
                new EarlySquad(Rebel),
                new EarlySquad(BountyHunter),
                new EarlySquad(Geonosian),
                new EarlySquad(OldRepublic),
                new EarlySquad(Sith),
                new EarlySquad(Ewok),
                new EarlySquad(Droid),
                new EarlySquad(CloneTrooper),
                new EarlySquad(Nightsister),
                new EarlySquad(BadBatch),
                new EarlySquad(FirstOrder),
                new EarlySquad(HuttCartel),
                new EarlySquad(Scoundrel),
                new EarlySquad(Mandalorian),
                new EarlySquad(Resistance),
                new EarlySquad(RogueOne),
                new EarlySquad(Smuggler),
                new EarlySquad(Tusken)

        );
        return earlySquads;
    }
}
