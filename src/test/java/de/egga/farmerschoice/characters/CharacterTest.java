package de.egga.farmerschoice.characters;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import static java.nio.file.Path.of;

class CharacterTest {

    @Test
    void name() throws IOException {
        String jsonUrl = "src/test/resources/characters.json";
        String fileContent = Files.readString(of(jsonUrl));

        List<Welcome> welcomes = Converter.fromJsonString(fileContent);

        for (Welcome welcome : welcomes) {
            System.out.println(welcome.getName() + " -> " + welcome.getCategories());
        }


    }
}