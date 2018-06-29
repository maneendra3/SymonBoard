package com.kohls.symon.board.entities;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import  java.util.Date;

@Document
public class UserEntity {

    @Id
    private Integer task_id;
    private Integer srtd;
    private Integer occrtns;
    private Integer avBufln;
    private Integer srate1;
    private Integer srate2;
    private Integer ttl_RT;
    private Integer compCht1;
    private Integer compCht2;
    private Integer avChts1;
    private Integer avChts2;
    private  Integer blkChuts;

    public Integer getTask_id() {
        return task_id;
    }

    public void setTask_id(Integer task_id) {
        this.task_id = task_id;
    }

    public Integer getSrtd() {
        return srtd;
    }

    public void setSrtd(Integer srtd) {
        this.srtd = srtd;
    }

    public Integer getOccrtns() {
        return occrtns;
    }

    public void setOccrtns(Integer occrtns) {
        this.occrtns = occrtns;
    }

    public Integer getAvBufln() {
        return avBufln;
    }

    public void setAvBufln(Integer avBufln) {
        this.avBufln = avBufln;
    }

    public Integer getSrate1() {
        return srate1;
    }

    public void setSrate1(Integer srate1) {
        this.srate1 = srate1;
    }

    public Integer getSrate2() {
        return srate2;
    }

    public void setSrate2(Integer srate2) {
        this.srate2 = srate2;
    }

    public Integer getTtl_RT() {
        return ttl_RT;
    }

    public void setTtl_RT(Integer ttl_RT) {
        this.ttl_RT = ttl_RT;
    }

    public Integer getCompCht1() {
        return compCht1;
    }

    public void setCompCht1(Integer compCht1) {
        this.compCht1 = compCht1;
    }

    public Integer getCompCht2() {
        return compCht2;
    }

    public void setCompCht2(Integer compCht2) {
        this.compCht2 = compCht2;
    }

    public Integer getAvChts1() {
        return avChts1;
    }

    public void setAvChts1(Integer avChts1) {
        this.avChts1 = avChts1;
    }

    public Integer getAvChts2() {
        return avChts2;
    }

    public void setAvChts2(Integer avChts2) {
        this.avChts2 = avChts2;
    }

    public Integer getBlkChuts() {
        return blkChuts;
    }

    public void setBlkChuts(Integer blkChuts) {
        this.blkChuts = blkChuts;
    }
}
