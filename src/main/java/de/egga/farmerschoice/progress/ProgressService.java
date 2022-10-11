package de.egga.farmerschoice.progress;

import de.egga.farmerschoice.progress.repository.*;
import de.egga.farmerschoice.toons.Toon;
import de.egga.farmerschoice.toons.ToonId;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class ProgressService {

    @Autowired
    ProgresssRepository repository;

    public String getMyPhoenixProgress(List<Toon> phoenixIds) throws IOException {
        Welcome welcome = repository.readAllProgress();

        String result = "";
        for (Unit unit : welcome.getUnits()) {
            UnitData data = unit.getData();
            for (Toon phoenix : phoenixIds) {
                ToonId id = new ToonId(data.getBaseId());
                if (phoenix.baseId().equals(id)) {

                    result += "<h2>" + data.getName() + "</h2>";

                    result += getColored("Level", data.getLevel(), 85, 80);
                    result += getColored("Gear", data.getGearLevel(), 12, 9);

                    result += "<hr>";
                }
            }
        }

        return result;
    }

    @NotNull
    private String getColored(String label, long actualLevel, int recommendedLevel, int minimumLevel) {
        String color = "#cc3232";
        if (actualLevel == recommendedLevel) {
            color = "#2dc937";
        } else if (actualLevel >= minimumLevel) {
            color = "#e7b416";
        }
        return "<span style=background:" + color + ">" + label + ": " + actualLevel + "</span><br>";
    }
}
