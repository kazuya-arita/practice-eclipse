package store;

public abstract class AbsProduct {
	public String name;
	public int price;
	
	protected AbsProduct(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public abstract void display();
	
	protected String getNameAndPrice() {
		return (name + ":" + price + "円");
	}
}
