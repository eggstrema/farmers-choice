package de.egga.farmerschoice.toons;

import de.egga.farmerschoice.toons.repository.ToonRepository;
import de.egga.farmerschoice.toons.repository.raw.RawToon;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class ToonService {

    @Autowired
    ToonRepository repository;

    public List<String> getPhoenixIds() throws IOException {
        List<RawToon> rawToons = repository.readAllCharacters();
        return filterPhoenixIds(rawToons);
    }

    @NotNull
    private List<String> filterPhoenixIds(List<RawToon> rawToons) {
        List<String> characterIds = new ArrayList<>();
        for (RawToon rawToon : rawToons) {
            if (rawToon.getCategories().contains("Phoenix")) {
                characterIds.add(rawToon.getBaseId());
            }
        }
        return characterIds;
    }

    public List<Toon> getAllPhoenixToons() {
        return repository.findAllPhoenixToons();
    }
}
