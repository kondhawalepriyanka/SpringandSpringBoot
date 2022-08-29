package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Component
//Using 
@RestController
public class HelloController {
	@RequestMapping("/M21")
	public String display()
	{
		return "Welcome to M21 Batch";
	}

}
