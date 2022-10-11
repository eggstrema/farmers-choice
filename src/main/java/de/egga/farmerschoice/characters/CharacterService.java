package de.egga.farmerschoice.characters;

import de.egga.farmerschoice.characters.repository.CharacterRepository;
import de.egga.farmerschoice.characters.repository.Welcome;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class CharacterService {

    @Autowired
    CharacterRepository repository;

    public List<String> getPhoenixIds() throws IOException {
        List<Welcome> welcomes = repository.readAllCharacters();
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
        return repository.readAllCharacters();
    }
}
