package de.egga.farmerschoice.progress.repository.raw;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class FleetArena {
    private long rank;
    private String leader;
    private List<String> members;
    private List<String> reinforcements;

    @JsonProperty("rank")
    public long getRank() { return rank; }
    @JsonProperty("rank")
    public void setRank(long value) { this.rank = value; }

    @JsonProperty("leader")
    public String getLeader() { return leader; }
    @JsonProperty("leader")
    public void setLeader(String value) { this.leader = value; }

    @JsonProperty("members")
    public List<String> getMembers() { return members; }
    @JsonProperty("members")
    public void setMembers(List<String> value) { this.members = value; }

    @JsonProperty("reinforcements")
    public List<String> getReinforcements() { return reinforcements; }
    @JsonProperty("reinforcements")
    public void setReinforcements(List<String> value) { this.reinforcements = value; }
}
