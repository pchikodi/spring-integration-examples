/**
 * 
 */
package com.pranav.examples.service;

import java.util.Map;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.stereotype.Component;

/**
 * @author chikodipranav@gmail.com
 *
 */
@Component
public class PrintService {

	@ServiceActivator
	public void printValue(float celcius) {
		System.out.println("Temperature in celcius :" + celcius);
	}
	
	@ServiceActivator
	public void printValue(String value,@Headers Map<String, Object> headerMap) {
		System.out.println("User input : " +value);
		System.out.println("Header Values : " +headerMap.toString());
	}
	
	@ServiceActivator
	public void printPayload(Message m,Map<String, Object> headerMap) {
		System.out.println("Payload info : " +m.getPayload().toString());
		System.out.println("Header Values : " +headerMap.toString());
	}
}
