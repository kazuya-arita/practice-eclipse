package company;

public abstract class AbsEmployee {
	private int id;
	private String name;
	private String section;
	
	protected AbsEmployee(int id, String name, String section) {
		this.id = id;
		this.name = name;
		this.section = section;
	}
	
	public abstract void displayInfo();
	
	public void displayBasic() {
		System.out.println("ID:" + id);
		System.out.println("名前" + name);
		System.out.println("部署" + section);
	}
}
