
public class Driver {

	public static void main(String[] args) {
		Product.displayStoreName();
		
		Product[] prod = {
			new Product("マウス", 2000),
			new Product("キーボード", 3600),
			new Product("Webカメラ", 3900),
			new Product("マイク", 2800),
			new Product("ディスプレイ", 15000),
			new Product("LED照明", 4200)
		};
		
		for (int i = 0; i < prod.length; i++) {
			prod[i].display();
		}
		
		for (int i = 0; i < prod.length; i++) {
			prod[i].down();
		}
		
		System.out.println("***一斉値下げ後***");
		
		for (int i = 0; i < prod.length; i++) {
			prod[i].display();
		}
	}

}
