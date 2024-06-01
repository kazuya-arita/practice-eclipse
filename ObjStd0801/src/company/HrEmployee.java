package company;

public class HrEmployee extends AbsEmployee implements ExtPrintable {
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
	
	@Override
	public void print() {
		super.displayBasic();
		System.out.println("--->外部連絡書類を印刷しました。");
	}

}
