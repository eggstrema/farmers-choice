package de.egga.farmerschoice.progress;

import de.egga.farmerschoice.progress.repository.ProgresssRepository;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.util.List;

class ServiceTest {

    @Test
    void name() throws IOException {
        ProgressService service = new ProgressService();
        service.repository = new ProgresssRepository();
        service.repository.resource = new ClassPathResource("progress.json");

        List<String> phoenixIds = List.of("HERASYNDULLAS3");
        String myProgress = service.getMyProgress(phoenixIds);

    }
}