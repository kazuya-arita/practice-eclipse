package driver;

import company.Employee;
import company.SalesEmployee;

public class Driver {

	public static void main(String[] args) {
		Employee[] emp = {
				new Employee(1000, "田中"),
				new SalesEmployee(1234, "速水", 1000000) //アップキャスト
		};
		
		for (int i = 0; i < emp.length; i++) {
			System.out.println();
			emp[i].displayInfo();
		}
		
	}

}
