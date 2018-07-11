package com.kohls.symon.board.sqlentities;


import javax.persistence.*;

@Entity
@Table(name = "LEDBoard")
public class LEDBoardEntity {

    @Id
    @GeneratedValue
    private Integer task_id; ;
    @Column(name = "Sorter",nullable = false)
    private Integer  sorter;
    @Column(name = "Picked",nullable = false)
    private Float  pkd ;
    @Column(name = "Sorted",nullable = false)
    private Float  srt;
    @Column(name = "PackWave",nullable = false)
    private String packWave;
    @Column(name = "Status",nullable = false)
    private String status;
    @Column(name = "MsgTotes",nullable = false)
    private Integer msgTotes;
    @Column(name = "Chutes",nullable = false)
    private Integer chutes;
    @Column(name = "Duration")
    private String duration;
    @Column(name = "AvailableChutes")
    private Integer availableChutes;
    @Column(name = "CompletedChutes")
    private Integer completedChutes;
    @Column(name = "FullChutes")
    private Integer fullChutes;
    @Column(name = "LEDLocation")
    private String ledLocation;

    public Integer getTask_id() {
        return task_id;
    }

    public void setTask_id(Integer task_id) {
        this.task_id = task_id;
    }

    public Integer getSorter() {
        return sorter;
    }

    public void setSorter(Integer sorter) {
        this.sorter = sorter;
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
                ", sorter=" + sorter +
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
