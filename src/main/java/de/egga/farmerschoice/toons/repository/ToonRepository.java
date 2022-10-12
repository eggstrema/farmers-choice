package de.egga.farmerschoice.toons.repository;

import de.egga.farmerschoice.toons.Toon;
import de.egga.farmerschoice.toons.ToonId;
import de.egga.farmerschoice.toons.repository.raw.RawToon;
import de.egga.farmerschoice.toons.repository.raw.RawToonReader;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

import static de.egga.farmerschoice.toons.repository.ToonCategory.Phoenix;

@Repository
public class ToonRepository {

    @Autowired
    RawToonReader rawToonReader;

    public ToonCategories readAllCategories() {
        ToonCategories characters = new ToonCategories();

        for (RawToon rawToon : rawToonReader.readRawToons()) {
            String rawId = rawToon.getBaseId();

            ToonId id = new ToonId(rawId);
            List<ToonCategory> categories = getCategories(rawToon);

            characters.add(new Toon(id, categories));
        }
        return characters;
    }

    @NotNull
    private List<ToonCategory> getCategories(RawToon rawToon) {
        List<ToonCategory> categories = new ArrayList<>();

        for (String rawCategory : rawToon.getCategories()) {
            categories.add(ToonCategory.of(rawCategory));
        }
        return categories;
    }
}