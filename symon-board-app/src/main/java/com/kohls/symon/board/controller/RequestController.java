package com.kohls.symon.board.controller;

import com.kohls.symon.board.dao.MysqlUserRepository;
import com.kohls.symon.board.dao.UserRepository;
import com.kohls.symon.board.entities.OMOfficeBoardEntity;
import com.kohls.symon.board.entities.UserEntity;
import com.kohls.symon.board.entities.UserMyEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import  java.util.Date;

@RestController
public class RequestController {

	private static final Logger logger = LoggerFactory.getLogger(RequestController.class);

	@Autowired
    UserRepository userRepository;

	@Autowired
	MysqlUserRepository mysqlUserRepository;


	@GetMapping("/")
	public List<UserEntity> requestMethod() {
		logger.info("Calling Request Method");
        List<UserEntity> userEntities=new ArrayList<>();
		try {
           userEntities = userRepository.findAll();
        }catch (Exception ex){
		    ex.printStackTrace();
        }
        logger.info("Fetched Data From MongoDB and size="+userEntities.size());
		return userEntities;
	}
}
