package com.sim.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping(value = "/")
	public String getWelcome() {
		
		return "Wlecome to Jenkins";
	}

}
