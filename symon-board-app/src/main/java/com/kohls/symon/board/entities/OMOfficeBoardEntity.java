package com.kohls.symon.board.entities;

import javax.persistence.*;

@Entity
@Table(name = "ledoffice")
public class OMOfficeBoardEntity {

    @Id
    @GeneratedValue
    private Integer task_id;
    @Column(name = "UnitsSortedTotal")
    private Integer srtd;
    @Column(name = "CartonsToOCTotal")
    private Integer occrtns;
    @Column(name = "AvailableBufferLanesTotal")
    private Integer avBufln;
    @Column(name = "SortRateSorter1")
    private Integer srate1;
    @Column(name = "SortRateSorter2")
    private Integer srate2;
    @Column(name = "SortRateTotal")
    private Integer ttl_RT;
    @Column(name = "CompletedChutesSorter1")
    private Integer compCht1;
    @Column(name = "CompletedChutesSorter2")
    private Integer compCht2;
    @Column(name = "AvailableChutesSorter1")
    private Integer avChts1;
    @Column(name = "AvailableChutesSorter2")
    private Integer avChts2;

    private Integer cartonsToOCSorter1;
    private Integer fullChutesSorter1;
    private Integer unitsSortedSorter2;
    private Integer unitsSortedSorter1;
    private Integer cartonsToOCSorter2;
    private Integer fullChutesSorter2;
    private Integer availableChutes;
    private Integer completedChutes;
    private Integer fullChutesTotal;
    private Integer availableWavesTotal;

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

    @Override
    public String toString() {
        return "OMOfficeBoardEntity{" +
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
                '}';
    }
}
