package de.egga.farmerschoice.progress;

import com.fasterxml.jackson.annotation.*;

public class Unit {
    private UnitData data;

    @JsonProperty("data")
    public UnitData getData() { return data; }
    @JsonProperty("data")
    public void setData(UnitData value) { this.data = value; }
}
