package driver;

import store.AbsProduct;
import store.LimitedProduct;
import store.NomalProduct;
import store.SpecialProduct;

public class Driver {

	public static void main(String[] args) {
		AbsProduct[] product = makeProductList();
		System.out.println("---商品リスト---");
		displayProductList(product);
	}
	
	public static AbsProduct[] makeProductList() {
		AbsProduct[] product = {
		new LimitedProduct("マウス", 2000, 10),
		new SpecialProduct("特価キーボード", 3600, 4500),
		new LimitedProduct("Webカメラ", 3900, 7),
		new NomalProduct("マイク", 2800),
		new SpecialProduct("ディスプレイ", 15000, 20000),
		new NomalProduct("LED照明", 4200)
		};
		return product;
	}

	public static void displayProductList(AbsProduct[] absProd) {
		for (int i = 0; i < absProd.length; i++) {
			System.out.println();
			absProd[i].display();
		}
	}
}
