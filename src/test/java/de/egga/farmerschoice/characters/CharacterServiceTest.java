package de.egga.farmerschoice.characters;

import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;

class CharacterServiceTest {

    @Test
    void name() throws IOException {
        CharacterService service = new CharacterService();
        service.resource = new ClassPathResource("characters.json");
        service.getPhoenixIds();
    }
}