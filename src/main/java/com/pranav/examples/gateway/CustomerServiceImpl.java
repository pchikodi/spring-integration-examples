package com.pranav.examples.gateway;

import com.pranav.examples.pojo.Customer;

public class CustomerServiceImpl implements CustomerService {

	@Override
	public Customer getCustomerInfo(String customerId) {
		return new Customer(customerId + ", called by: " + Thread.currentThread().getName());
	}

}
