/**
 * 
 */
package com.pranav.examples.filter;

import org.springframework.messaging.Message;

import com.pranav.examples.pojo.Trade;

/**
 * @author chikodipranav@gmail.com
 *
 */
public class TradeFilter {

	public boolean isNewTrade(Message<?> message) {
		Trade trade = (Trade) message.getPayload();
		return (trade.getStatus().equalsIgnoreCase("new"));
	}

}
