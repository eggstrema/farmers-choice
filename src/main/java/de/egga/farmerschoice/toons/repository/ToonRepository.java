package de.egga.farmerschoice.toons.repository;

import de.egga.farmerschoice.toons.Toon;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.emptyList;

@Repository
public class ToonRepository {

    @Value("classpath:characters.json")
    public Resource resource;

    public ToonRepository() {
    }

    public List<Welcome> readAllCharacters() throws IOException {
        InputStream inputStream = resource.getInputStream();
        String fileContent = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);

        return Converter.fromJsonString(fileContent);
    }

    public List<Toon> readAllToons() {

        ArrayList<Toon> characters = new ArrayList<>();

        List<Welcome> welcomes = readCharacters();
        for (Welcome welcome : welcomes) {
            String baseId = welcome.getBaseId();
            characters.add(new Toon(baseId));
        }


        return characters;
    }

    private List<Welcome> readCharacters() {
        try {
            InputStream inputStream = resource.getInputStream();
            String fileContent = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
            List<Welcome> welcomes = Converter.fromJsonString(fileContent);
            return welcomes;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return emptyList();
    }
}