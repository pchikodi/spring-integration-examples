/**
 * 
 */
package com.pranav.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author chikodipranav@gamil.com
 *
 */
public class JMSAdapterExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("jmsAdapter.xml");

	}

}
