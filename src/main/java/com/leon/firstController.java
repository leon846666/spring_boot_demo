package com.leon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class firstController {

	
	@RequestMapping("/info")
	public String info(){
		return "hello world";
	}
}
