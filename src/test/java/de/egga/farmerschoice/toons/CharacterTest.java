package de.egga.farmerschoice.toons;

import de.egga.farmerschoice.toons.repository.raw.RawToonParser;
import de.egga.farmerschoice.toons.repository.raw.RawToon;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import static java.nio.file.Path.of;

class CharacterTest {

    @Test
    void name() throws IOException {
        String jsonUrl = "src/main/resources/characters.json";
        String fileContent = Files.readString(of(jsonUrl));

        List<RawToon> rawToons = RawToonParser.fromJsonString(fileContent);

        for (RawToon rawToon : rawToons) {
            System.out.println(rawToon.getBaseId() + " -> " + rawToon.getCategories());
        }
    }
}