
public class Driver {

	public static void main(String[] args) {
		Product.displayStoreName();
		
		Product prod = new Product("キーボード", 4000);		
		prod.display();
		
		Product prod2 = new Product("マウス");
		prod2.display();
		
		System.out.println("----価格再設定後----");
		
		prod.down();
		prod2.up(2000);
		prod.display();
		prod2.display();	
	}

}
