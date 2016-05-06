/**
 * 
 */
package com.pranav.examples;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;

/**
 * @author chikodipranav@gmail.com
 *
 */
public class HeaderEnricherExample {

	public static void main(String[] args) {
		// load the Spring context
		ApplicationContext context = new ClassPathXmlApplicationContext("header_enricher.xml");

		// get the reference to the message channel
		MessageChannel channel = context.getBean("inputChannel", MessageChannel.class);

		Scanner scanner = new Scanner(System.in);
		// Get input from user
		System.out.print("Enter a message: ");
		String inputMessage = scanner.nextLine();
		
		// create a message with the content "World"
		Message<String> message = MessageBuilder.withPayload(inputMessage).build();

		// send the message to the inputChannel
		channel.send(message);

	}
}
