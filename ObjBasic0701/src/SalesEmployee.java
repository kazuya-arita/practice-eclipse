
public class SalesEmployee {
	static final String COMPANY_NAME = "山田商事";
	static final int DEFAULT_SALES_AMT = 150000;
	
	String name;
	int salesAmt;
	

	SalesEmployee(String name, int salesAmt) {
		this.name = name;
		this.salesAmt = salesAmt;
	}
	
	SalesEmployee(String name) {
		this(name, 0);
	}
	
	static void displayCompany() {
		System.out.println("会社名:" + COMPANY_NAME);
	}

	int sell(int amt) {
		return salesAmt += amt;
	}
	
	int sell() {
		return this.sell(DEFAULT_SALES_AMT);
	}
	
	int refund(int amt) {
		return salesAmt -= amt;
	}
	
	void displayInfo() {
		System.out.println("名前:" + name);
		System.out.println("売上:" + salesAmt + "円");
	}
}
