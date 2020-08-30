package com.ankit.spring.boot.eureka.client.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eureka.client")
@CrossOrigin
public class EurekaClientController {
	@GetMapping("/client")
	public String getEurekaClient() {
		return "This is Eureka Client.";
	}

}
