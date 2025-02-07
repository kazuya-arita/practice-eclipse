package driver;

import company.AbsEmployee;
import company.AccountingEmployee;
import company.ExtPrintable;
import company.HrEmployee;
import company.LogisticEmployee;
import company.PlanningEmployee;
import company.SalesEmployee;
import company.Shippable;

public class Driver {

	public static void main(String[] args) {
		AbsEmployee[] emp = makeEmployeeList();
		
		System.out.println("\n***********社員情報************");
		displayEmployeeList(emp);
		
		ExtPrintable[] prtEmp = getExtPrintable(emp);
		
		System.out.println("\n********* 印刷処理 **********");
		printAll(prtEmp);
		
		Shippable[] shipEmp = getShippable(emp);
		
		System.out.println("\n********* 出荷処理 **********");
		shipAll(shipEmp);
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
	
	static ExtPrintable[] getExtPrintable(AbsEmployee[] abs) {
		ExtPrintable[] prtEmp = new ExtPrintable[abs.length];
		int pCnt = 0;
		for(int i = 0; i < abs.length; i++) {
			if (abs[i] instanceof ExtPrintable) {
				prtEmp[pCnt] = (ExtPrintable) abs[i];
				pCnt++;
			}
		}
		return prtEmp;
	}
	
	static void printAll(ExtPrintable[] prt) {
		for (int i = 0; i < prt.length; i++) {
			if (prt[i] == null) {
				break;
			}
			System.out.println();
			prt[i].print();
		}
	}
	
	static Shippable[] getShippable(AbsEmployee[] abs) {
		Shippable[] ship = new Shippable[abs.length];
		int sCnt = 0;
		for (int i = 0; i < abs.length; i++) {
			if (abs[i] instanceof Shippable) {
				ship[sCnt] = (Shippable) abs[i];
				sCnt++;
			}
		}
		return ship;
	}
	
	static void shipAll(Shippable[] ship) {
		for (int i = 0; i < ship.length; i++) {
			if (ship[i] == null) {
				break;
			}
			System.out.println();
			ship[i].ship();
		}
	}
	

}
