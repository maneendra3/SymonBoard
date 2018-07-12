package com.kohls.symon.board.dao;

import com.kohls.symon.board.sqlentities.LEDBoardEntity;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LEDBoardMapper implements RowMapper {

    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        LEDBoardEntity ledBoardEntity=new LEDBoardEntity();
        ledBoardEntity.setAvailableChutes(rs.getInt("AvailableChutes"));
        ledBoardEntity.setChutes(rs.getInt("Chutes"));
        ledBoardEntity.setCompletedChutes(rs.getInt("CompletedChutes"));
        ledBoardEntity.setDuration(rs.getString("Duration"));
        ledBoardEntity.setFullChutes(rs.getInt("FullChutes"));
        ledBoardEntity.setLedLocation(rs.getString("LEDLocation"));
        ledBoardEntity.setMsgTotes(rs.getInt("MsgTotes"));
        ledBoardEntity.setPackWave(rs.getString("PackWave"));
        ledBoardEntity.setPkd(rs.getFloat("Picked"));
        ledBoardEntity.setSrt(rs.getFloat("Sorted"));
        ledBoardEntity.setStatus(rs.getString("Status"));
        return ledBoardEntity;
    }
}
