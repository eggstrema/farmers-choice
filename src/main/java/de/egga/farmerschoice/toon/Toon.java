package de.egga.farmerschoice.toon;

import java.util.List;

public class Toon {

    private String name;
    private String base_id;
    private String pk;
    private String url;
    private String image;
    private String power;
    private String description;
    private Integer combat_type;
    private String alignment;
    private List<String> categories;
    private List<GearLevel> gear_levels;
    private List<String> ability_classes;
    private String role;
    private String ship;
    private String ship_slot;
    private String activate_shard_count;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBase_id() {
        return base_id;
    }

    public void setBase_id(String base_id) {
        this.base_id = base_id;
    }

    public String getPk() {
        return pk;
    }

    public void setPk(String pk) {
        this.pk = pk;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCombat_type() {
        return combat_type;
    }

    public void setCombat_type(Integer combat_type) {
        this.combat_type = combat_type;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public List<String> getAbility_classes() {
        return ability_classes;
    }

    public void setAbility_classes(List<String> ability_classes) {
        this.ability_classes = ability_classes;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getShip() {
        return ship;
    }

    public void setShip(String ship) {
        this.ship = ship;
    }

    public String getShip_slot() {
        return ship_slot;
    }

    public void setShip_slot(String ship_slot) {
        this.ship_slot = ship_slot;
    }

    public String getActivate_shard_count() {
        return activate_shard_count;
    }

    public void setActivate_shard_count(String activate_shard_count) {
        this.activate_shard_count = activate_shard_count;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<GearLevel> getGear_levels() {
        return gear_levels;
    }

    public void setGear_levels(List<GearLevel> gear_levels) {
        this.gear_levels = gear_levels;
    }
}
