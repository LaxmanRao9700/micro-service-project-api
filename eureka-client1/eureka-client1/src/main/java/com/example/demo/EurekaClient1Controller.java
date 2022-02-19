package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service1")
public class EurekaClient1Controller {

	@GetMapping("/test")
	public String getData() {
		return "Eureka client1.";
	}
}
