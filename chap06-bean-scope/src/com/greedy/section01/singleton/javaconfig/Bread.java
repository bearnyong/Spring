package com.greedy.section01.singleton.javaconfig;

import com.greedy.section01.singleton.javaconfig.Product;

public class Bread extends Product {
	
	private int capacity;

	public Bread() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bread(String name, int price, int capacity) {
		super(name, price);
		this.capacity = capacity;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Bread [capacity=" + capacity + "]";
	}
	
}
