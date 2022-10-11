package de.egga.farmerschoice.progress;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

class ProgressServiceTest {

    @Test
    void name() throws IOException {
        ProgressService service = new ProgressService();
        List<String> phoenixIds = List.of("HERASYNDULLAS3");
        String myProgress = service.getMyProgress(phoenixIds);

    }
}