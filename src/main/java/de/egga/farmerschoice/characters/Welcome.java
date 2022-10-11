package de.egga.farmerschoice.characters;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Welcome {
    private String name;
    private String baseId;
    private long pk;
    private String url;
    private String image;
    private long power;
    private String description;
    private long combatType;
    private List<GearLevel> gearLevels;
    private String alignment;
    private List<String> categories;
    private List<String> abilityClasses;
    private String role;
    private String ship;
    private Long shipSlot;
    private long activateShardCount;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("base_id")
    public String getBaseId() { return baseId; }
    @JsonProperty("base_id")
    public void setBaseId(String value) { this.baseId = value; }

    @JsonProperty("pk")
    public long getPk() { return pk; }
    @JsonProperty("pk")
    public void setPk(long value) { this.pk = value; }

    @JsonProperty("url")
    public String getUrl() { return url; }
    @JsonProperty("url")
    public void setUrl(String value) { this.url = value; }

    @JsonProperty("image")
    public String getImage() { return image; }
    @JsonProperty("image")
    public void setImage(String value) { this.image = value; }

    @JsonProperty("power")
    public long getPower() { return power; }
    @JsonProperty("power")
    public void setPower(long value) { this.power = value; }

    @JsonProperty("description")
    public String getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(String value) { this.description = value; }

    @JsonProperty("combat_type")
    public long getCombatType() { return combatType; }
    @JsonProperty("combat_type")
    public void setCombatType(long value) { this.combatType = value; }

    @JsonProperty("gear_levels")
    public List<GearLevel> getGearLevels() { return gearLevels; }
    @JsonProperty("gear_levels")
    public void setGearLevels(List<GearLevel> value) { this.gearLevels = value; }

    @JsonProperty("alignment")
    public String getAlignment() { return alignment; }
    @JsonProperty("alignment")
    public void setAlignment(String value) { this.alignment = value; }

    @JsonProperty("categories")
    public List<String> getCategories() { return categories; }
    @JsonProperty("categories")
    public void setCategories(List<String> value) { this.categories = value; }

    @JsonProperty("ability_classes")
    public List<String> getAbilityClasses() { return abilityClasses; }
    @JsonProperty("ability_classes")
    public void setAbilityClasses(List<String> value) { this.abilityClasses = value; }

    @JsonProperty("role")
    public String getRole() { return role; }
    @JsonProperty("role")
    public void setRole(String value) { this.role = value; }

    @JsonProperty("ship")
    public String getShip() { return ship; }
    @JsonProperty("ship")
    public void setShip(String value) { this.ship = value; }

    @JsonProperty("ship_slot")
    public Long getShipSlot() { return shipSlot; }
    @JsonProperty("ship_slot")
    public void setShipSlot(Long value) { this.shipSlot = value; }

    @JsonProperty("activate_shard_count")
    public long getActivateShardCount() { return activateShardCount; }
    @JsonProperty("activate_shard_count")
    public void setActivateShardCount(long value) { this.activateShardCount = value; }
}
