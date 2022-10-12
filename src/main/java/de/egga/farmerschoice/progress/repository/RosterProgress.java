package de.egga.farmerschoice.progress.repository;

import java.util.ArrayList;
import java.util.List;

public class RosterProgress {

    private List<ToonProgress> toons = new ArrayList<>();

    public void add(ToonProgress toon) {
        toons.add(toon);
    }

    public List<ToonProgress> getToons() {
        return toons;
    }
}
