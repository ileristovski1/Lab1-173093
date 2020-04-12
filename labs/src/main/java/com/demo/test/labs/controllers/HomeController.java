package com.demo.test.labs.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	

	@GetMapping("/")
	public String Homepage() {
		
		
		
		return "home";
		
	}

	@PostMapping("/")
	public int niza() {


		return 123;
	}
	
}


