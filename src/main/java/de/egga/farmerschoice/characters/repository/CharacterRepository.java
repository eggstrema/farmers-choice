package de.egga.farmerschoice.characters.repository;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;

@Repository
public class CharacterRepository {
    @Value("classpath:characters.json")
    public
    Resource resource;

    public CharacterRepository() {
    }

    public List<Welcome> readAllCharacters() throws IOException {
        InputStream inputStream = resource.getInputStream();
        String fileContent = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);

        return Converter.fromJsonString(fileContent);
    }
}