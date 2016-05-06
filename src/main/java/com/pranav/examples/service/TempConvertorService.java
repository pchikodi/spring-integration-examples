package com.pranav.examples.service;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

@Component
public class TempConvertorService implements TempConvertor{

	@ServiceActivator
	public float fahrenheitToCelcius(float fahren) {
		return (fahren - 32) * 5/9;
	}

}
