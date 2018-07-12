package com.kohls.symon.board.service;

import com.kohls.symon.board.dao.LEDBoardMapper;
import com.kohls.symon.board.dao.LEDOfficeMapper;
import com.kohls.symon.board.dao.MongoLEDBoardRepository;
import com.kohls.symon.board.dao.MongoLEDOfficeRepository;
import com.kohls.symon.board.mongoentities.LEDBoardMongoEntity;
import com.kohls.symon.board.mongoentities.LEDOfficeMongoEntity;
import com.kohls.symon.board.sqlentities.LEDBoardEntity;
import com.kohls.symon.board.sqlentities.LEDOfficeBoardEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

@Service
public class PullSQLDataService {

    private static final Logger logger = LoggerFactory.getLogger(PullSQLDataService.class);

    @Autowired
    MongoLEDOfficeRepository mongoLEDOfficeRepository;

    /*@Autowired
    SQLLEDOfficeRepository SQLLEDOfficeRepository;

    @Autowired
    LEDBoardRepository ledBoardRepository;*/

    @Autowired
    private MongoLEDBoardRepository mongoLEDBoardRepository;

    @Autowired
    private EntityManager entityManager;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void copyLEDOfficeData()
    {
        logger.info("Migrating Data From SQL LEDOffice Table to LEDOffice of Mongo DB ");
        List<LEDOfficeMongoEntity> ledOfficeMongoEntities=new ArrayList<>();
        List<LEDOfficeBoardEntity> ledBoardEntities=(List<LEDOfficeBoardEntity>)jdbcTemplate.query("Select * from LEDOffice",new LEDOfficeMapper());
        ledOfficeMongoEntities= copyLedOfficeData(ledBoardEntities);
        mongoLEDOfficeRepository.deleteAll();
        mongoLEDOfficeRepository.saveAll(ledOfficeMongoEntities);
        logger.info("Copied Data into MongoDB="+ledOfficeMongoEntities.size());

    }

    public void copyLEDBoardData(){
        logger.info("Migrating Data From SQL LED Board Table to LED Board of Mongo DB ");
        List<LEDBoardEntity> ledBoardEntities=(List<LEDBoardEntity>)jdbcTemplate.query("Select * from LEDBoard",new LEDBoardMapper());
        List<LEDBoardMongoEntity> ledBoardMongoEntities=copyLEDBoardData(ledBoardEntities);
        mongoLEDBoardRepository.deleteAll();
        mongoLEDBoardRepository.saveAll(ledBoardMongoEntities);
        logger.info("Copied Data into MongoDB="+ledBoardMongoEntities.size());



    }

    private List<LEDOfficeMongoEntity> copyLedOfficeData(List<LEDOfficeBoardEntity> userMyEntities){
        List<LEDOfficeMongoEntity> userEntities=new ArrayList<>();
        userMyEntities.forEach(userMyEntity ->{
            LEDOfficeMongoEntity LEDOfficeMongoEntity =new LEDOfficeMongoEntity();
            BeanUtils.copyProperties(userMyEntity,LEDOfficeMongoEntity);
            userEntities.add(LEDOfficeMongoEntity);
        } );

        return  userEntities;
    }

    private List<LEDBoardMongoEntity> copyLEDBoardData(List<LEDBoardEntity> ledBoardEntities){
        List<LEDBoardMongoEntity> ledBoardMongoEntities=new ArrayList<>();
        ledBoardEntities.forEach(ledBoardEntity -> {
            LEDBoardMongoEntity ledBoardMongoEntity=new LEDBoardMongoEntity();
            BeanUtils.copyProperties(ledBoardEntity,ledBoardMongoEntity);
            ledBoardMongoEntities.add(ledBoardMongoEntity);
        });
        return  ledBoardMongoEntities;
    }

}
