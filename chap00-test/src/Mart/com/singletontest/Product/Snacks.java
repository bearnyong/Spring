package Mart.com.singletontest.Product;

public class Snacks extends Product {

	private int capacity; /*용량*/

	public Snacks() {
		super();
	}
	
	/**/
	public Snacks(String name, int price, int capacity) {
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
		return "Snacks [capacity=" + capacity + "]";
	}
	
}
