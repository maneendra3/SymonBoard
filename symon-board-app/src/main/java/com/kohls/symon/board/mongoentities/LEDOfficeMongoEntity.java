package com.kohls.symon.board.mongoentities;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class LEDOfficeMongoEntity {

    @Id
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    public Integer task_id;
    public Integer srtd;
    public Integer occrtns;
    public Integer avBufln;
    public Integer srate1;
    public Integer srate2;
    public Integer ttl_RT;
    public Integer compCht1;
    public Integer compCht2;
    public Integer avChts1;
    public Integer avChts2;
    public  Integer blkChuts;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer cartonsToOCSorter1;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer fullChutesSorter1;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer unitsSortedSorter2;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer unitsSortedSorter1;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer cartonsToOCSorter2;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer fullChutesSorter2;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer availableChutes;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer completedChutes;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer fullChutesTotal;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer availableWavesTotal;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer cartonsToOcTotal;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String lastUpdated;

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

    public Integer getTask_id() {
        return task_id;
    }

    public Integer getCartonsToOCSorter1() {
        return cartonsToOCSorter1;
    }

    public void setCartonsToOCSorter1(Integer cartonsToOCSorter1) {
        this.cartonsToOCSorter1 = cartonsToOCSorter1;
    }

    public Integer getFullChutesSorter1() {
        return fullChutesSorter1;
    }

    public void setFullChutesSorter1(Integer fullChutesSorter1) {
        this.fullChutesSorter1 = fullChutesSorter1;
    }

    public Integer getUnitsSortedSorter2() {
        return unitsSortedSorter2;
    }

    public void setUnitsSortedSorter2(Integer unitsSortedSorter2) {
        this.unitsSortedSorter2 = unitsSortedSorter2;
    }

    public Integer getUnitsSortedSorter1() {
        return unitsSortedSorter1;
    }

    public void setUnitsSortedSorter1(Integer unitsSortedSorter1) {
        this.unitsSortedSorter1 = unitsSortedSorter1;
    }

    public Integer getCartonsToOCSorter2() {
        return cartonsToOCSorter2;
    }

    public void setCartonsToOCSorter2(Integer cartonsToOCSorter2) {
        this.cartonsToOCSorter2 = cartonsToOCSorter2;
    }

    public Integer getFullChutesSorter2() {
        return fullChutesSorter2;
    }

    public void setFullChutesSorter2(Integer fullChutesSorter2) {
        this.fullChutesSorter2 = fullChutesSorter2;
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

    public Integer getFullChutesTotal() {
        return fullChutesTotal;
    }

    public void setFullChutesTotal(Integer fullChutesTotal) {
        this.fullChutesTotal = fullChutesTotal;
    }

    public Integer getAvailableWavesTotal() {
        return availableWavesTotal;
    }

    public void setAvailableWavesTotal(Integer availableWavesTotal) {
        this.availableWavesTotal = availableWavesTotal;
    }

    public Integer getCartonsToOcTotal() {
        return cartonsToOcTotal;
    }

    public void setCartonsToOcTotal(Integer cartonsToOcTotal) {
        this.cartonsToOcTotal = cartonsToOcTotal;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Override
    public String toString() {
        return "LEDOfficeMongoEntity{" +
                "task_id=" + task_id +
                ", srtd=" + srtd +
                ", occrtns=" + occrtns +
                ", avBufln=" + avBufln +
                ", srate1=" + srate1 +
                ", srate2=" + srate2 +
                ", ttl_RT=" + ttl_RT +
                ", compCht1=" + compCht1 +
                ", compCht2=" + compCht2 +
                ", avChts1=" + avChts1 +
                ", avChts2=" + avChts2 +
                ", blkChuts=" + blkChuts +
                ", cartonsToOCSorter1=" + cartonsToOCSorter1 +
                ", fullChutesSorter1=" + fullChutesSorter1 +
                ", unitsSortedSorter2=" + unitsSortedSorter2 +
                ", unitsSortedSorter1=" + unitsSortedSorter1 +
                ", cartonsToOCSorter2=" + cartonsToOCSorter2 +
                ", fullChutesSorter2=" + fullChutesSorter2 +
                ", availableChutes=" + availableChutes +
                ", completedChutes=" + completedChutes +
                ", fullChutesTotal=" + fullChutesTotal +
                ", availableWavesTotal=" + availableWavesTotal +
                ", cartonsToOcTotal=" + cartonsToOcTotal +
                ", lastUpdated='" + lastUpdated + '\'' +
                '}';
    }
}
