package com.kohls.symon.board.service;

import com.kohls.symon.board.dao.LEDBoardRepository;
import com.kohls.symon.board.dao.MongoLEDBoardRepository;
import com.kohls.symon.board.dao.SQLLEDOfficeRepository;
import com.kohls.symon.board.dao.MongoLEDOfficeRepository;
import com.kohls.symon.board.sqlentities.LEDBoardEntity;
import com.kohls.symon.board.mongoentities.LEDBoardMongoEntity;
import com.kohls.symon.board.sqlentities.LEDOfficeBoardEntity;
import com.kohls.symon.board.mongoentities.LEDOfficeMongoEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PullSQLDataService {

    private static final Logger logger = LoggerFactory.getLogger(PullSQLDataService.class);

    @Autowired
    MongoLEDOfficeRepository mongoLEDOfficeRepository;

    @Autowired
    SQLLEDOfficeRepository SQLLEDOfficeRepository;

    @Autowired
    LEDBoardRepository ledBoardRepository;

    @Autowired
    private MongoLEDBoardRepository mongoLEDBoardRepository;

    public void copyLEDOfficeData()
    {
        logger.info("Migrating Data From SQL LEDOffice Table to LEDOffice of Mongo DB ");
        List<LEDOfficeMongoEntity> ledOfficeMongoEntities=new ArrayList<>();
        List<LEDOfficeBoardEntity> ledOfficeEntities=(List<LEDOfficeBoardEntity>) SQLLEDOfficeRepository.findAll();
        ledOfficeMongoEntities= copyLedOfficeData(ledOfficeEntities);
        mongoLEDOfficeRepository.saveAll(ledOfficeMongoEntities);
        logger.info("Copied Data into MongoDB="+ledOfficeMongoEntities.size());

    }

    public void copyLEDBoardData(){
        logger.info("Migrating Data From SQL LED Board Table to LED Board of Mongo DB ");
        List<LEDBoardEntity> ledBoardEntities= (List<LEDBoardEntity>)ledBoardRepository.findAll();
        List<LEDBoardMongoEntity> ledBoardMongoEntities=copyLEDBoardData(ledBoardEntities);
        mongoLEDBoardRepository.saveAll(ledBoardMongoEntities);
        logger.info("Copied Data into MongoDB="+ledBoardMongoEntities.size());



    }

    private List<LEDOfficeMongoEntity> copyLedOfficeData(List<LEDOfficeBoardEntity> userMyEntities){
        List<LEDOfficeMongoEntity> userEntities=new ArrayList<>();
        userMyEntities.forEach(userMyEntity ->{
            LEDOfficeMongoEntity LEDOfficeMongoEntity =new LEDOfficeMongoEntity();
            /*LEDOfficeMongoEntity.setTask_id(userMyEntity.getTask_id());
            LEDOfficeMongoEntity.setSrtd(userMyEntity.getSrtd());
            LEDOfficeMongoEntity.setOccrtns(userMyEntity.getOccrtns());
            LEDOfficeMongoEntity.setAvBufln(userMyEntity.getAvBufln());
            LEDOfficeMongoEntity.setSrate1(userMyEntity.getSrate1());
            LEDOfficeMongoEntity.setSrate2(userMyEntity.getSrate2());
            LEDOfficeMongoEntity.setTtl_RT(userMyEntity.getTtl_RT());
            LEDOfficeMongoEntity.setCompCht1(userMyEntity.getCompCht1());
            LEDOfficeMongoEntity.setCompCht2(userMyEntity.getCompCht2());
            LEDOfficeMongoEntity.setAvChts2(userMyEntity.getAvChts2());
            LEDOfficeMongoEntity.setAvChts1(userMyEntity.getAvChts1());
            LEDOfficeMongoEntity.setBlkChuts(userMyEntity.getBlkChuts());*/
            BeanUtils.copyProperties(userMyEntity,LEDOfficeMongoEntity);
            userEntities.add(LEDOfficeMongoEntity);
        } );

        return  userEntities;
    }

    private List<LEDBoardMongoEntity> copyLEDBoardData(List<LEDBoardEntity> ledBoardEntities){
        List<LEDBoardMongoEntity> ledBoardMongoEntities=new ArrayList<>();
        ledBoardEntities.forEach(ledBoardEntity -> {
            LEDBoardMongoEntity ledBoardMongoEntity=new LEDBoardMongoEntity();
            /*ledBoardMongoEntity.setTask_id(ledBoardEntity.getTask_id());
            ledBoardMongoEntity.setPkd(ledBoardEntity.getPkd());
            ledBoardMongoEntity.setSorter(ledBoardEntity.getSorter());
            ledBoardMongoEntity.setSrt(ledBoardEntity.getSrt());
            ledBoardMongoEntity.setPackWave(ledBoardEntity.getPackWave());
            ledBoardMongoEntity.setStatus(ledBoardEntity.getStatus());
            ledBoardMongoEntity.setMsgTotes(ledBoardEntity.getMsgTotes());
            ledBoardMongoEntity.setChutes(ledBoardEntity.getChutes());
            ledBoardMongoEntity.setDuration(ledBoardEntity.getDuration());
            ledBoardMongoEntity.setAvailableChutes(ledBoardEntity.getAvailableChutes());
            ledBoardMongoEntity.setCompletedChutes();*/
            BeanUtils.copyProperties(ledBoardEntity,ledBoardMongoEntity);
            ledBoardMongoEntities.add(ledBoardMongoEntity);
        });
        return  ledBoardMongoEntities;
    }

}
