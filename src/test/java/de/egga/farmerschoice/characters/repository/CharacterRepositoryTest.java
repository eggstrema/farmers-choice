package de.egga.farmerschoice.characters.repository;

import de.egga.farmerschoice.characters.Toon;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CharacterRepositoryTest {

    @Test
    void toons_are_read_from_repository_and_mapped_to_domain_model() {
        CharacterRepository repository = new CharacterRepository();
        repository.resource = new ClassPathResource("characters.json");
        List<Toon> characters = repository.readAllCharacters2();
        assertThat(characters).containsExactly(new Toon("LUMINARAUNDULI"));
    }
}