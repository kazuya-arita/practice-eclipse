package driver;

import company.SalesEmployee;

public class Driver {

	public static void main(String[] args) {
		SalesEmployee kawai = new SalesEmployee("河合");
		
		System.out.println("\n---インスタンス作成済み----\n");
		
		System.out.println("getSalesAmt()参照の結果:" + kawai.getSalesAmt());
		
		kawai.setSalesAmt(5000000);
		
		System.out.println();
		kawai.displayInfo();
	}
}
