package de.egga.farmerschoice.characters;

import org.junit.jupiter.api.Test;

import java.io.IOException;

class CharacterServiceTest {

    @Test
    void name() throws IOException {
        CharacterService service = new CharacterService();
        service.getMyPhoenixCharacters();
    }
}