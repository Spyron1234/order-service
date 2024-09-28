package com.os.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order/")
public class OrderController {
	
	@Autowired
	LocationConfig locationConfig;

	@GetMapping("/loc")
	public String details() {
		return locationConfig.getName();
	}
}
