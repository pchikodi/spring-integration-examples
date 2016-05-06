/**
 * 
 */
package com.pranav.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;

import com.pranav.examples.pojo.Trade;

/**
 * @author chikodipranav@gmail.com
 *
 */
public class FilterExample {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("filter.xml");
		// get the reference to the message channel
		MessageChannel channel = context.getBean("inputChannel", MessageChannel.class);
		// create a message with the content "World"
		Message<Trade> message = MessageBuilder.withPayload(new Trade("NEW", "Tesla")).build();
		// send the message to the inputChannel
		channel.send(message);

		message = MessageBuilder.withPayload(new Trade("CANCEL", "Tesla")).build();
		// send the message to the inputChannel
		channel.send(message);

	}
}
