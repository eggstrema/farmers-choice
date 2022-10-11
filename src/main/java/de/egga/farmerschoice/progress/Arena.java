package de.egga.farmerschoice.progress;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Arena {
    private long rank;
    private String leader;
    private List<String> members;

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
}
