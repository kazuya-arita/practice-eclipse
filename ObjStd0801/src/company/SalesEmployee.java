package company;

public class SalesEmployee extends AbsEmployee implements ExtPrintable {
	private int salesAmt;
	
	public SalesEmployee(int id, String name, int salesAmt) {
		super(id, name, "営業部");
		this.salesAmt = salesAmt;
	}
	
	@Override
	
	public void displayInfo() {
		super.displayBasic();
		System.out.println("売上:" + salesAmt + "円");
	}
	
	@Override
	
	public void print() {
		super.displayBasic();
		System.out.println("-->請求書を印刷しました。");
	}

}
