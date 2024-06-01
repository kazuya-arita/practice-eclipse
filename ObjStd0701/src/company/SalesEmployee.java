package company;

public class SalesEmployee extends AbsEmployee {
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
	

}
