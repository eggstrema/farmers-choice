package de.egga.farmerschoice.gear;

import com.fasterxml.jackson.annotation.*;
import java.util.List;
import java.util.Map;

public class RawGearItem {
    private String baseId;
    private List<RawRecipe> recipes;
    private long tier;
    private long requiredLevel;
    private Map<String, Double> stats;
    private String mark;
    private long cost;
    private String image;
    private String url;
    private List<RawIngredient> ingredients;
    private String name;

    @JsonProperty("base_id")
    public String getBaseId() { return baseId; }
    @JsonProperty("base_id")
    public void setBaseId(String value) { this.baseId = value; }

    @JsonProperty("recipes")
    public List<RawRecipe> getRecipes() { return recipes; }
    @JsonProperty("recipes")
    public void setRecipes(List<RawRecipe> value) { this.recipes = value; }

    @JsonProperty("tier")
    public long getTier() { return tier; }
    @JsonProperty("tier")
    public void setTier(long value) { this.tier = value; }

    @JsonProperty("required_level")
    public long getRequiredLevel() { return requiredLevel; }
    @JsonProperty("required_level")
    public void setRequiredLevel(long value) { this.requiredLevel = value; }

    @JsonProperty("stats")
    public Map<String, Double> getStats() { return stats; }
    @JsonProperty("stats")
    public void setStats(Map<String, Double> value) { this.stats = value; }

    @JsonProperty("mark")
    public String getMark() { return mark; }
    @JsonProperty("mark")
    public void setMark(String value) { this.mark = value; }

    @JsonProperty("cost")
    public long getCost() { return cost; }
    @JsonProperty("cost")
    public void setCost(long value) { this.cost = value; }

    @JsonProperty("image")
    public String getImage() { return image; }
    @JsonProperty("image")
    public void setImage(String value) { this.image = value; }

    @JsonProperty("url")
    public String getUrl() { return url; }
    @JsonProperty("url")
    public void setUrl(String value) { this.url = value; }

    @JsonProperty("ingredients")
    public List<RawIngredient> getIngredients() { return ingredients; }
    @JsonProperty("ingredients")
    public void setIngredients(List<RawIngredient> value) { this.ingredients = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }
}
