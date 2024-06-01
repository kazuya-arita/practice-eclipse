
public class Driver {

	public static void main(String[] args) {
		SalesEmployee hayami = new SalesEmployee();
		hayami.name = "速水";
		hayami.salesAmt = 1000000;
		System.out.println();
		hayami.displayInfo();
		
		SalesEmployee kawai = new SalesEmployee();
		kawai.name = "河合";
		kawai.salesAmt = 500000;
		System.out.println();
		kawai.displayInfo();
		
		hayami.refund(200000);
		kawai.sell(200000);
		
		System.out.println("\n------返品・売上処理後-----\n");
		hayami.displayInfo();
		System.out.println();
		kawai.displayInfo();
		
		System.out.println("\n2人の売上合計:" + (hayami.salesAmt + kawai.salesAmt) + "円");
	}

}
