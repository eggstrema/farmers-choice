package de.egga.farmerschoice.toons.repository.raw;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class RawGearLevel {
    private long tier;
    private List<String> gear;

    @JsonProperty("tier")
    public long getTier() { return tier; }
    @JsonProperty("tier")
    public void setTier(long value) { this.tier = value; }

    @JsonProperty("gear")
    public List<String> getGear() { return gear; }
    @JsonProperty("gear")
    public void setGear(List<String> value) { this.gear = value; }
}
