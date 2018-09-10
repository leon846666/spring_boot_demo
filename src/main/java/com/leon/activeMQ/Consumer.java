package com.leon.activeMQ;

import java.util.Map;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

	@JmsListener(destination="test_map")
	public void readMap(Map map){
		System.out.println(map);		
	}
}
