package com.kohls.symon.board.dao;

import com.kohls.symon.board.sqlentities.LEDOfficeBoardEntity;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LEDOfficeMapper implements RowMapper {
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {

        LEDOfficeBoardEntity ledOfficeBoardEntity=new LEDOfficeBoardEntity();
        ledOfficeBoardEntity.setAvailableChutes(rs.getInt("AvailableChutes"));
        ledOfficeBoardEntity.setAvailableWavesTotal(rs.getInt("AvailableWavesTotal"));
        ledOfficeBoardEntity.setAvBufln(rs.getInt("AvailableBufferLanesTotal"));
        ledOfficeBoardEntity.setAvChts1(rs.getInt("AvailableChutesSorter1"));
        ledOfficeBoardEntity.setAvChts2(rs.getInt("AvailableChutesSorter2"));
        ledOfficeBoardEntity.setBlkChuts(rs.getInt("BlkChuts"));
        ledOfficeBoardEntity.setCartonsToOCSorter1(rs.getInt("CartonsToOCSorter1"));
        ledOfficeBoardEntity.setCartonsToOCSorter2(rs.getInt("CartonsToOCSorter2"));
        ledOfficeBoardEntity.setCompCht1(rs.getInt("CompletedChutesSorter1"));
        ledOfficeBoardEntity.setCompCht2(rs.getInt("CompletedChutesSorter2"));
        ledOfficeBoardEntity.setCompletedChutes(rs.getInt("CompletedChutes"));
        ledOfficeBoardEntity.setFullChutesSorter1(rs.getInt("FullChutesSorter1"));
        ledOfficeBoardEntity.setFullChutesTotal(rs.getInt("FullChutesTotal"));
        ledOfficeBoardEntity.setLastUpdated(rs.getDate("LastUpdated"));
        ledOfficeBoardEntity.setFullChutesSorter2(rs.getInt("FullChutesSorter2"));
        ledOfficeBoardEntity.setUnitsSortedSorter2(rs.getInt("UnitsSortedSorter1"));
        ledOfficeBoardEntity.setUnitsSortedSorter1(rs.getInt("UnitsSortedSorter2"));
        ledOfficeBoardEntity.setTtl_RT(rs.getInt("SortRateTotal"));
        ledOfficeBoardEntity.setSrtd(rs.getInt("UnitsSortedTotal"));
        ledOfficeBoardEntity.setSrate2(rs.getInt("SortRateSorter1"));
        ledOfficeBoardEntity.setSrate1(rs.getInt("SortRateSorter2"));
        ledOfficeBoardEntity.setOccrtns(rs.getInt("CartonsToOCTotal"));
        return ledOfficeBoardEntity;
    }
}
