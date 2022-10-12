package de.egga.farmerschoice.toons.repository;

import de.egga.farmerschoice.toons.Toon;
import de.egga.farmerschoice.toons.ToonId;
import de.egga.farmerschoice.toons.repository.raw.RawToonReader;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;

import java.util.List;

import static de.egga.farmerschoice.toons.ToonFactory.rey;
import static org.assertj.core.api.Assertions.assertThat;

class ToonRepositoryTest {

    @Test
    void categories_are_mapped_to_base_id() {
        ToonRepository repository = new ToonRepository();
        repository.rawToonReader = new RawToonReader();
        repository.rawToonReader.resource = new ClassPathResource("characters.json");
        ToonCategories categories = repository.readAllCategories();

        ToonCategory[] reysCategories = rey().categories().toArray(new ToonCategory[0]);
        assertThat(categories.of(rey().id())).containsExactlyInAnyOrder(reysCategories);
    }
}