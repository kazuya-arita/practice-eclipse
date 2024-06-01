package company;

public class SalesEmployee extends Employee {
	private int salesAmt;
	
	public int getSalesAmt() {
		return salesAmt;
	}
	
	public void setSalesAmt(int salesAmt) {
		if (0 <= salesAmt) {
			this.salesAmt = salesAmt;
		} else {
			System.out.println("\n-->マイナス設定はできません。0を設定します。");
			this.salesAmt = 0;
		}
	}
	
	public int sell(int amt) {
		return salesAmt += amt;
	}
	
	public int refund(int amt) {
		return salesAmt -= amt;
	}
	
	public void displaySalesAmt() {
		System.out.println("売上:" + salesAmt + "円");
	}
}
