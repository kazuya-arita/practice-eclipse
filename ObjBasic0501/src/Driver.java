
public class Driver {

	public static void main(String[] args) {
		
		SalesEmployee hayami = new SalesEmployee("速水", 1000000);
		System.out.println();
		hayami.displayInfo();
		
		hayami.sell(300000);
		System.out.println();
		hayami.displayInfo();
		
		hayami.sell();
		System.out.println();
		hayami.displayInfo();
		
	}

}
