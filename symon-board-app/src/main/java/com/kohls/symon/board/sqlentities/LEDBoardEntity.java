package com.kohls.symon.board.sqlentities;


import javax.persistence.*;


public class LEDBoardEntity {

    private Integer task_id; ;
    private Float  pkd ;
    private Float  srt;
    private String packWave;
    private String status;
    private Integer msgTotes;
    private Integer chutes;
    private String duration;
    private Integer availableChutes;
    private Integer completedChutes;
    private Integer fullChutes;
    private String ledLocation;

    public Integer getTask_id() {
        return task_id;
    }

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

    public String getLedLocation() {
        return ledLocation;
    }

    public void setLedLocation(String ledLocation) {
        this.ledLocation = ledLocation;
    }

    @Override
    public String toString() {
        return "LEDBoardEntity{" +
                "task_id=" + task_id +
                ", pkd=" + pkd +
                ", srt=" + srt +
                ", packWave='" + packWave + '\'' +
                ", status='" + status + '\'' +
                ", msgTotes=" + msgTotes +
                ", chutes=" + chutes +
                ", duration='" + duration + '\'' +
                ", availableChutes=" + availableChutes +
                ", completedChutes=" + completedChutes +
                ", fullChutes=" + fullChutes +
                ", ledLocation='" + ledLocation + '\'' +
                '}';
    }
}
