
public class SalesEmployee {
	String name;
	int salesAmt;
	
	int sell(int amt) {
		return salesAmt += amt;
	}
	
	int refund(int amt) {
		return salesAmt -= amt;
	}
	
	void displayInfo() {
		System.out.println("名前:" + name);
		System.out.println("売上:" + salesAmt + "円");
	}
}
