package com.kohls.symon.board.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {

	private static final Logger logger = LoggerFactory.getLogger(RequestController.class);

	@GetMapping("/")
	public String requestMethod() {
		logger.info("Calling Request Method");
		return "Welcome to Symon Board Replacement System.!";
	}
}
