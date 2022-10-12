package de.egga.farmerschoice.toons.repository;

import de.egga.farmerschoice.toons.repository.ToonCategory;
import org.junit.jupiter.api.Test;

import static de.egga.farmerschoice.toons.repository.ToonCategory.OldRepublic;
import static de.egga.farmerschoice.toons.repository.ToonCategory._501st;
import static org.assertj.core.api.Assertions.assertThat;

class ToonCategoryTest {

    @Test
    void of_ignores_white_space() {
        ToonCategory found = ToonCategory.of("Old Republic");
        assertThat(found).isEqualTo(OldRepublic);
    }

    @Test
    void of_can_handle_number_at_the_start() {
        ToonCategory found = ToonCategory.of("501st");
        assertThat(found).isEqualTo(_501st);
    }
}