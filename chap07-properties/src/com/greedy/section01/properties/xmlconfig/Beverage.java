package com.greedy.section01.properties.xmlconfig;

public class Beverage extends Product {
	
	private int capacity;

	public Beverage() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Beverage(String name, int price, int capacity) {
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
		return "Beverage [capacity=" + capacity + "]";
	}
	
}
