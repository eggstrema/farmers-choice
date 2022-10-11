package de.egga.farmerschoice.progress;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

@Service
public class ProgressService {

    @Value("classpath:progress.json")
    Resource resource;

    public String getMyProgress(List<String> phoenixIds) throws IOException {
        Welcome welcome = readAllProgress();

        String result = "";
        for (Unit unit : welcome.getUnits()) {
            UnitData data = unit.getData();
            if (phoenixIds.contains(data.getBaseId())) {
                result += "<h2>" + data.getName() + "</h2>";

                result += getColored("Level", data.getLevel(), 85, 80);
                result += getColored("Gear", data.getGearLevel(), 12, 9);

                result += "<hr>";
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

    private Welcome readAllProgress() throws IOException {
        String fileContent = Files.readString(resource.getFile().toPath());

        return Converter.fromJsonString(fileContent);
    }
}
