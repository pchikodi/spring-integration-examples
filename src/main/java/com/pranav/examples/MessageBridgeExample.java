/**
 * 
 */
package com.pranav.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;

/**
 * @author chikodipranav@gmail.com
 *
 */
public class MessageBridgeExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// load the Spring context
		ApplicationContext context = new ClassPathXmlApplicationContext("message_bridge.xml");

		// get the reference to the message channel
		MessageChannel channel = context.getBean("in-channel", MessageChannel.class);

		// create a message with the content "World"
		Message<String> message = MessageBuilder.withPayload("Pranav").build();

		// send the message to the inputChannel
		channel.send(message);
	}

}
