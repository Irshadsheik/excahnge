package com.microservices.excahnge.exchangeservice.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.excahnge.exchangeservice.service.ExchangeService;

import reactor.core.publisher.Mono;

@RestController
public class ExchangeController {
	@Autowired
	private Environment env;
	@GetMapping("/exchange/from/{from}/to/{to}")
	public Exchange retrieveValue(@PathVariable String from,@PathVariable String to){
		System.out.println(from+"................"+to);
		ExchangeService service=new ExchangeService();
		Exchange ex=service.findByFomAndTo(from, to);
		//ex.setPort(env.getp);
		ex.setPort(Integer.parseInt(env.getProperty("local.server.port")));
		return ex;
		//return Mono.just(ex);
		
	}

}
