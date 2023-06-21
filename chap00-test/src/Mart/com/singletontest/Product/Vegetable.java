package Mart.com.singletontest.Product;

public class Vegetable extends Product {

	private int capacity; /*용량*/

	public Vegetable() {
		super();
	}
	
	/**/
	public Vegetable(String name, int price, int capacity) {
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
		return "Vegetable [capacity=" + capacity + "]";
	}
	
}
