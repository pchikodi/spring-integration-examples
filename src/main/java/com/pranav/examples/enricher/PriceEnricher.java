/**
 * 
 */
package com.pranav.examples.enricher;

import org.springframework.messaging.Message;

import com.pranav.examples.pojo.Price;

/**
 * @author chikodipranav@gmail.com
 *
 */
public class PriceEnricher {

	public Price enrichHeader(Message m) {
		Price p = (Price) m.getPayload();
		p.setInstrument("IBM");
		p.setPrice(111.11);
		return p;
	}
}
