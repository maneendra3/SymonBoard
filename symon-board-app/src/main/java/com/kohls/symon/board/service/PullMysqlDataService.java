package com.kohls.symon.board.service;

import com.kohls.symon.board.dao.MysqlUserRepository;
import com.kohls.symon.board.dao.UserRepository;
import com.kohls.symon.board.entities.OMOfficeBoardEntity;
import com.kohls.symon.board.entities.UserEntity;
import com.kohls.symon.board.entities.UserMyEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PullMysqlDataService {

    private static final Logger logger = LoggerFactory.getLogger(PullMysqlDataService.class);

    @Autowired
    UserRepository userRepository;

    @Autowired
    MysqlUserRepository mysqlUserRepository;

    public void demoServiceMethod()
    {
        logger.info("PullMysqlDataService");
        List<UserEntity> userEntities=new ArrayList<>();
        logger.info("Pulling Data From Mysql");
        List<OMOfficeBoardEntity> userMyEntities=(List<OMOfficeBoardEntity>) mysqlUserRepository.findAll();
        logger.info("Copying Data From Mysql into mongoDB and Objects size="+userMyEntities.size());
        userEntities= copyUserMyEntities(userMyEntities);
        userRepository.save(userEntities.get(0));
        logger.info("Copied Data into MongoDB="+userEntities.size());

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
            userEntity.setBlkChuts(userMyEntity.getBlkChuts());
            userEntities.add(userEntity);
        } );

        return  userEntities;
    }
}
