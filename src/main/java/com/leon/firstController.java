package com.leon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class firstController {

	@Autowired
	private Environment env;
	
	@RequestMapping("/info")
	public String info(){
		return "hello world"+env.getProperty("url");
	}
	
	@RequestMapping("/info2")
	public String info2(){
		return "hello world by info2 "+env.getProperty("url");
	}
}
