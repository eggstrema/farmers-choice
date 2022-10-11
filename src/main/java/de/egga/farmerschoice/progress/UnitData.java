package de.egga.farmerschoice.progress;

import com.fasterxml.jackson.annotation.*;
import java.util.List;
import java.util.Map;

public class UnitData {
    private String baseId;
    private String name;
    private long gearLevel;
    private long level;
    private long power;
    private long rarity;
    private List<Gear> gear;
    private String url;
    private Map<String, Double> stats;
    private Map<String, Double> statDiffs;
    private List<Object> zetaAbilities;
    private List<Object> omicronAbilities;
    private List<AbilityDatum> abilityData;
    private List<String> modSetIds;
    private long combatType;
    private long relicTier;
    private boolean hasUltimate;
    private boolean isGalacticLegend;

    @JsonProperty("base_id")
    public String getBaseId() { return baseId; }
    @JsonProperty("base_id")
    public void setBaseId(String value) { this.baseId = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("gear_level")
    public long getGearLevel() { return gearLevel; }
    @JsonProperty("gear_level")
    public void setGearLevel(long value) { this.gearLevel = value; }

    @JsonProperty("level")
    public long getLevel() { return level; }
    @JsonProperty("level")
    public void setLevel(long value) { this.level = value; }

    @JsonProperty("power")
    public long getPower() { return power; }
    @JsonProperty("power")
    public void setPower(long value) { this.power = value; }

    @JsonProperty("rarity")
    public long getRarity() { return rarity; }
    @JsonProperty("rarity")
    public void setRarity(long value) { this.rarity = value; }

    @JsonProperty("gear")
    public List<Gear> getGear() { return gear; }
    @JsonProperty("gear")
    public void setGear(List<Gear> value) { this.gear = value; }

    @JsonProperty("url")
    public String getUrl() { return url; }
    @JsonProperty("url")
    public void setUrl(String value) { this.url = value; }

    @JsonProperty("stats")
    public Map<String, Double> getStats() { return stats; }
    @JsonProperty("stats")
    public void setStats(Map<String, Double> value) { this.stats = value; }

    @JsonProperty("stat_diffs")
    public Map<String, Double> getStatDiffs() { return statDiffs; }
    @JsonProperty("stat_diffs")
    public void setStatDiffs(Map<String, Double> value) { this.statDiffs = value; }

    @JsonProperty("zeta_abilities")
    public List<Object> getZetaAbilities() { return zetaAbilities; }
    @JsonProperty("zeta_abilities")
    public void setZetaAbilities(List<Object> value) { this.zetaAbilities = value; }

    @JsonProperty("omicron_abilities")
    public List<Object> getOmicronAbilities() { return omicronAbilities; }
    @JsonProperty("omicron_abilities")
    public void setOmicronAbilities(List<Object> value) { this.omicronAbilities = value; }

    @JsonProperty("ability_data")
    public List<AbilityDatum> getAbilityData() { return abilityData; }
    @JsonProperty("ability_data")
    public void setAbilityData(List<AbilityDatum> value) { this.abilityData = value; }

    @JsonProperty("mod_set_ids")
    public List<String> getModSetIds() { return modSetIds; }
    @JsonProperty("mod_set_ids")
    public void setModSetIds(List<String> value) { this.modSetIds = value; }

    @JsonProperty("combat_type")
    public long getCombatType() { return combatType; }
    @JsonProperty("combat_type")
    public void setCombatType(long value) { this.combatType = value; }

    @JsonProperty("relic_tier")
    public long getRelicTier() { return relicTier; }
    @JsonProperty("relic_tier")
    public void setRelicTier(long value) { this.relicTier = value; }

    @JsonProperty("has_ultimate")
    public boolean getHasUltimate() { return hasUltimate; }
    @JsonProperty("has_ultimate")
    public void setHasUltimate(boolean value) { this.hasUltimate = value; }

    @JsonProperty("is_galactic_legend")
    public boolean getIsGalacticLegend() { return isGalacticLegend; }
    @JsonProperty("is_galactic_legend")
    public void setIsGalacticLegend(boolean value) { this.isGalacticLegend = value; }
}
