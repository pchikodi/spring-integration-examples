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
public class SpliterExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spliter.xml");
		// get the reference to the message channel
		MessageChannel channel = context.getBean("inputChannel", MessageChannel.class);
		// create a message with the content "World"
		Message<String> message = MessageBuilder.withPayload("foo;bar").build();

		channel.send(message);
	}

}
