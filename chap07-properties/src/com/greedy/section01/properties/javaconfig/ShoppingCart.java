package com.greedy.section01.properties.javaconfig;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	private final List<Product> items;

	public ShoppingCart() {
		this.items = new ArrayList<>();
	}
	
	/**/
	public void addItem(Product item) {
		items.add(item);
	}
	
	public void getItem(String name) {
		System.out.println("==========구매내역==========");
		System.out.println("구매자 : " + name);
		
		for (Product product : items) {
			System.out.println(product.getName());
		}
	}

	public ShoppingCart(List<Product> items) {
		super();
		this.items = items;
	}


	@Override
	public String toString() {
		return "ShoppingCart [items=" + items + "]";
	}
	
}
