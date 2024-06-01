package store;

public class SpecialProduct extends AbsProduct {
	private int orgPrice;

	public SpecialProduct(String name, int price, int orgPrice) {
		super(name, price);
		this.orgPrice = orgPrice;
	}
	
	public void display() {
		System.out.println(name + ":" + price + "円" + "(定価:" + orgPrice + "円)");
	}
}
