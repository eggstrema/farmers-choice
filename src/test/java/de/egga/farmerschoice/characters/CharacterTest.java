package de.egga.farmerschoice.characters;

import de.egga.farmerschoice.characters.repository.Converter;
import de.egga.farmerschoice.characters.repository.Welcome;
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

        List<Welcome> welcomes = Converter.fromJsonString(fileContent);

        for (Welcome welcome : welcomes) {
            System.out.println(welcome.getBaseId() + " -> " + welcome.getCategories());
        }
    }
}