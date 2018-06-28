/*
package com.kohls.symon.board.app;

import com.kohls.symon.board.controller.RequestController;
import com.kohls.symon.board.dao.MysqlUserRepository;
import com.kohls.symon.board.dao.UserRepository;
import com.kohls.symon.board.entities.OMOfficeBoardEntity;
import com.kohls.symon.board.entities.UserEntity;
import com.kohls.symon.board.entities.UserMyEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class PullMysqlDataScheduler {

    private static final Logger logger = LoggerFactory.getLogger(PullMysqlDataScheduler.class);

    @Autowired
    UserRepository userRepository;

    @Autowired
    MysqlUserRepository mysqlUserRepository;

    @Scheduled(fixedDelay = 5000)
    //@Scheduled(fixedRate = 5000)  //Or use this
    public void demoServiceMethod()
    {
        List<UserEntity> userEntities=new ArrayList<>();
        logger.info("Pulling Data From Mysql");
        List<OMOfficeBoardEntity> userMyEntities=(List<OMOfficeBoardEntity>) mysqlUserRepository.findAll();
        logger.info("Copying Data From Mysql into mongoDB and Objects size="+userMyEntities.size());
        userEntities= copyUserMyEntities(userMyEntities);
        userEntities=userRepository.saveAll(userEntities);
        logger.info("Copied Data into MongoDB="+userMyEntities.size());
    }

    private List<UserEntity> copyUserMyEntities(List<OMOfficeBoardEntity> userMyEntities){
        List<UserEntity> userEntities=new ArrayList<>();
        userMyEntities.forEach(userMyEntity ->{
            UserEntity userEntity=new UserEntity();
            userEntity.setTask_id(userMyEntity.getTask_id());
            userEntity.setSrtd(userMyEntity.getSrtd());
            userEntity.setOccrtns(userMyEntity.getOccrtns());
            userEntity.setAvBufln(userMyEntity.getAvBufln());
            userEntity.setSrate1(userMyEntity.getSrate1());
            userEntity.setSrate2(userMyEntity.getSrate2());
            userEntity.setTtl_RT(userMyEntity.getTtl_RT());
            userEntity.setCompCht1(userMyEntity.getCompCht1());
            userEntity.setCompCht2(userMyEntity.getCompCht2());
            userEntity.setAvChts2(userMyEntity.getAvChts2());
            userEntity.setAvChts1(userMyEntity.getAvChts1());
            userEntities.add(userEntity);
        } );

        return  userEntities;
    }
}
*/
