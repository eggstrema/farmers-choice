package de.egga.farmerschoice.gear;

import com.fasterxml.jackson.annotation.*;

public class RawIngredient {
    private long amount;
    private String gear;

    @JsonProperty("amount")
    public long getAmount() { return amount; }
    @JsonProperty("amount")
    public void setAmount(long value) { this.amount = value; }

    @JsonProperty("gear")
    public String getGear() { return gear; }
    @JsonProperty("gear")
    public void setGear(String value) { this.gear = value; }
}
