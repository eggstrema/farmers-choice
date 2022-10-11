package de.egga.farmerschoice.toons.repository;

import de.egga.farmerschoice.toons.Toon;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ToonRepositoryTest {

    @Test
    void toons_are_read_from_repository_and_mapped_to_domain_model() {
        ToonRepository repository = new ToonRepository();
        repository.resource = new ClassPathResource("characters.json");
        List<Toon> characters = repository.readAllCharacters2();
        assertThat(characters).containsExactly(new Toon("LUMINARAUNDULI"));
    }
}