package store;

public class NomalProduct extends AbsProduct implements Deliverable {
	public NomalProduct(String name, int price) {
		super(name, price);
	}
	
	public void display() {
		System.out.println(name + ":" + price + "円");
	}
	
	@Override
	public void displayDeliv() {
		System.out.println("【通常送料500円】 " + name + ":" + price + "円");
	}
	
}
