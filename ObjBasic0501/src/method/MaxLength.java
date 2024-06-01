package method;

public class MaxLength {
	
	 static String getMaxString(String[] array) {
		String text = array[0];
		int textbox = array[0].length();
		
		for (int i = 1; i < array.length; i++) {
			if (textbox <= array[i].length()) {
				textbox = array[i].length();
				text = array[i];
			} 
		}
		System.out.println(text);
		return text;
	}

	public static void main(String[] args) {
		String[] arrayList = {"あいうえお", "かき", "くけこ", "さしすせそ", "たちつてとな"};
		
		getMaxString(arrayList);

	}

}
