package company;

public class PlanningEmployee extends AbsEmployee {
	private int planningCnt;
	private int okCnt;
	
	public PlanningEmployee(int id, String name, int planningCnt, int okCnt) {
		super(id, name, "企画部");
		this.planningCnt = planningCnt;
		this.okCnt = okCnt;
	}
	
	@Override
	public void displayInfo() {
		super.displayBasic();
		System.out.println("企画数:" + planningCnt);
		System.out.println("採用数:" + okCnt);
	}
}
