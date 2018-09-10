package com.leon.activeMQ;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 
 * provider 
 */
@RestController
public class QueueController {

	@Autowired
	private JmsMessagingTemplate messageTemplate;
	
	@RequestMapping("/send")
	private void send(String txt){
		messageTemplate.convertAndSend("test",txt);
		
	}
	
	@RequestMapping("/sendmap")
	public void sendMap(){
		Map map=new HashMap<>();
		map.put("mobile", "5145509440");
		map.put("content", "hello Yang");		
		messageTemplate.convertAndSend("test_map",map);
	}
}
