package com.leon.activeMQ;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

	@JmsListener(destination="test")
	public void getMsg(String txt) {
		System.out.println("got the msg "+txt);
	}
}
