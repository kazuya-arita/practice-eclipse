package store;

public class LimitedProduct extends AbsProduct {
	private int dayCnt;
	
	public LimitedProduct(String name, int price, int dayCnt) {
		super(name, price);
		this.dayCnt = dayCnt;
	}
	
	public int minusDay(int minus) {
		return dayCnt; 
	}
	
	public void display() {
		System.out.println(name + ":" + price + "円" + "(配送不可)(残り:" + dayCnt + "日)");
	}
}
