package de.egga.farmerschoice.progress.repository.raw;

import com.fasterxml.jackson.annotation.*;

public class AbilityDatum {
    private String id;
    private long abilityTier;
    private boolean isOmega;
    private boolean isZeta;
    private boolean isOmicron;
    private boolean hasOmicronLearned;
    private boolean hasZetaLearned;
    private String name;
    private long tierMax;

    @JsonProperty("id")
    public String getId() { return id; }
    @JsonProperty("id")
    public void setId(String value) { this.id = value; }

    @JsonProperty("ability_tier")
    public long getAbilityTier() { return abilityTier; }
    @JsonProperty("ability_tier")
    public void setAbilityTier(long value) { this.abilityTier = value; }

    @JsonProperty("is_omega")
    public boolean getIsOmega() { return isOmega; }
    @JsonProperty("is_omega")
    public void setIsOmega(boolean value) { this.isOmega = value; }

    @JsonProperty("is_zeta")
    public boolean getIsZeta() { return isZeta; }
    @JsonProperty("is_zeta")
    public void setIsZeta(boolean value) { this.isZeta = value; }

    @JsonProperty("is_omicron")
    public boolean getIsOmicron() { return isOmicron; }
    @JsonProperty("is_omicron")
    public void setIsOmicron(boolean value) { this.isOmicron = value; }

    @JsonProperty("has_omicron_learned")
    public boolean getHasOmicronLearned() { return hasOmicronLearned; }
    @JsonProperty("has_omicron_learned")
    public void setHasOmicronLearned(boolean value) { this.hasOmicronLearned = value; }

    @JsonProperty("has_zeta_learned")
    public boolean getHasZetaLearned() { return hasZetaLearned; }
    @JsonProperty("has_zeta_learned")
    public void setHasZetaLearned(boolean value) { this.hasZetaLearned = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("tier_max")
    public long getTierMax() { return tierMax; }
    @JsonProperty("tier_max")
    public void setTierMax(long value) { this.tierMax = value; }
}
