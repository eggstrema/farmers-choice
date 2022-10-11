package de.egga.farmerschoice.progress;

import com.fasterxml.jackson.annotation.*;

public class Gear {
    private long slot;
    private boolean isObtained;
    private String baseId;

    @JsonProperty("slot")
    public long getSlot() { return slot; }
    @JsonProperty("slot")
    public void setSlot(long value) { this.slot = value; }

    @JsonProperty("is_obtained")
    public boolean getIsObtained() { return isObtained; }
    @JsonProperty("is_obtained")
    public void setIsObtained(boolean value) { this.isObtained = value; }

    @JsonProperty("base_id")
    public String getBaseId() { return baseId; }
    @JsonProperty("base_id")
    public void setBaseId(String value) { this.baseId = value; }
}
