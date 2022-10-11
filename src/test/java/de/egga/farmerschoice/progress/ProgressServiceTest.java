package de.egga.farmerschoice.progress;

import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.util.List;

class ProgressServiceTest {

    @Test
    void name() throws IOException {
        ProgressService service = new ProgressService();
        service.resource = new ClassPathResource("progress.json");

        List<String> phoenixIds = List.of("HERASYNDULLAS3");
        String myProgress = service.getMyProgress(phoenixIds);

    }
}