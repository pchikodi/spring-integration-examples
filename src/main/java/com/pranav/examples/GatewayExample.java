/**
 * 
 */
package com.pranav.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pranav.examples.gateway.CustomerService;
import com.pranav.examples.pojo.Customer;

/**
 * @author chikodipranav@gmail.com
 *
 */
public class GatewayExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// load the Spring context
		ApplicationContext context = new ClassPathXmlApplicationContext("gateway.xml");
		CustomerService customerService = (CustomerService) context.getBean("customerService");
		System.out.println("Get Customer info synchronously");
		for (int i = 0; i < 3; i++) {
			String id = "C0" + i;
			System.out.println("Id: " + id);
			Customer customer = customerService.getCustomerInfo(id);
			System.out.println("Customer information for: " + id + "(" + customer + ")");
		}

		customerService = (CustomerService) context.getBean("customerServiceByDispatcher");
		System.out.println("Get Customer info asynchronously using dispatcher");
		for (int i = 0; i < 10; i++) {
			String id = "C0" + i;
			System.out.println("Id: " + id);
			Customer customer = customerService.getCustomerInfo(id);
			System.out.println("Customer information for: " + id + "(" + customer + ")");
		}
	}

}
