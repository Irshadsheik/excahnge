package com.microservices.excahnge.exchangeservice.controller;

import java.math.BigDecimal;

;
public class Exchange {
	private long id;
	private String from;
	private String to;
	private BigDecimal conversionMultiple;
	private int port;

	public Exchange() {
	}
	

	public Exchange(long id, String from, String to,
			BigDecimal conversionMultiple) {
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}


	public int getPort() {
		return port;
	}


	public void setPort(int port) {
		this.port = port;
	}


	@Override
	public String toString() {
		return "Exchange [id=" + id + ", from=" + from + ", to=" + to
				+ ", conversionMultiple=" + conversionMultiple + ", port="
				+ port + "]";
	}
	

}
