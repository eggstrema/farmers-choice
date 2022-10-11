package de.egga.farmerschoice.progress;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class SecondaryStat {
    private String name;
    private long statId;
    private double value;
    private String displayValue;
    private long roll;
    private List<Long> unscaledRollValues;
    private long statMax;
    private long statMin;
    private List<String> statRolls;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("stat_id")
    public long getStatId() { return statId; }
    @JsonProperty("stat_id")
    public void setStatId(long value) { this.statId = value; }

    @JsonProperty("value")
    public double getValue() { return value; }
    @JsonProperty("value")
    public void setValue(double value) { this.value = value; }

    @JsonProperty("display_value")
    public String getDisplayValue() { return displayValue; }
    @JsonProperty("display_value")
    public void setDisplayValue(String value) { this.displayValue = value; }

    @JsonProperty("roll")
    public long getRoll() { return roll; }
    @JsonProperty("roll")
    public void setRoll(long value) { this.roll = value; }

    @JsonProperty("unscaled_roll_values")
    public List<Long> getUnscaledRollValues() { return unscaledRollValues; }
    @JsonProperty("unscaled_roll_values")
    public void setUnscaledRollValues(List<Long> value) { this.unscaledRollValues = value; }

    @JsonProperty("stat_max")
    public long getStatMax() { return statMax; }
    @JsonProperty("stat_max")
    public void setStatMax(long value) { this.statMax = value; }

    @JsonProperty("stat_min")
    public long getStatMin() { return statMin; }
    @JsonProperty("stat_min")
    public void setStatMin(long value) { this.statMin = value; }

    @JsonProperty("stat_rolls")
    public List<String> getStatRolls() { return statRolls; }
    @JsonProperty("stat_rolls")
    public void setStatRolls(List<String> value) { this.statRolls = value; }
}
