package de.egga.farmerschoice.toons.repository;

import de.egga.farmerschoice.toons.Toon;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ToonRepositoryTest {

    @Test
    void all_toons_are_read_from_repository() {
        ToonRepository repository = new ToonRepository();
        repository.resource = new ClassPathResource("toons.json");
        List<Toon> toons = repository.readAllToons();
        assertThat(toons).hasSize(233);
    }

    @Test
    void base_id_is_mapped() {
        ToonRepository repository = new ToonRepository();
        repository.resource = new ClassPathResource("toons.json");
        List<Toon> toons = repository.readAllToons();
        assertThat(toons.get(0).baseId()).isEqualTo("50RT");
    }

    @Test
    void findAllPhoenixToons_finds_exactly_six_toons() {
        ToonRepository repository = new ToonRepository();
        repository.resource = new ClassPathResource("toons.json");
        List<Toon> toons = repository.findAllPhoenixToons();
        assertThat(toons).hasSize(6);
    }
}