package com.filter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
	
	@GetMapping(value = "/message")
	public String getMessage() {
		
		return "Filter Implementation Example";
		// save it
		// open postman & now read the data
	}

}
