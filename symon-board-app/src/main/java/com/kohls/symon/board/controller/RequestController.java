package com.kohls.symon.board.controller;

import com.kohls.symon.board.dao.MongoLEDBoardRepository;
import com.kohls.symon.board.dao.MongoLEDOfficeRepository;
import com.kohls.symon.board.dao.SQLLEDOfficeRepository;
import com.kohls.symon.board.mongoentities.LEDBoardMongoEntity;
import com.kohls.symon.board.mongoentities.LEDOfficeMongoEntity;
import com.kohls.symon.board.utils.LEDUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class RequestController {

	private static final Logger logger = LoggerFactory.getLogger(RequestController.class);

	@Autowired
	MongoLEDOfficeRepository mongoLEDOfficeRepository;

	@Autowired
	private MongoLEDBoardRepository ledBoardRepository;


	@GetMapping(value={"/getLEDOffice"})
	public  Map<String,Object> requestMethod() {
        Map<String,Object> ledData=new HashMap<>();
        List<LEDOfficeMongoEntity> ledOfficeData=new ArrayList<>();
        List<LEDBoardMongoEntity> ledBoard=new ArrayList<>();
		try {
            ledOfficeData = mongoLEDOfficeRepository.getAll();
            ledBoard= ledBoardRepository.findAll();
            ledData= LEDUtils.ledOfficeData(ledOfficeData,ledBoard);
        }catch (Exception ex){
		    ex.printStackTrace();
        }
        logger.info("Fetched Data From MongoDB and size="+ledData.size());
		return ledData;
	}

}
