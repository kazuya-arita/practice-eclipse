package company;

public class AccountingEmployee extends AbsEmployee {
	private String workInCharge;
	
	public AccountingEmployee(int id, String name, String workInCharge) {
		super(id, name, "経理部");
		this.workInCharge = workInCharge;
	}
	
	@Override
	
	public void displayInfo() {
		super.displayBasic();
		System.out.println("担当:" + workInCharge);
	}
}
