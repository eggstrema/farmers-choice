package de.egga.farmerschoice.gear;

import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class RawGearReaderTest {

    @Test
    void name() {
        RawGearReader reader = new RawGearReader();
        reader.resource = new ClassPathResource("gear.json");

        List<RawGearItem> rawGearItems = reader.readRawGear();

        Map<String, RawGearItem> byId = new HashMap<>();
        Map<String, String> names = new HashMap<>();
        for (RawGearItem rawItem : rawGearItems) {
            String baseId = rawItem.getBaseId();
            String name = rawItem.getName();
            byId.put(baseId, rawItem);
            names.put(baseId, name);
        }


        RawGearItem rawItem = byId.get("171");
        String baseId = rawItem.getBaseId();
        String name = rawItem.getName();

        System.out.println(name + ">" + baseId);
        List<RawIngredient> ingredients = rawItem.getIngredients();
        for (RawIngredient ingredient : ingredients) {
            String gear = ingredient.getGear();
            //System.out.println("--" + gear);
            String s = names.get(gear);
            System.out.println(":::"+s);
        }
    }
}