package de.egga.farmerschoice.progress.repository.raw;

import com.fasterxml.jackson.annotation.*;
import de.egga.farmerschoice.progress.repository.raw.Arena;
import de.egga.farmerschoice.progress.repository.raw.FleetArena;

import java.time.OffsetDateTime;
import java.util.List;

public class WelcomeData {
    private long allyCode;
    private String arenaLeaderBaseId;
    private long arenaRank;
    private long level;
    private String name;
    private OffsetDateTime lastUpdated;
    private long galacticPower;
    private long characterGalacticPower;
    private long shipGalacticPower;
    private long shipBattlesWon;
    private long pvpBattlesWon;
    private long pveBattlesWon;
    private long pveHardWon;
    private long galacticWarWon;
    private long guildRaidWon;
    private long guildContribution;
    private long guildExchangeDonations;
    private long seasonFullClears;
    private long seasonSuccessfulDefends;
    private long seasonLeagueScore;
    private long seasonUndersizedSquadWins;
    private long seasonPromotionsEarned;
    private long seasonBannersEarned;
    private long seasonOffensiveBattlesWon;
    private long seasonTerritoriesDefeated;
    private String url;
    private Arena arena;
    private FleetArena fleetArena;
    private long skillRating;
    private String divisionNumber;
    private String leagueName;
    private String leagueFrameImage;
    private String leagueBlankImage;
    private String leagueImage;
    private String divisionImage;
    private String portraitImage;
    private String title;
    private String guildId;
    private String guildName;
    private String guildUrl;
    private List<Object> mods;

    @JsonProperty("ally_code")
    public long getAllyCode() { return allyCode; }
    @JsonProperty("ally_code")
    public void setAllyCode(long value) { this.allyCode = value; }

    @JsonProperty("arena_leader_base_id")
    public String getArenaLeaderBaseId() { return arenaLeaderBaseId; }
    @JsonProperty("arena_leader_base_id")
    public void setArenaLeaderBaseId(String value) { this.arenaLeaderBaseId = value; }

    @JsonProperty("arena_rank")
    public long getArenaRank() { return arenaRank; }
    @JsonProperty("arena_rank")
    public void setArenaRank(long value) { this.arenaRank = value; }

    @JsonProperty("level")
    public long getLevel() { return level; }
    @JsonProperty("level")
    public void setLevel(long value) { this.level = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("last_updated")
    public OffsetDateTime getLastUpdated() { return lastUpdated; }
    @JsonProperty("last_updated")
    public void setLastUpdated(OffsetDateTime value) { this.lastUpdated = value; }

    @JsonProperty("galactic_power")
    public long getGalacticPower() { return galacticPower; }
    @JsonProperty("galactic_power")
    public void setGalacticPower(long value) { this.galacticPower = value; }

    @JsonProperty("character_galactic_power")
    public long getCharacterGalacticPower() { return characterGalacticPower; }
    @JsonProperty("character_galactic_power")
    public void setCharacterGalacticPower(long value) { this.characterGalacticPower = value; }

    @JsonProperty("ship_galactic_power")
    public long getShipGalacticPower() { return shipGalacticPower; }
    @JsonProperty("ship_galactic_power")
    public void setShipGalacticPower(long value) { this.shipGalacticPower = value; }

    @JsonProperty("ship_battles_won")
    public long getShipBattlesWon() { return shipBattlesWon; }
    @JsonProperty("ship_battles_won")
    public void setShipBattlesWon(long value) { this.shipBattlesWon = value; }

    @JsonProperty("pvp_battles_won")
    public long getPvpBattlesWon() { return pvpBattlesWon; }
    @JsonProperty("pvp_battles_won")
    public void setPvpBattlesWon(long value) { this.pvpBattlesWon = value; }

    @JsonProperty("pve_battles_won")
    public long getPveBattlesWon() { return pveBattlesWon; }
    @JsonProperty("pve_battles_won")
    public void setPveBattlesWon(long value) { this.pveBattlesWon = value; }

    @JsonProperty("pve_hard_won")
    public long getPveHardWon() { return pveHardWon; }
    @JsonProperty("pve_hard_won")
    public void setPveHardWon(long value) { this.pveHardWon = value; }

    @JsonProperty("galactic_war_won")
    public long getGalacticWarWon() { return galacticWarWon; }
    @JsonProperty("galactic_war_won")
    public void setGalacticWarWon(long value) { this.galacticWarWon = value; }

    @JsonProperty("guild_raid_won")
    public long getGuildRaidWon() { return guildRaidWon; }
    @JsonProperty("guild_raid_won")
    public void setGuildRaidWon(long value) { this.guildRaidWon = value; }

    @JsonProperty("guild_contribution")
    public long getGuildContribution() { return guildContribution; }
    @JsonProperty("guild_contribution")
    public void setGuildContribution(long value) { this.guildContribution = value; }

    @JsonProperty("guild_exchange_donations")
    public long getGuildExchangeDonations() { return guildExchangeDonations; }
    @JsonProperty("guild_exchange_donations")
    public void setGuildExchangeDonations(long value) { this.guildExchangeDonations = value; }

    @JsonProperty("season_full_clears")
    public long getSeasonFullClears() { return seasonFullClears; }
    @JsonProperty("season_full_clears")
    public void setSeasonFullClears(long value) { this.seasonFullClears = value; }

    @JsonProperty("season_successful_defends")
    public long getSeasonSuccessfulDefends() { return seasonSuccessfulDefends; }
    @JsonProperty("season_successful_defends")
    public void setSeasonSuccessfulDefends(long value) { this.seasonSuccessfulDefends = value; }

    @JsonProperty("season_league_score")
    public long getSeasonLeagueScore() { return seasonLeagueScore; }
    @JsonProperty("season_league_score")
    public void setSeasonLeagueScore(long value) { this.seasonLeagueScore = value; }

    @JsonProperty("season_undersized_squad_wins")
    public long getSeasonUndersizedSquadWins() { return seasonUndersizedSquadWins; }
    @JsonProperty("season_undersized_squad_wins")
    public void setSeasonUndersizedSquadWins(long value) { this.seasonUndersizedSquadWins = value; }

    @JsonProperty("season_promotions_earned")
    public long getSeasonPromotionsEarned() { return seasonPromotionsEarned; }
    @JsonProperty("season_promotions_earned")
    public void setSeasonPromotionsEarned(long value) { this.seasonPromotionsEarned = value; }

    @JsonProperty("season_banners_earned")
    public long getSeasonBannersEarned() { return seasonBannersEarned; }
    @JsonProperty("season_banners_earned")
    public void setSeasonBannersEarned(long value) { this.seasonBannersEarned = value; }

    @JsonProperty("season_offensive_battles_won")
    public long getSeasonOffensiveBattlesWon() { return seasonOffensiveBattlesWon; }
    @JsonProperty("season_offensive_battles_won")
    public void setSeasonOffensiveBattlesWon(long value) { this.seasonOffensiveBattlesWon = value; }

    @JsonProperty("season_territories_defeated")
    public long getSeasonTerritoriesDefeated() { return seasonTerritoriesDefeated; }
    @JsonProperty("season_territories_defeated")
    public void setSeasonTerritoriesDefeated(long value) { this.seasonTerritoriesDefeated = value; }

    @JsonProperty("url")
    public String getUrl() { return url; }
    @JsonProperty("url")
    public void setUrl(String value) { this.url = value; }

    @JsonProperty("arena")
    public Arena getArena() { return arena; }
    @JsonProperty("arena")
    public void setArena(Arena value) { this.arena = value; }

    @JsonProperty("fleet_arena")
    public FleetArena getFleetArena() { return fleetArena; }
    @JsonProperty("fleet_arena")
    public void setFleetArena(FleetArena value) { this.fleetArena = value; }

    @JsonProperty("skill_rating")
    public long getSkillRating() { return skillRating; }
    @JsonProperty("skill_rating")
    public void setSkillRating(long value) { this.skillRating = value; }

    @JsonProperty("division_number")
    public String getDivisionNumber() { return divisionNumber; }
    @JsonProperty("division_number")
    public void setDivisionNumber(String value) { this.divisionNumber = value; }

    @JsonProperty("league_name")
    public String getLeagueName() { return leagueName; }
    @JsonProperty("league_name")
    public void setLeagueName(String value) { this.leagueName = value; }

    @JsonProperty("league_frame_image")
    public String getLeagueFrameImage() { return leagueFrameImage; }
    @JsonProperty("league_frame_image")
    public void setLeagueFrameImage(String value) { this.leagueFrameImage = value; }

    @JsonProperty("league_blank_image")
    public String getLeagueBlankImage() { return leagueBlankImage; }
    @JsonProperty("league_blank_image")
    public void setLeagueBlankImage(String value) { this.leagueBlankImage = value; }

    @JsonProperty("league_image")
    public String getLeagueImage() { return leagueImage; }
    @JsonProperty("league_image")
    public void setLeagueImage(String value) { this.leagueImage = value; }

    @JsonProperty("division_image")
    public String getDivisionImage() { return divisionImage; }
    @JsonProperty("division_image")
    public void setDivisionImage(String value) { this.divisionImage = value; }

    @JsonProperty("portrait_image")
    public String getPortraitImage() { return portraitImage; }
    @JsonProperty("portrait_image")
    public void setPortraitImage(String value) { this.portraitImage = value; }

    @JsonProperty("title")
    public String getTitle() { return title; }
    @JsonProperty("title")
    public void setTitle(String value) { this.title = value; }

    @JsonProperty("guild_id")
    public String getGuildId() { return guildId; }
    @JsonProperty("guild_id")
    public void setGuildId(String value) { this.guildId = value; }

    @JsonProperty("guild_name")
    public String getGuildName() { return guildName; }
    @JsonProperty("guild_name")
    public void setGuildName(String value) { this.guildName = value; }

    @JsonProperty("guild_url")
    public String getGuildUrl() { return guildUrl; }
    @JsonProperty("guild_url")
    public void setGuildUrl(String value) { this.guildUrl = value; }

    @JsonProperty("mods")
    public List<Object> getMods() { return mods; }
    @JsonProperty("mods")
    public void setMods(List<Object> value) { this.mods = value; }
}
