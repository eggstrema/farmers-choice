package de.egga.farmerschoice.toons;

import de.egga.farmerschoice.toons.repository.ToonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class ToonServiceTest {

    @Test
    void name() throws IOException {
        ToonService service = new ToonService();
        service.repository = new ToonRepository();
        service.repository.resource = new ClassPathResource("characters.json");
        service.getPhoenixIds();
    }

    @Test
    void service_fetches_toons_from_repository() {
        ToonService service = new ToonService();
        service.repository = mock(ToonRepository.class);
        service.getAllPhoenixToons();
        verify(service.repository).findAllPhoenixToons();
    }
}