package com.os.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order/")
public class OrderController {
	
	Logger logger = LoggerFactory.getLogger(OrderController.class);
	
	@Autowired
	LocationConfig locationConfig;

	@GetMapping("/loc")
	public String details() {
		logger.info("Order Location Trace Request Reached..........");
		return locationConfig.getName() != null ? locationConfig.getName() : "KIOL";
	}
}
