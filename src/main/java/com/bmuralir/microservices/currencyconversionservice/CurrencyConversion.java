package com.bmuralir.microservices.currencyconversionservice;

import java.math.BigDecimal;


public class CurrencyConversion {

	//@Id
	private Long id;
	
	//@Column(name="currency_from")
	private String from;
	
	//@Column(name="currency_to")
	private String to;
	
	private BigDecimal quantity;
	private BigDecimal conversionMultiple;	
	private BigDecimal totalCalcuatedamount;
	private String environment;
	
	public CurrencyConversion(Long id, String from, String to, BigDecimal quantity,BigDecimal conversionMultiple, 
			BigDecimal totalCalcuatedamount, String environment) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		this.quantity = quantity;
		this.totalCalcuatedamount = totalCalcuatedamount;
		this.environment = environment;
	}
	
	public CurrencyConversion() {
		super();
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	public BigDecimal getQuantity() {
		return quantity;
	}
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getTotalCalcuatedamount() {
		return totalCalcuatedamount;
	}
	public void setTotalCalcuatedamount(BigDecimal totalCalcuatedamount) {
		this.totalCalcuatedamount = totalCalcuatedamount;
	}
	public String getEnvironment() {
		return environment;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	@Override
	public String toString() {
		return "CurrencyConversion [id=" + id + ", from=" + from + ", to=" + to + ", conversionMultiple="
				+ conversionMultiple + ", quantity=" + quantity + ", totalCalcuatedamount=" + totalCalcuatedamount
				+ ", environment=" + environment + "]";
	} 
	
	
	
}
