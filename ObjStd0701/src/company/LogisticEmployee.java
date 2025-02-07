package company;

public class LogisticEmployee extends AbsEmployee {
	private int purchaseTotal;
	private int deliveryTotal;
	
	public LogisticEmployee(int id, String name, int purchaseTotal, int deliveryTotal) {
		super(id, name, "物流部");
		this.purchaseTotal = purchaseTotal;
		this.deliveryTotal = deliveryTotal;
	}
	
	public void displayInfo() {
		super.displayBasic();
		System.out.println("仕入れ商品原価:" + purchaseTotal + "円");
		System.out.println("出荷商品原価:" + deliveryTotal + "円");
	}
}
