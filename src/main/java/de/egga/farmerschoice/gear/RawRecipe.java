package de.egga.farmerschoice.gear;

import com.fasterxml.jackson.annotation.*;

import java.util.List;

public class RawRecipe {
    private String baseId;
    private String resultId;
    private long cost;
    private List<RawIngredient> ingredients;

    @JsonProperty("base_id")
    public String getBaseId() {
        return baseId;
    }

    @JsonProperty("base_id")
    public void setBaseId(String value) {
        this.baseId = value;
    }

    @JsonProperty("result_id")
    public String getResultId() {
        return resultId;
    }

    @JsonProperty("result_id")
    public void setResultId(String value) {
        this.resultId = value;
    }

    @JsonProperty("cost")
    public long getCost() {
        return cost;
    }

    @JsonProperty("cost")
    public void setCost(long value) {
        this.cost = value;
    }

    @JsonProperty("ingredients")
    public List<RawIngredient> getIngredients() {
        return ingredients;
    }

    @JsonProperty("ingredients")
    public void setIngredients(List<RawIngredient> value) {
        this.ingredients = value;
    }
}
