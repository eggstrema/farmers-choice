package de.egga.farmerschoice.toons.repository;

import de.egga.farmerschoice.toons.Toon;
import de.egga.farmerschoice.toons.ToonId;
import org.jetbrains.annotations.Nullable;

import java.util.*;

public class ToonCategories {

    private final Map<ToonId, List<ToonCategory>> categories = new HashMap<>();

    public ToonCategories(Toon... toons) {
        for (Toon toon : toons) {
            add(toon);
        }
    }

    void add(Toon toon) {
        categories.put(toon.id(), toon.categories());
    }

    public List<ToonCategory> of(ToonId id) {
        return categories.get(id);
    }
}
