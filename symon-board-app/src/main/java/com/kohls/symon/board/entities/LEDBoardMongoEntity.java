package com.kohls.symon.board.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;


@Document
public class LEDBoardMongoEntity {

    @Id
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    public Integer task_id; ;
    public Integer  sorter;
    public Integer  pkd ;
    public Integer  srt;
    public String  ledLocation ;

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
