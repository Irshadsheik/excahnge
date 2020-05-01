package com.microservices.excahnge.exchangeservice.service;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import com.microservices.excahnge.exchangeservice.controller.Exchange;

public class ExchangeService {
	static List<Exchange> list;
	static {
		list = Arrays.asList(
				new Exchange(1L, "USD", "INR", BigDecimal.valueOf(65)),
				new Exchange(2L, "EURO", "INR", BigDecimal.valueOf(75)),
				new Exchange(3L, "ASD", "INR", BigDecimal.valueOf(25)));
	}

	public Exchange findByFomAndTo(String from, String to) {
		Exchange exchange1=null;
		for (Exchange exchange : list) {
			if (exchange.getFrom().equals(from)& exchange.getTo().equals(to)) {
				exchange1=exchange;
				break;
							
			} 
		    if (exchange.getFrom().equals(from) & exchange.getTo().equals(to)) {
		    	exchange1=exchange;
		    	break;
			} 
		    if (exchange.getFrom().equals("from")& exchange.getTo().equals("to")) {
		    	exchange1=exchange;
		    	break;
			}

		}
		return exchange1;

	}
}
