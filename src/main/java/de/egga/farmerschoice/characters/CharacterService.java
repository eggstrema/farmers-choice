package de.egga.farmerschoice.characters;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

@Service
public class CharacterService {

    public String getMyPhoenixCharacters() throws IOException {
        ClassPathResource resource = new ClassPathResource("characters.json");

        String fileContent = Files.readString(resource.getFile().toPath());

        List<Welcome> welcomes = Converter.fromJsonString(fileContent);

        return "mobb";
    }
}
