package de.egga.farmerschoice.toons;

import de.egga.farmerschoice.toons.repository.ToonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;

class ToonServiceTest {

    @Test
    void name() throws IOException {
        ToonService service = new ToonService();
        service.repository = new ToonRepository();
        service.repository.resource = new ClassPathResource("characters.json");
        service.getPhoenixIds();
    }
}