package company;

public class SalesEmployee {
	
	private static String COMPANY_NAME = "山田商事";
	private static int DEFAULT_SALES_AMT = 150000;
	
	private String name;
	private int salesAmt;
	
	public SalesEmployee(String name, int salesAmt) {
		this.name = name;
		this.salesAmt = salesAmt;
	}
	
	public SalesEmployee(String name) {
		this(name, 0) ;
	}
	
	public int getSalesAmt() {
		return salesAmt;
	}

	public void setSalesAmt(int salesAmt) {
		if (salesAmt >= 0) {
			this.salesAmt = salesAmt;
		} else {
			System.out.println("\n-->マイナスは設定できません。0を設定します。");
			this.salesAmt = 0;
		}
		
	}

	public void displayCompany() {
		System.out.println("■会社名:" + COMPANY_NAME);
	}
	
	public int sell(int amt) {
		return salesAmt += amt;
	}
	
	public int sell() {
		return this.sell(DEFAULT_SALES_AMT);
	}
	
	public int refund(int amt) {
		return salesAmt -= amt;
	}
	
	public void displayInfo() {
		System.out.println("名前:" + name);
		System.out.println("売上:" + salesAmt + "円");
	}
 
}
