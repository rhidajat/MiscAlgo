package com.rheezy.practice.design;

public class Reservation {
	
	private Long id;
	private Table table;
	private Customer customer;
	private Integer startTime;
	
	public Reservation(Table table, Customer customer, Integer startTime) {
		this.table = table;
		this.customer = customer;
		this.startTime = startTime;
	}

	public Long getId() {
		return id;
	}

	public Table getTable() {
		return table;
	}

	public Customer getCustomer() {
		return customer;
	}

	public Integer getStartTime() {
		return startTime;
	}
	
}
