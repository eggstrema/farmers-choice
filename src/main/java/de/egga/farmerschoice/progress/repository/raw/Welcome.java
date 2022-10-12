package de.egga.farmerschoice.progress.repository.raw;

import com.fasterxml.jackson.annotation.*;

import java.util.List;

public class Welcome {
    private List<Unit> units;
    private List<Mod> mods;
    private List<Object> datacrons;
    private WelcomeData data;

    @JsonProperty("units")
    public List<Unit> getUnits() { return units; }
    @JsonProperty("units")
    public void setUnits(List<Unit> value) { this.units = value; }

    @JsonProperty("mods")
    public List<Mod> getMods() { return mods; }
    @JsonProperty("mods")
    public void setMods(List<Mod> value) { this.mods = value; }

    @JsonProperty("datacrons")
    public List<Object> getDatacrons() { return datacrons; }
    @JsonProperty("datacrons")
    public void setDatacrons(List<Object> value) { this.datacrons = value; }

    @JsonProperty("data")
    public WelcomeData getData() { return data; }
    @JsonProperty("data")
    public void setData(WelcomeData value) { this.data = value; }
}
