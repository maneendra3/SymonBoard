package com.kohls.symon.board.mongoentities;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;


@Document
public class LEDBoardMongoEntity {

    @Id
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    public Integer task_id; ;
    public Float  pkd ;
    public Float  srt;
    private String packWave;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String status;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Integer msgTotes;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Integer chutes;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String duration;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Integer availableChutes;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Integer completedChutes;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Integer fullChutes;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Date lastUpdated;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String ledLocation;

    public void setTask_id(Integer task_id) {
        this.task_id = task_id;
    }

    public Float getPkd() {
        return pkd;
    }

    public void setPkd(Float pkd) {
        this.pkd = pkd;
    }

    public Float getSrt() {
        return srt;
    }

    public void setSrt(Float srt) {
        this.srt = srt;
    }

    public Integer getTask_id() {
        return task_id;
    }

    public String getPackWave() {
        return packWave;
    }

    public void setPackWave(String packWave) {
        this.packWave = packWave;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getMsgTotes() {
        return msgTotes;
    }

    public void setMsgTotes(Integer msgTotes) {
        this.msgTotes = msgTotes;
    }

    public Integer getChutes() {
        return chutes;
    }

    public void setChutes(Integer chutes) {
        this.chutes = chutes;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Integer getAvailableChutes() {
        return availableChutes;
    }

    public void setAvailableChutes(Integer availableChutes) {
        this.availableChutes = availableChutes;
    }

    public Integer getCompletedChutes() {
        return completedChutes;
    }

    public void setCompletedChutes(Integer completedChutes) {
        this.completedChutes = completedChutes;
    }

    public Integer getFullChutes() {
        return fullChutes;
    }

    public void setFullChutes(Integer fullChutes) {
        this.fullChutes = fullChutes;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getLedLocation() {
        return ledLocation;
    }

    public void setLedLocation(String ledLocation) {
        this.ledLocation = ledLocation;
    }
}
