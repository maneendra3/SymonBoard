package com.kohls.symon.board.controller;

import com.kohls.symon.board.dao.MongoLEDBoardRepository;
import com.kohls.symon.board.dao.MongoLEDOfficeRepository;
import com.kohls.symon.board.dao.SQLLEDOfficeRepository;
import com.kohls.symon.board.entities.LEDBoardMongoEntity;
import com.kohls.symon.board.entities.LEDOfficeMongoEntity;
import com.kohls.symon.board.utils.LEDUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    SQLLEDOfficeRepository SQLLEDOfficeRepository;

	@Autowired
	private MongoLEDBoardRepository ledBoardRepository;


	@GetMapping(value={"/getLEDOffice"})
	public  Map<String,Object> requestMethod() {
		logger.info("Calling Request Method");
        Map<String,Object> ledData=new HashMap<>();
        List<LEDOfficeMongoEntity> userEntities=new ArrayList<>();
        List<LEDBoardMongoEntity> ledBoard=new ArrayList<>();
		try {
            userEntities = mongoLEDOfficeRepository.findAll();
            ledBoard= ledBoardRepository.findAll();
            ledData= LEDUtils.ledOfficeData(userEntities);
            ledData.put("ledBoard",ledBoard);
        }catch (Exception ex){
		    ex.printStackTrace();
        }
        logger.info("Fetched Data From MongoDB and size="+ledData.size());
		return ledData;
	}

}
