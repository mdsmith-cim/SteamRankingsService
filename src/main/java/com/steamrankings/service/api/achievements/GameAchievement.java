package com.steamrankings.service.api.achievements;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.joda.time.DateTime;

public class GameAchievement {
    @JsonProperty("app_id")
    private int appId;

    @JsonProperty("achievement_id")
    private String achievementId;

    @JsonProperty("unlocked_icon_url")
    private String unlockedIconUrl;

    @JsonProperty("locked_icon_url")
    private String lockedIconUrl;

    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    @JsonProperty("unlocked_timestamp")
    private DateTime unlockedTimestamp;

    public GameAchievement(int appId, String achievementId) {
        this.appId = appId;
        this.achievementId = achievementId;
    }

    public GameAchievement(int appId, String achievementId, String name, String description, String unlockedIconUrl, String lockedIconUrl, DateTime unlockedTimestamp) {
        this.appId = appId;
        this.achievementId = achievementId;
        this.name = name;
        this.description = description;
        this.unlockedIconUrl = unlockedIconUrl;
        this.lockedIconUrl = lockedIconUrl;
        this.unlockedTimestamp = new DateTime(unlockedTimestamp);
    }

    @JsonIgnore
    public int getAppId() {
        return this.appId;
    }

    @JsonIgnore
    public String getAchievementId() {
        return this.achievementId;
    }

    @JsonIgnore
    public String getUnlockedIconUrl() {
        return this.unlockedIconUrl;
    }

    @JsonIgnore
    public String getLockedIconUrl() {
        return this.lockedIconUrl;
    }

    @JsonIgnore
    public String getName() {
        return this.name;
    }

    @JsonIgnore
    public String getDescription() {
        return this.description;
    }

    @JsonIgnore
    public DateTime getUnlockedTimestamp() {
        return this.unlockedTimestamp;
    }
}
