package de.egga.farmerschoice;

import de.egga.farmerschoice.toon.Toon;
import de.egga.farmerschoice.toon.ToonReader;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import static java.nio.file.Path.of;
import static org.assertj.core.api.Assertions.assertThat;

public class ToonReaderTest {

    @Test
    void name() throws IOException {
        String jsonUrl = "src/test/resources/toons_small.json";
        String fileContent = Files.readString(of(jsonUrl));

        ToonReader reader = new ToonReader();
        List<Toon> toons = reader.map(fileContent);

        assertThat(toons.get(0).getName()).isEqualTo("Admiral Ackbar");
    }
}
