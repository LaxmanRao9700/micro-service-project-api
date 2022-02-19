package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service2")
public class EurekaClient2Controller {
	@GetMapping("/test")
	public String getData() {
		return "Eureka client2.";
	}
}
