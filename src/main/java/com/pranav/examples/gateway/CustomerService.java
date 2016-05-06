/**
 * 
 */
package com.pranav.examples.gateway;

import com.pranav.examples.pojo.Customer;

/**
 * @author chikodipranav@gmail.com
 *
 */
public interface CustomerService {
	
	public Customer getCustomerInfo(String customerId);

}
