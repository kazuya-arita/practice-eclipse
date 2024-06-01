
public class Driver {

	public static void main(String[] args) {
		
		SalesEmployee.displayCompany();
		
		SalesEmployee[] se = {
				new SalesEmployee("速水", 1000000),
				new SalesEmployee("河合"),
				new SalesEmployee("鈴木", 850000),
				new SalesEmployee("佐藤", 1200000)
		};
		
		int total = 0;
		for (int i = 0; i < se.length; i++) {
			System.out.println();
			se[i].displayInfo();
			total += se[i].salesAmt;
		}
		
		System.out.println("----集計値----");
		System.out.println("【合計】" + total + "円");
		System.out.println("【平均】" + total / se.length + "円");
	}

}