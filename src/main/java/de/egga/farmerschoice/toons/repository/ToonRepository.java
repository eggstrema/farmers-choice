package de.egga.farmerschoice.toons.repository;

import de.egga.farmerschoice.toons.Toon;
import de.egga.farmerschoice.toons.ToonId;
import de.egga.farmerschoice.toons.repository.raw.RawToon;
import de.egga.farmerschoice.toons.repository.raw.RawToonParser;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;
import static java.util.Collections.emptyList;

@Repository
public class ToonRepository {

    @Value("classpath:characters.json")
    public Resource resource;

    public List<RawToon> readAllCharacters() throws IOException {
        InputStream inputStream = resource.getInputStream();
        String fileContent = new String(inputStream.readAllBytes(), UTF_8);

        return RawToonParser.fromJsonString(fileContent);
    }

    public List<Toon> readAllToons() {

        ArrayList<Toon> characters = new ArrayList<>();

        for (RawToon rawToon : readRawToons()) {
            String rawId = rawToon.getBaseId();
            ToonId id = new ToonId(rawId);
            characters.add(new Toon(id, rawToon.getCategories()));
        }

        return characters;
    }

    private List<RawToon> readRawToons() {
        try {
            InputStream inputStream = resource.getInputStream();
            String fileContent = new String(inputStream.readAllBytes(), UTF_8);
            return RawToonParser.fromJsonString(fileContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return emptyList();
    }

    public List<Toon> findAllPhoenixToons() {

        List<Toon> foundToons = new ArrayList<>();

        for (Toon toon : readAllToons()) {
            if (toon.factions().contains("Phoenix")) {
                foundToons.add(toon);
            }
        }

        return foundToons;
    }
}