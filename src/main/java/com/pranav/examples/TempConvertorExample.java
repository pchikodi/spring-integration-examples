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
public class TempConvertorExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// load the Spring context
		ApplicationContext context = new ClassPathXmlApplicationContext("temp_converter_context.xml");

		// get the reference to the message channel
		MessageChannel channel = context.getBean("inputChannel", MessageChannel.class);

		// Get input from user
		System.out.print("Enter a temperature in Fahrenheit: ");
		byte number = scanner.nextByte();

		// create a message with the content "World"
		Message<Float> message = MessageBuilder.withPayload(new Float(number)).build();

		// send the message to the inputChannel
		channel.send(message);

	}

}
