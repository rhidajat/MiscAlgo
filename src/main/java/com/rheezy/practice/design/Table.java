package com.rheezy.practice.design;

public class Table {

	private Long id;
	private Integer size;
	
	public Table(Long id, Integer size) {
		this.id = id;
		this.size = size;
	}

	public Long getId() {
		return id;
	}

	public Integer getSize() {
		return size;
	}
	
}
