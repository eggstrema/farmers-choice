package de.egga.farmerschoice.toons;

import de.egga.farmerschoice.toons.repository.ToonCategory;

public record Toon(ToonId id, java.util.List<ToonCategory> categories) {

}
