package de.egga.farmerschoice.toons.repository.raw;

import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class RawToonReaderTest {

    @Test
    void all_toons_are_read_from_resource() {
        RawToonReader reader = new RawToonReader();
        reader.resource = new ClassPathResource("characters.json");
        List<RawToon> toons = reader.readRawToons();
        assertThat(toons).hasSize(233);
    }
}