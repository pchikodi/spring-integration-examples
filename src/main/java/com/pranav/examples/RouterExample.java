/**
 * 
 */
package com.pranav.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;

import com.pranav.examples.pojo.Customer;
import com.pranav.examples.pojo.Price;
import com.pranav.examples.pojo.Trade;

/**
 * @author chikodipranav@gmail.com
 *
 */
public class RouterExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("routers.xml");
		// get the reference to the message channel
		MessageChannel channel = context.getBean("inputChannel", MessageChannel.class);
		// create a message with the content "World"
		Message<Customer> customerMessage = MessageBuilder.withPayload(new Customer("C001")).build();
		// send the message to the inputChannel
		channel.send(customerMessage);
		Message<Trade> tradeMessage = MessageBuilder.withPayload(new Trade("NEW","SpaceX")).build();
		channel.send(tradeMessage);
	}

}
