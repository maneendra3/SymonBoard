package com.kohls.symon.board.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LEDBOARD")
public class LEDBoardEntity {

    @Id
    @GeneratedValue
    private Integer task_id; ;
    private Integer  sorter;
    private Integer  pkd ;
    private Integer  srt;
    private String  ledLocation ;

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

    public Integer getPkd() {
        return pkd;
    }

    public void setPkd(Integer pkd) {
        this.pkd = pkd;
    }

    public Integer getSrt() {
        return srt;
    }

    public void setSrt(Integer srt) {
        this.srt = srt;
    }

    public String getLedLocation() {
        return ledLocation;
    }

    public void setLedLocation(String ledLocation) {
        this.ledLocation = ledLocation;
    }

}
