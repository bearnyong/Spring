package Mart.com.singletontest.Product;

public class Meat extends Product {
	
	private int capacity; /*용량*/

	public Meat() {
		super();
	}
	
	/**/
	public Meat(String name, int price, int capacity) {
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
		return "Meat [capacity=" + capacity + "]";
	}
	
}
