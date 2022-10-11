package de.egga.farmerschoice.progress;

import com.fasterxml.jackson.annotation.*;

public class PrimaryStat {
    private String name;
    private long statId;
    private long value;
    private String displayValue;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("stat_id")
    public long getStatId() { return statId; }
    @JsonProperty("stat_id")
    public void setStatId(long value) { this.statId = value; }

    @JsonProperty("value")
    public long getValue() { return value; }
    @JsonProperty("value")
    public void setValue(long value) { this.value = value; }

    @JsonProperty("display_value")
    public String getDisplayValue() { return displayValue; }
    @JsonProperty("display_value")
    public void setDisplayValue(String value) { this.displayValue = value; }
}
