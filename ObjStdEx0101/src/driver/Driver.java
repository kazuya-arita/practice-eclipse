package driver;

import store.Product;

public class Driver {

	public static void main(String[] args) {
		System.out.println();
		Product.displayStoreName();
		
		System.out.println();
		Product keybord = new Product("キーボード", 0);
		System.out.println("getPrice()の結果:" + keybord.getPrice());
		
		System.out.println();
		System.out.println("---再設定後---");
		
		System.out.println();
		keybord.setPrice(2800);
		keybord.display();
	}

}
