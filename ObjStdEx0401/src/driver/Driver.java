package driver;

import store.Product;
import store.SpecialProduct;

public class Driver {

	public static void main(String[] args) {
		Product[] products = {
				new Product("マウス", 2000),
				new SpecialProduct("特価キーボード", 3600, 4500)
		};
		
		for (int i = 0; i < products.length; i++) {
			products[i].display();
		}

	}

}
