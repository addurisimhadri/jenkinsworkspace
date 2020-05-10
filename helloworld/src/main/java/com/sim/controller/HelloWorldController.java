package com.sim.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping(path = "/")
	public String getWelcome() {
		
		return "Wlecome to Jenkins";
	}

}
