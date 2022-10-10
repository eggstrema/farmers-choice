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

        ToonReader mapper = new ToonReader();
        List<Toon> toons = mapper.map(fileContent);

        assertThat(toons).isNotEmpty();

        assertThat(toons.get(0).getName()).isEqualTo("Admiral Ackbar");
    }

}
