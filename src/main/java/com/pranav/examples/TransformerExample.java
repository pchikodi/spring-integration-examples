/**
 * 
 */
package com.pranav.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;

import com.pranav.examples.pojo.Price;

/**
 * @author chikodipranav@gmail.com
 *
 */
public class TransformerExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("transformers.xml");
		// get the reference to the message channel
		MessageChannel channel = context.getBean("inputChannel", MessageChannel.class);
		// create a message with the content "World"
		Message<Price> message = MessageBuilder.withPayload(new Price(12.22, "Tesla")).build();
		// send the message to the inputChannel
		channel.send(message);

	}

}
