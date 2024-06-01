
public class Product {
	static String STORE_NAME = "速水PC販売店";
	static int instanceCnt = 0;
	
	String name;
	int price;
	
	Product(String name, int price) {
		this.name = name;
		this.price = price;
		instanceCnt++;
	}
	
	static void displayStoreName() {
		System.out.println("■店舗名:" + STORE_NAME);
	}
	
	int up(int amt) {
		return price += amt;
	}
	
	int down(int amt) {
		return price -= amt;
	}
	
	void display() {
		System.out.println(name + ":" + price + "円");
	}
}
