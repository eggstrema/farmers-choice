package de.egga.farmerschoice.toons;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ToonIdTest {

    @Test
    void two_instances_with_same_id_are_considered_equal() {
        ToonId anyId = new ToonId("OLDBENKENOBI");
        ToonId sameId = new ToonId("OLDBENKENOBI");
        assertThat(anyId).isEqualTo(sameId);
    }
}