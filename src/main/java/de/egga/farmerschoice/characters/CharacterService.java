package de.egga.farmerschoice.characters;

import org.jetbrains.annotations.NotNull;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

@Service
public class CharacterService {

    public List<String> getPhoenixIds() throws IOException {
        List<Welcome> welcomes = readAllCharacters();
        return filterPhoenixIds(welcomes);
    }

    @NotNull
    private List<String> filterPhoenixIds(List<Welcome> welcomes) {
        List<String> characterIds = new ArrayList<>();
        for (Welcome welcome : welcomes) {
            if (welcome.getCategories().contains("Phoenix")) {
                characterIds.add(welcome.getBaseId());
            }
        }
        return characterIds;
    }

    private List<Welcome> readAllCharacters() throws IOException {
        ClassPathResource resource = new ClassPathResource("characters.json");

        String fileContent = Files.readString(resource.getFile().toPath());

        return Converter.fromJsonString(fileContent);
    }
}
