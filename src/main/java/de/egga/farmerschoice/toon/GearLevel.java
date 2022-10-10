package de.egga.farmerschoice.toon;

import java.util.List;

public class GearLevel {

    private Integer tier;
    private List<String> gear;

    public Integer getTier() {
        return tier;
    }

    public void setTier(Integer tier) {
        this.tier = tier;
    }

    public List<String> getGear() {
        return gear;
    }

    public void setGear(List<String> gear) {
        this.gear = gear;
    }
}
