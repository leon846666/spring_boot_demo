package com.leon.activeMQ;

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
}
