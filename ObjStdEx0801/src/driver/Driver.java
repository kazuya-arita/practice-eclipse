package driver;

import store.AbsProduct;
import store.Deliverable;
import store.LimitedProduct;
import store.NomalProduct;
import store.SpecialProduct;

public class Driver {

	public static void main(String[] args) {
		AbsProduct[] product = makeProductList();
		System.out.println("---商品リスト---");
		displayProductList(product);
		Deliverable[] deli = getDeliverable(product);
		System.out.println("---配送可能商品---");
		displayDelivList(deli);
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
	
	public static Deliverable[] getDeliverable(AbsProduct[] prod) {
		Deliverable[] deli = new Deliverable[prod.length];
		int dCnt = 0;
		for (int i = 0; i < prod.length; i++) {
			if (prod[i] instanceof Deliverable) {
				deli[dCnt] = (Deliverable) prod[i];
				dCnt++;
			}
		}
		return deli;
	}
	
	public static void displayDelivList(Deliverable[] deliv) {
		for (int i = 0; i < deliv.length; i++) {
			if (deliv[i] == null) {
				break;
			}
			System.out.println();
			deliv[i].displayDeliv();
		}
	}
}
