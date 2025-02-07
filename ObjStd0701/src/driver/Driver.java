package driver;

import company.AbsEmployee;
import company.AccountingEmployee;
import company.HrEmployee;
import company.LogisticEmployee;
import company.PlanningEmployee;
import company.SalesEmployee;

public class Driver {

	public static void main(String[] args) {
		AbsEmployee[] emp = makeEmployeeList();
		displayEmployeeList(emp);
	}
	
	public static AbsEmployee[] makeEmployeeList() {
		AbsEmployee[] emp = {
				new SalesEmployee(1234, "速水", 1000000),
				new PlanningEmployee(3333, "佐藤", 10, 2),
				new AccountingEmployee(5555, "山本", "賃金計算"),
				new LogisticEmployee(7777, "西田", 2800000, 3300000),
				new HrEmployee(9999, "安藤", "採用")
		};
		return emp;
	}
	
	public static void displayEmployeeList( AbsEmployee[] absEmployee) {
		for (int i = 0; i < absEmployee.length; i++) {
			System.out.println();
			absEmployee[i].displayInfo();
		}	
	}

}
