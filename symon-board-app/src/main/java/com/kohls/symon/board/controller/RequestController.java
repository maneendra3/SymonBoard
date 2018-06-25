package com.kohls.symon.board.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RequestController {

	private static final Logger logger = LoggerFactory.getLogger(RequestController.class);

	@GetMapping("/")
	public String requestMethod() {
		logger.info("Calling Request Method");
		return "/index.html";
	}
}
