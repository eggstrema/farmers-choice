package de.egga.farmerschoice.progress;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Mod {
    private String id;
    private long level;
    private long tier;
    private long rarity;
    private long set;
    private long slot;
    private PrimaryStat primaryStat;
    private String character;
    private List<SecondaryStat> secondaryStats;
    private long rerollCount;

    @JsonProperty("id")
    public String getId() { return id; }
    @JsonProperty("id")
    public void setId(String value) { this.id = value; }

    @JsonProperty("level")
    public long getLevel() { return level; }
    @JsonProperty("level")
    public void setLevel(long value) { this.level = value; }

    @JsonProperty("tier")
    public long getTier() { return tier; }
    @JsonProperty("tier")
    public void setTier(long value) { this.tier = value; }

    @JsonProperty("rarity")
    public long getRarity() { return rarity; }
    @JsonProperty("rarity")
    public void setRarity(long value) { this.rarity = value; }

    @JsonProperty("set")
    public long getSet() { return set; }
    @JsonProperty("set")
    public void setSet(long value) { this.set = value; }

    @JsonProperty("slot")
    public long getSlot() { return slot; }
    @JsonProperty("slot")
    public void setSlot(long value) { this.slot = value; }

    @JsonProperty("primary_stat")
    public PrimaryStat getPrimaryStat() { return primaryStat; }
    @JsonProperty("primary_stat")
    public void setPrimaryStat(PrimaryStat value) { this.primaryStat = value; }

    @JsonProperty("character")
    public String getCharacter() { return character; }
    @JsonProperty("character")
    public void setCharacter(String value) { this.character = value; }

    @JsonProperty("secondary_stats")
    public List<SecondaryStat> getSecondaryStats() { return secondaryStats; }
    @JsonProperty("secondary_stats")
    public void setSecondaryStats(List<SecondaryStat> value) { this.secondaryStats = value; }

    @JsonProperty("reroll_count")
    public long getRerollCount() { return rerollCount; }
    @JsonProperty("reroll_count")
    public void setRerollCount(long value) { this.rerollCount = value; }
}
