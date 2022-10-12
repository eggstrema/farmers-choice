package de.egga.farmerschoice.toons.repository;

import de.egga.farmerschoice.toons.Toon;
import org.junit.jupiter.api.Test;

import java.util.List;

import static de.egga.farmerschoice.toons.ToonFactory.jango;
import static de.egga.farmerschoice.toons.ToonFactory.rey;
import static de.egga.farmerschoice.toons.repository.ToonCategory.*;
import static org.assertj.core.api.Assertions.assertThat;

class ToonCategoriesTest {

    @Test
    void all_categories_of_toon_are_returned() {
        Toon jango = jango();
        ToonCategories toonCategories = new ToonCategories(jango);
        List<ToonCategory> categories = toonCategories.of(jango.id());
        assertThat(categories).containsExactlyInAnyOrder(
                BountyHunter, Mandalorian, Leader,
                Attacker, Scoundrel, Separatist);
    }

    @Test
    void all_categories_of_all_toons_are_returned() {
        ToonCategories toonCategories = new ToonCategories(jango(), rey());
        List<ToonCategory> categories = toonCategories.of(rey().id());
        assertThat(categories).containsExactlyInAnyOrder(
                Attacker, GalacticLegend, Leader,
                Resistance, UnalignedForceUser);
    }
}