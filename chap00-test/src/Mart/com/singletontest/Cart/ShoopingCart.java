package Mart.com.singletontest.Cart;

import java.util.ArrayList;
import java.util.List;

import Mart.com.singletontest.Product.Product;

public class ShoopingCart {
	
	private final List<Product> items;
	
	public ShoopingCart() {
		this.items = new ArrayList<>();
	}
	
	/**/
	public void addItem(Product item) {
		this.items.add(item);
	}

	
	public void getItems() {
		for (Product product : items) {
			System.out.println(product.getName());
		}
	}
	
	public void priceItems() {
		int result = 0;
		for (Product product : items) {
			result += product.getPrice();
		}
		System.out.println(result);
	}

	@Override
	public String toString() {
		return "ShoopingCart [items=" + items + "]";
	}
	
}
