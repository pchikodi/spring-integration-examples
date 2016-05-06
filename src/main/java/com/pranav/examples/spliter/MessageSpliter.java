/**
 * 
 */
package com.pranav.examples.spliter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.messaging.Message;

/**
 * @author chikodipranav@gmail.com
 *
 */
public class MessageSpliter {

	public List<String> splitMessages(Message<?> message) {
		List<String> messages = new ArrayList<String>(0);
		String payload = (String) message.getPayload();
		messages.addAll(Arrays.asList(payload.split(";")));
		return messages;
	}
}
