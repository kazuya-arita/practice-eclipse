package company;

public class HrEmployee extends AbsEmployee {
	private String workInCharge;
	
	public HrEmployee(int id, String name, String workInCharge) {
		super(id, name, "人事部");
		this.workInCharge = workInCharge;
	}
	
	@Override
	
	public void displayInfo() {
		super.displayBasic();
		System.out.println("担当:" + workInCharge);
	}
}
